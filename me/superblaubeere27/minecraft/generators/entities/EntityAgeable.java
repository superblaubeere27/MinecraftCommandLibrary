package me.superblaubeere27.minecraft.generators.entities;

import net.minecraft.nbt.NBTTagCompound;

public class EntityAgeable extends Entity {
	private int age;
	private int forcedAge;
	
	@Override
	public NBTTagCompound writeToNBT() {
		NBTTagCompound tag = super.writeToNBT();
		tag.setInteger("Age", age);
		tag.setInteger("ForcedAge", forcedAge);
		return tag;
	}
	@Override
	public String toString() {
		return String.format("EntityAgeable [age=%s, forcedAge=%s, toString()=%s]", age, forcedAge, super.toString());
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getForcedAge() {
		return forcedAge;
	}
	public void setForcedAge(int forcedAge) {
		this.forcedAge = forcedAge;
	}
	@Override
	public void readFromNBT(NBTTagCompound tag) {
		age = tag.getInteger("Age");
		forcedAge = tag.getInteger("ForcedAge");
		super.readFromNBT(tag);
	}
	@Override
	public String getName() {
		return "EntityAgeable";
	}
}
