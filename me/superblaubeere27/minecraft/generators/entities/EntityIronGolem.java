package me.superblaubeere27.minecraft.generators.entities;

import net.minecraft.nbt.NBTTagCompound;

public class EntityIronGolem extends Entity {
	private boolean playerCreated;

	@Override
	public String getName() {
		return "villager_golem";
	}

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		playerCreated = tag.getBoolean("PlayerCreated");
	}

	public boolean isPlayerCreated() {
		return playerCreated;
	}

	public void setPlayerCreated(boolean playerCreated) {
		this.playerCreated = playerCreated;
	}

	@Override
	public String toString() {
		return String.format("EntityIronGolem [playerCreated=%s, toString()=%s]", playerCreated, super.toString());
	}

	@Override
	public NBTTagCompound writeToNBT() {
		NBTTagCompound tag = super.writeToNBT();
		tag.setBoolean("PlayerCreated", playerCreated);
		return tag;
	}
}
