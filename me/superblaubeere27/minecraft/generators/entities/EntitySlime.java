package me.superblaubeere27.minecraft.generators.entities;

import net.minecraft.nbt.NBTTagCompound;

public class EntitySlime extends Entity {
	
	private int size;
	private boolean wasOnGround;
	
	@Override
	public String getName() {
		return "slime";
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		size = tag.getInteger("Size");
		wasOnGround = tag.getBoolean("wasOnGround");
	}
	
	@Override
	public NBTTagCompound writeToNBT() {
		NBTTagCompound tag = super.writeToNBT();
		if (wasOnGround) {
			tag.setBoolean("wasOnGround", wasOnGround);
		}
		if(size != 0) {
			tag.setInteger("Size", size);
		}
		return tag;
	}
	
}
