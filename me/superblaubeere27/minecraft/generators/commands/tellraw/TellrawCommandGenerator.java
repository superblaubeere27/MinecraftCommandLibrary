package me.superblaubeere27.minecraft.generators.commands.tellraw;

import java.util.List;

import com.google.gson.JsonArray;

public class TellrawCommandGenerator {

	public static String generateJson(List<TellrawComponent> components) {
		JsonArray output = new JsonArray();
		for (TellrawComponent tellrawComponent : components) {
			output.add(tellrawComponent.toJsonObject());
		}
		return output.toString();
	}
	public static String generateCommand(List<TellrawComponent> components, String selector) {
		return "/tellraw " + selector + " " + generateJson(components);
	}

}
