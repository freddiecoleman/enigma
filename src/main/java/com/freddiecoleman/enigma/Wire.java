package com.freddiecoleman.enigma;

public final class Wire {
	
	private final char head;
	private final char tail;
	
	public Wire(char head, char tail){
		this.head = head;
		this.tail = tail;
	}
	
	public char getHead(){
		return head;
	}
	
	public char getTail(){
		return tail;
	}

}
