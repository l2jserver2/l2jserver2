/*
 * This file is part of l2jserver <l2jserver.com>.
 *
 * l2jserver is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * l2jserver is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with l2jserver.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.service.database;

import java.sql.ResultSet;

import com.google.inject.Injector;
import com.l2jserver.model.Model;
import com.l2jserver.model.id.ID;
import com.l2jserver.service.AbstractService.Depends;
import com.l2jserver.service.cache.CacheService;
import com.l2jserver.service.configuration.ConfigurationService;
import com.l2jserver.service.core.LoggingService;
import com.l2jserver.service.core.threading.ThreadService;

/**
 * This is an implementation of {@link DatabaseService} that provides an layer
 * to JDBC.
 * 
 * <h1>Internal specification</h1> <h2>The
 * {@link com.l2jserver.service.database.AbstractJDBCDatabaseService.Query
 * Query} object</h2>
 * 
 * If you wish to implement a new {@link DataAccessObject} you should try not
 * use {@link com.l2jserver.service.database.AbstractJDBCDatabaseService.Query
 * Query} object directly because it only provides low level access to the JDBC
 * architecture. Instead, you could use an specialized class, like
 * {@link com.l2jserver.service.database.AbstractJDBCDatabaseService.InsertUpdateQuery
 * InsertUpdateQuery} ,
 * {@link com.l2jserver.service.database.AbstractJDBCDatabaseService.SelectListQuery
 * SelectListQuery} or
 * {@link com.l2jserver.service.database.AbstractJDBCDatabaseService.SelectSingleQuery
 * SelectSingleQuery} . If you do need low level access, feel free to use the
 * {@link com.l2jserver.service.database.AbstractJDBCDatabaseService.Query
 * Query} class directly.
 * 
 * <h2>The
 * {@link com.l2jserver.service.database.AbstractJDBCDatabaseService.Mapper
 * Mapper} object</h2>
 * 
 * The {@link com.l2jserver.service.database.AbstractJDBCDatabaseService.Mapper
 * Mapper} object maps an JDBC {@link ResultSet} into an Java {@link Object}.
 * All {@link Model} objects support
 * {@link com.l2jserver.service.database.AbstractJDBCDatabaseService.CachedMapper
 * CachedMapper} that will cache result based on its {@link ID} and always use
 * the same object with the same {@link ID}.
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
@Depends({ LoggingService.class, CacheService.class,
		ConfigurationService.class, ThreadService.class })
public class LoginServerJDBCDatabaseService extends AbstractJDBCDatabaseService
		implements DatabaseService {
	/**
	 * The Google Guice {@link Injector}. It is used to get DAO instances.
	 */
	@SuppressWarnings("unused")
	private final Injector injector;

	/**
	 * @param configService
	 *            the config service
	 * @param injector
	 *            the Guice {@link Injector}
	 * @param cacheService
	 *            the cache service
	 * @param threadService
	 *            the thread service
	 */
	public LoginServerJDBCDatabaseService(ConfigurationService configService,
			Injector injector, CacheService cacheService,
			ThreadService threadService) {
		super(configService, cacheService, threadService);
		this.injector = injector;
	}

	@Override
	public <M extends Model<I>, I extends ID<M>> DataAccessObject<M, I> getDAO(
			Class<M> model) {
		// TODO
		return null;
	}
}
