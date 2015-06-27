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
	
	/**
	 * Pressing a key on the keyboard
	 * @param inputKey
	 */
	public void input(char inputKey){
		encryptedMessage.append(plugboard.convert(inputKey));
	}
	
	/**
	 * Retrieves the encrypted message
	 * @return
	 */
	public String encryptedMessage(){
		return encryptedMessage.toString();
	}

}
