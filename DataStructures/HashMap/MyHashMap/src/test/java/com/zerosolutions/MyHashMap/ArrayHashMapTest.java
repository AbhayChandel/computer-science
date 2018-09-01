package com.zerosolutions.MyHashMap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayHashMapTest {

	HashMap map = new ArrayHashMap();

	@Before
	public void setUp() throws Exception {
		map.insertEntry(7, "Tiger");
		map.insertEntry(33, "Wolf");
		map.insertEntry(299, "Koala Bear");
		map.insertEntry(399, "Bear");
	}

	@Test
	public void testInsert() {
		map.insertEntry(54, "Eagle");
		assertNotNull(map.getEntry(54).getValue());
		assertEquals("Eagle", map.getEntry(54).getValue());

	}
	
	@Test
	public void testGet() {
		assertEquals("Koala Bear", map.getEntry(299).getValue());
	}

	@Test
	public void testGetEmpty() {
		assertNull(map.getEntry(11));
		assertEquals("Wolf", map.getEntry(33).getValue());
	}
	
	@Test
	public void testDelete() {
		map.deleteEntry(7);
		assertNull(map.getEntry(7));
	}
	
	@Test
	public void testSearch() {
		assertTrue(map.search("Wolf"));
		assertFalse(map.search("Zebra"));
	}
	
	
	

}
