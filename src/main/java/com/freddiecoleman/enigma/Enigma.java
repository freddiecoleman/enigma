package com.freddiecoleman.enigma;

/**
 * @author freddiecoleman
 *
 */
public final class Enigma {
	
	private final Plugboard plugboard;
	
	public Enigma(Wire[] wires){
		this.plugboard = new Plugboard(wires);
	}

}
