package me.superblaubeere27.minecraft.generators.entities;

import net.minecraft.nbt.NBTTagCompound;

public class EntitySkeleton extends Entity {
	private byte skeletonByte;

	@Override
	public String getName() {
		return "skeleton";
	}

	public byte getSkeletonByte() {
		return skeletonByte;
	}

	public void setSkeletonByte(byte skeletonByte) {
		this.skeletonByte = skeletonByte;
	}

	@Override
	public String toString() {
		return String.format("EntitySkeleton [skeletonByte=%s, toString()=%s]", skeletonByte, super.toString());
	}
	
	@Override
	public NBTTagCompound writeToNBT() {
		NBTTagCompound tag = super.writeToNBT();
		tag.setByte("SkeletonType", skeletonByte);
		return tag;
	}
	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		skeletonByte = tag.getByte("SkeletonType");
	}
	
}
