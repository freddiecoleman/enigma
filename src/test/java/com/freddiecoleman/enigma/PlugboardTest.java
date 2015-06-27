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

}
