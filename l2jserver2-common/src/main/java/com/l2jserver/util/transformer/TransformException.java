/*
 * This file is part of l2jserver2 <l2jserver2.com>.
 *
 * l2jserver2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * l2jserver2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with l2jserver2.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.util.transformer;

/**
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 * 
 */
public class TransformException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public TransformException() {
	}

	/**
	 * @param message
	 *            the message
	 */
	public TransformException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 *            the cause
	 */
	public TransformException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public TransformException(String message, Throwable cause) {
		super(message, cause);
	}
}
