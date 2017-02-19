package me.superblaubeere27.minecraft.generators.entities;

import net.minecraft.nbt.NBTTagCompound;

public class EntityPigman extends EntityZombie {

	private short anger;
	private String hurtBy;

	public short getAnger() {
		return anger;
	}

	public void setAnger(short anger) {
		this.anger = anger;
	}

	public String getHurtBy() {
		return hurtBy;
	}

	public void setHurtBy(String hurtBy) {
		this.hurtBy = hurtBy;
	}

	@Override
	public String getName() {
		return "zombie_pigman";
	}

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		anger = tag.getShort("Anger");
		hurtBy = tag.getString(hurtBy);
	}

	@Override
	public NBTTagCompound writeToNBT() {
		NBTTagCompound tag = super.writeToNBT();
		if (anger != 0) {
			tag.setShort("Anger", anger);
		}
		if (hurtBy != null && !hurtBy.isEmpty()) {
			tag.setString("HurtBy", hurtBy);
		}
		return tag;
	}

	@Override
	public String toString() {
		return String.format("EntityPigman [anger=%s, hurtBy=%s, toString()=%s]", anger, hurtBy, super.toString());
	}

}
