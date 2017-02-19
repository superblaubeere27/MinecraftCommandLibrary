package me.superblaubeere27.minecraft.generators.entities;

import net.minecraft.nbt.NBTTagCompound;

public class EntityGhast extends Entity {
	private int explostionPower;

	@Override
	public String toString() {
		return String.format("EntityGhast [explostionPower=%s, toString()=%s]", explostionPower, super.toString());
	}

	public int getExplostionPower() {
		return explostionPower;
	}

	public void setExplostionPower(int explostionPower) {
		this.explostionPower = explostionPower;
	}

	@Override
	public String getName() {
		return "ghast";
	}

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		explostionPower = tag.getInteger("ExplosionPower");
	}
	@Override
	public NBTTagCompound writeToNBT() {
		NBTTagCompound tag = super.writeToNBT();
		tag.setInteger("ExplosionPower", explostionPower);
		return tag;
	}
}
