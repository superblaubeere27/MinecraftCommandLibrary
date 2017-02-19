package me.superblaubeere27.minecraft.generators.entities;

import net.minecraft.nbt.NBTTagCompound;

public class EntityZombie extends Entity {
	private boolean baby;
	private int zombieType;
	private int conversationTime;
	private boolean canBreakDoors;
	
	@Override
	public String getName() {
		return "zombie";
	}

	public boolean isBaby() {
		return baby;
	}

	public void setBaby(boolean baby) {
		this.baby = baby;
	}

	@Override
	public String toString() {
		return String.format(
				"EntityZombie [baby=%s, zombieType=%s, conversationTime=%s, canBreakDoors=%s, toString()=%s]", baby,
				zombieType, conversationTime, canBreakDoors, super.toString());
	}

	public int getZombieType() {
		return zombieType;
	}

	public void setZombieType(int zombieType) {
		this.zombieType = zombieType;
	}

	public int getConversationTime() {
		return conversationTime;
	}

	public void setConversationTime(int conversationTime) {
		this.conversationTime = conversationTime;
	}

	public boolean isCanBreakDoors() {
		return canBreakDoors;
	}

	public void setCanBreakDoors(boolean canBreakDoors) {
		this.canBreakDoors = canBreakDoors;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		baby = tag.getBoolean("IsBaby");
		zombieType = tag.getInteger("ZombieType");
		conversationTime = tag.getInteger("ConversionTime");
		canBreakDoors = tag.getBoolean("CanBreakDoors");
	}
	@Override
	public NBTTagCompound writeToNBT() {
		NBTTagCompound tag = super.writeToNBT();
		if(baby) {
			tag.setBoolean("IsBaby", baby);
		}
		if(canBreakDoors) {
			tag.setBoolean("CanBreakDoors", canBreakDoors);
		}
		if(conversationTime != 0 && conversationTime != -1) {
			tag.setInteger("ConversionTime", conversationTime);
		}
		return tag;
	}
	
}
