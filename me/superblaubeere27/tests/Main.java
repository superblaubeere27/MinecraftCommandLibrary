package me.superblaubeere27.tests;

import java.util.ArrayList;
import java.util.List;

import me.superblaubeere27.minecraft.generators.commands.tellraw.TellrawCommandGenerator;
import me.superblaubeere27.minecraft.generators.commands.tellraw.TellrawComponent;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<TellrawComponent> comps = new ArrayList<TellrawComponent>();
		comps.add(new TellrawComponent("normal ", "reset"));
		comps.add(new TellrawComponent("darkred ", "dark_red"));
		comps.add(new TellrawComponent("normal ", "reset"));
		comps.add(new TellrawComponent("red ", "dark_red"));
		comps.add(new TellrawComponent("normal ", "reset"));
		System.out.println("PLEASE TEST COMMAND: " + TellrawCommandGenerator.generateCommand(comps, "@a"));
	}

}
