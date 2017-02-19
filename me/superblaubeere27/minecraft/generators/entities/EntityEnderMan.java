package me.superblaubeere27.minecraft.generators.entities;

import net.minecraft.nbt.NBTTagCompound;

public class EntityEnderMan extends Entity {

	private short carried;
	private short carriedData;

	@Override
	public String toString() {
		return String.format("EntityEnderMan [carried=%s, carriedData=%s, toString()=%s]", carried, carriedData,
				super.toString());
	}

	public short getCarried() {
		return carried;
	}

	public void setCarried(short carried) {
		this.carried = carried;
	}

	public short getCarriedData() {
		return carriedData;
	}

	public void setCarriedData(short carriedData) {
		this.carriedData = carriedData;
	}

	@Override
	public String getName() {
		return "enderman";
	}

	@Override
	public NBTTagCompound writeToNBT() {
		NBTTagCompound tag = super.writeToNBT();
		if (carried != 0) {
			tag.setShort("carried", carried);
		}
		if (carriedData != 0) {
			tag.setShort("carriedData", carriedData);
		}
		return tag;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		carried = tag.getShort("carried");
		carriedData = tag.getShort("carriedData");
	}

}
