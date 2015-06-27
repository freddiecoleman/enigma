package com.freddiecoleman.enigma;

/**
 * @author freddiecoleman
 *
 */
public final class Enigma {
	
	private final Plugboard plugboard;
	StringBuilder encryptedMessage;
	
	public Enigma(Wire[] wires){
		this.plugboard = new Plugboard(wires);
	}
	
	public void input(char inputKey){
		encryptedMessage.append(plugboard.convert(inputKey));
	}
	
	public String encryptedMessage(){
		return encryptedMessage.toString();
	}

}
