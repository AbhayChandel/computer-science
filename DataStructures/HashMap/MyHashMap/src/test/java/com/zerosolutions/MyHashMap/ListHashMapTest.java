package com.zerosolutions.MyHashMap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListHashMapTest {

	HashMap map = new ListHashMap();

	@Before
	public void setUp() throws Exception {
		map.insertEntry(7, "Tiger");
		map.insertEntry(33, "Wolf");
		map.insertEntry(299, "Koala Bear");
		map.insertEntry(399, "Bear");
	}

	@Test
	public void testInsertEntry() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEntry() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteEntry() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearch() {
		fail("Not yet implemented");
	}

}
