package com.freddiecoleman.enigma;

import java.util.HashMap;

/**
 * Coded in a way that makes it easy to match known configurations by inputting substitution cipher as a string.
 * Configurations found at https://en.wikipedia.org/wiki/Enigma_rotor_details#Rotor_wiring_tables
 * @author freddiecoleman
 *
 */
public class Rotor {
	
	private final HashMap<Character, Character> keyMappings = new HashMap<Character, Character>();
	private int currentPosition;
	
	public Rotor(int startingPosition, String substitutionCipher){
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		this.currentPosition = startingPosition;
		for(int i = 0; i < substitutionCipher.length(); i++){
			keyMappings.put(alphabet.charAt(i), substitutionCipher.charAt(i));
			keyMappings.put(substitutionCipher.charAt(i), alphabet.charAt(i));
		}
	}

}
