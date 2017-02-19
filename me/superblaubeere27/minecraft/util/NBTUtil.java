package me.superblaubeere27.minecraft.util;

import net.minecraft.nbt.NBTTagDouble;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.nbt.NBTTagList;

public class NBTUtil {

	public static NBTTagList newDoubleList(double[] ds) {
		NBTTagList list = new NBTTagList();
		for (double d : ds) {
			list.appendTag(new NBTTagDouble(d));
		}
		return list;
	}
	
	public static NBTTagList newFloatList(float[] ds) {
		NBTTagList list = new NBTTagList();
		for (float d : ds) {
			list.appendTag(new NBTTagFloat(d));
		}
		return list;
	}
	
}
