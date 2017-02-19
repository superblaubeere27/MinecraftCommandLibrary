package me.superblaubeere27.minecraft.generators.entities;

import net.minecraft.nbt.NBTTagCompound;

public class EntityEndermite extends Entity {
	private boolean playerSpawned;
	private int lifetime;
	
	@Override
	public String getName() {
		return "endermite";
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		lifetime = tag.getInteger("Lifetime");
		playerSpawned = tag.getBoolean("PlayerSpawned");
	}
	@Override
	public NBTTagCompound writeToNBT() {
		NBTTagCompound tag = super.writeToNBT();
		tag.setBoolean("PlayerSpawned", playerSpawned);
		tag.setInteger("Lifetime", lifetime);
		return tag;
	}

	@Override
	public String toString() {
		return String.format("EntityEndermite [playerSpawned=%s, lifetime=%s, toString()=%s]", playerSpawned, lifetime,
				super.toString());
	}
}
