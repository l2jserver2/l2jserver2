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
package com.l2jserver.model.template;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.l2jserver.model.id.template.ItemTemplateID;
import com.l2jserver.model.template.calculator.ItemSetActorCalculator;
import com.l2jserver.model.template.item.ArmorType;
import com.l2jserver.model.template.item.ItemMaterial;
import com.l2jserver.model.template.item.ItemType;
import com.l2jserver.model.template.item.WeaponType;
import com.l2jserver.model.world.Item;
import com.l2jserver.model.world.actor.stat.StatType;
import com.l2jserver.util.jaxb.ItemTemplateIDAdapter;

/**
 * Template for an {@link Item}
 * 
 * @author <a href="http://www.rogiel.com">Rogiel</a>
 */
@XmlRootElement(name = "item")
@XmlType(namespace = "item")
@XmlAccessorType(XmlAccessType.FIELD)
public class ItemTemplate extends AbstractTemplate<Item> {
	/**
	 * The logger
	 */
	private static final Logger log = LoggerFactory
			.getLogger(ItemTemplate.class);

	@XmlAttribute(name = "id")
	@XmlJavaTypeAdapter(ItemTemplateIDAdapter.class)
	protected ItemTemplateID id;

	@XmlAttribute(name = "name")
	protected String name;
	@XmlElement(name = "weight")
	protected int weight = 0;
	@XmlElement(name = "price")
	protected int price = 0;
	@XmlElement(name = "icon")
	protected String icon;
	@XmlElement(name = "effect")
	protected EffectContainer effect;

	@XmlType(namespace = "item")
	private static class EffectContainer {
		@XmlAttribute(name = "type")
		protected EffectType effect;
	}

	@XmlType(namespace = "item")
	protected static class StatsContainer {
		@XmlElement(name = "physicalDamage")
		protected StatAttribute physicalDamage;
		@XmlElement(name = "magicalDamage")
		protected StatAttribute magicalDamage;
		@XmlElement(name = "criticalChance")
		protected StatAttribute criticalChance;
		@XmlElement(name = "physicalAttackSpeed")
		protected StatAttribute physicalAttackSpeed;
	}

	@XmlElement(name = "stats")
	protected StatsContainer stats;

	protected ItemMaterial material;

	public enum EffectType {
		IMMEDIATE;
	}

	protected ItemType itemType = ItemType.NONE;
	protected WeaponType weaponType = WeaponType.NONE;
	protected ArmorType armorType = ArmorType.NONE;

	@XmlType(namespace = "item")
	public static class StatAttribute {
		@XmlElement(name = "set")
		protected StatSet set;

		public static class StatSet {
			@XmlAttribute(name = "order")
			protected int order;
			@XmlValue
			protected double value;

			/**
			 * @return the order
			 */
			public int getOrder() {
				return order;
			}

			/**
			 * @return the value
			 */
			public double getValue() {
				return value;
			}
		}

		/**
		 * @return the set
		 */
		public StatSet getSet() {
			return set;
		}
	}

	@Override
	public Item create() {
		log.debug("Creating a new Item instance with template {}", this);
		return new Item(id);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @return the immediateEffect
	 */
	public EffectType getEffectType() {
		return effect.effect;
	}

	/**
	 * @return the material
	 */
	public ItemMaterial getMaterial() {
		return material;
	}

	/**
	 * @return the physical damage
	 */
	public ItemSetActorCalculator getPhysicalDamage() {
		if (stats == null)
			return null;
		if (stats.physicalDamage == null)
			return null;
		return new ItemSetActorCalculator(stats.physicalDamage.set,
				StatType.POWER_ATTACK);
	}

	/**
	 * @return the magical damage
	 */
	public ItemSetActorCalculator getMagicalDamage() {
		if (stats == null)
			return null;
		if (stats.magicalDamage == null)
			return null;
		return new ItemSetActorCalculator(stats.magicalDamage.set,
				StatType.MAGIC_ATTACK);
	}

	/**
	 * @return the magical damage
	 */
	public ItemSetActorCalculator getCriticalChance() {
		if (stats == null)
			return null;
		if (stats.criticalChance == null)
			return null;
		return new ItemSetActorCalculator(stats.criticalChance.set,
				StatType.CRITICAL_RATE);
	}

	@Override
	public ItemTemplateID getID() {
		return id;
	}
}
