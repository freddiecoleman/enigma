package com.freddiecoleman.enigma;

import java.util.HashMap;

/**
 * Coded in a way that makes it easy to match known configurations by inputting substitution cipher as a string.
 * Configurations found at https://en.wikipedia.org/wiki/Enigma_rotor_details#Rotor_wiring_tables
 * @author freddiecoleman
 *
 */
public final class Rotor {
	
	private static final int CHARACTER_COUNT = 26;
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	private final HashMap<Character, Integer> characterPositionNumbers = new HashMap<Character, Integer>();
	private final HashMap<Character, Character> keyMappings = new HashMap<Character, Character>();
	private int currentPosition;
	
	public Rotor(char startingPositionCharacter, String substitutionCipher){
		if(substitutionCipher.length() != CHARACTER_COUNT)
			throw new IllegalArgumentException("Substition ciper must be " + CHARACTER_COUNT + 
					"characters long!");
		
		configureInternalWirings(substitutionCipher);
		rotateToStartingPosition(startingPositionCharacter);
	}
	
	private void configureInternalWirings(String substitutionCipher){
		for(int i = 0; i < substitutionCipher.length() - 1; i++){
			keyMappings.put(ALPHABET.charAt(i), substitutionCipher.charAt(i));
			keyMappings.put(substitutionCipher.charAt(i), ALPHABET.charAt(i));
		}
	}
	
	private void rotateToStartingPosition(char startingPositionCharacter){
		for(int i = 0; i < ALPHABET.length() - 1; i++){
			characterPositionNumbers.put(ALPHABET.charAt(i), i);
		}
		this.currentPosition = characterPositionNumbers.get(startingPositionCharacter);
	}
	
	
	
	public void rotate(){
		if(currentPosition == CHARACTER_COUNT - 1){
			currentPosition = 0;
		}
	}

}
