package me.superblaubeere27.minecraft.generators.entities;

import net.minecraft.nbt.NBTTagCompound;

public class EntityGuardian extends Entity {
	private boolean elder;

	@Override
	public String getName() {
		return "guardian";
	}

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		elder = tag.getBoolean("Elder");
	}

	@Override
	public NBTTagCompound writeToNBT() {
		NBTTagCompound tag = super.writeToNBT();
		tag.setBoolean("Elder", elder);
		return tag;
	}

	@Override
	public String toString() {
		return String.format("EntityGuardian [elder=%s, toString()=%s]", elder, super.toString());
	}

	public boolean isElder() {
		return elder;
	}

	public void setElder(boolean elder) {
		this.elder = elder;
	}
}
