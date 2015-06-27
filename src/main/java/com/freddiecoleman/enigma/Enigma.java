package com.freddiecoleman.enigma;

/**
 * @author freddiecoleman
 *
 */
public final class Enigma {
	
	private final Plugboard plugboard;
	private StringBuilder encryptedMessage;
	
	public Enigma(Wire[] wires){
		this.plugboard = new Plugboard(wires);
		this.encryptedMessage = new StringBuilder();
	}
	
	public static void main(String[] args){
		Wire[] wires = { new Wire('a', 'x') };
		Enigma enigma = new Enigma(wires);
		
		enigma.input('a');
		enigma.input('b');
		enigma.input('c');
		enigma.input('x');
		enigma.input('y');
		enigma.input('z');
		
		System.out.println(enigma.encryptedMessage());
	}
	
	/**
	 * Pressing a key on the keyboard
	 * @param inputKey
	 */
	public void inputKey(char key){
		encryptedMessage.append(plugboard.convert(key));
	}
	
	/**
	 * Retrieves the encrypted message
	 * @return
	 */
	public String encryptedMessage(){
		return encryptedMessage.toString();
	}

}
