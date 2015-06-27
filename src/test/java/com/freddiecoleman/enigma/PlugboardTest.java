package com.freddiecoleman.enigma;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlugboardTest {

	@Test
	public void testWireMappingFromHeadToTail() {
		Wire[] wires = { new Wire('a', 'x') };
		Plugboard plugboard = new Plugboard(wires);
		assertEquals('x', plugboard.convert('a'));
	}
	
	@Test
	public void testWireMappingFromTailToHead() {
		Wire[] wires = { new Wire('a', 'x') };
		Plugboard plugboard = new Plugboard(wires);
		assertEquals('a', plugboard.convert('x'));
	}
	
	@Test
	public void testKeyWithoutWire() {
		Wire[] wires = { new Wire('a', 'x') };
		Plugboard plugboard = new Plugboard(wires);
		assertEquals('p', plugboard.convert('p'));
	}
	
	@Test
	public void testMultipleKeyMappings() {
		Wire[] wires = { new Wire('a', 'x'), new Wire('j', 'q'), new Wire('l', 'e'), new Wire('r', 's') };
		Plugboard plugboard = new Plugboard(wires);
		assertEquals('a', plugboard.convert('x'));
		assertEquals('x', plugboard.convert('a'));
		assertEquals('j', plugboard.convert('q'));
		assertEquals('q', plugboard.convert('j'));
		assertEquals('l', plugboard.convert('e'));
		assertEquals('e', plugboard.convert('l'));
		assertEquals('r', plugboard.convert('s'));
		assertEquals('s', plugboard.convert('r'));
		assertEquals('b', plugboard.convert('b'));
	}

}
