package com.freddiecoleman.enigma;

import java.util.HashMap;

/**
 * @author freddiecoleman
 *
 */
public final class Plugboard {
	
	private final HashMap<Character, Character> keyMappings = new HashMap<Character, Character>();
	
	/**
	 * Takes wires as an input which are used to determine which keys are swapped.
	 * Creates a HashMap containing the key mappings for quick key conversions.
	 * @param wires
	 */
	public Plugboard(Wire[] wires){
		for(Wire wire : wires){
			keyMappings.put(wire.getHead(), wire.getTail());
			keyMappings.put(wire.getTail(), wire.getHead());
		}
	}
	
	/**
	 * Translates a key to its mapped key based on wire configuration.
	 * If no wire exists for the key then it returns its original value;
	 * @param inputKey
	 * @return
	 */
	public char convert(char inputKey){
		if(!keyMappings.containsKey(inputKey)){
			return inputKey;
		}
		return keyMappings.get(inputKey);
	}

}
