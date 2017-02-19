package me.superblaubeere27.minecraft.generators.entities;

import net.minecraft.nbt.NBTTagCompound;

public class EntityCreeper extends Entity {
	private boolean powered;
	private boolean ignited;
	private short fuse;
	private byte explosionRadius;

	@Override
	public NBTTagCompound writeToNBT() {
		NBTTagCompound tag = super.writeToNBT();
		if (powered) {
			tag.setBoolean("powered", powered);
		}
		if (ignited) {
			tag.setBoolean("ignited", ignited);
		}
		if (fuse != 0) {
			tag.setShort("Fuse", fuse);
		}
		if (explosionRadius != 0) {
			tag.setByte("ExplosionRadius", explosionRadius);
		}
		return tag;
	}

	public boolean isPowered() {
		return powered;
	}

	public void setPowered(boolean powered) {
		this.powered = powered;
	}

	public boolean isIgnited() {
		return ignited;
	}

	public void setIgnited(boolean ignited) {
		this.ignited = ignited;
	}

	public short getFuse() {
		return fuse;
	}

	public void setFuse(short fuse) {
		this.fuse = fuse;
	}

	public byte getExplosionRadius() {
		return explosionRadius;
	}

	public void setExplosionRadius(byte explosionRadius) {
		this.explosionRadius = explosionRadius;
	}

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		powered = tag.getBoolean("powered");
		ignited = tag.getBoolean("ignited");
		fuse = tag.getShort("Fuse");
		explosionRadius = tag.getByte("ExplosionRadius");
	}

	@Override
	public String toString() {
		return String.format("EntityCreeper [powered=%s, ignited=%s, fuse=%s, explosionRadius=%s, toString()=%s]",
				powered, ignited, fuse, explosionRadius, super.toString());
	}
	
	@Override
	public String getName() {
		return "Creeper";
	}

}
