package com.l2jserver.model.world;

import com.l2jserver.model.id.object.CharacterID;
import com.l2jserver.model.id.template.ItemTemplateID;
import com.l2jserver.model.world.capability.Listenable;
import com.l2jserver.model.world.capability.Playable;
import com.l2jserver.model.world.capability.Spawnable;
import com.l2jserver.model.world.item.ItemEvent;
import com.l2jserver.model.world.item.ItemListener;
import com.l2jserver.util.Coordinate;

public class Item extends AbstractObject implements Playable, Spawnable,
		Listenable<ItemListener, ItemEvent> {
	private final ItemTemplateID templateID;
	private CharacterID ownerID;

	public Item(ItemTemplateID templateID) {
		this.templateID = templateID;
	}

	@Override
	public void spawn(Coordinate coordinate) {

	}

	@Override
	public boolean isSpawned() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Coordinate getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPosition(Coordinate coord) {

	}

	/**
	 * @return the templateID
	 */
	public ItemTemplateID getTemplateID() {
		return templateID;
	}

	/**
	 * @return the ownerID
	 */
	public CharacterID getOwnerID() {
		return ownerID;
	}

	/**
	 * @param ownerID
	 *            the ownerID to set
	 */
	public void setOwnerID(CharacterID ownerID) {
		this.ownerID = ownerID;
	}
}
