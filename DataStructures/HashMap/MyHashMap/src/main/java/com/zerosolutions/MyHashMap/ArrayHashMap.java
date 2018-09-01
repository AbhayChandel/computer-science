package com.zerosolutions.MyHashMap;

/**
 * Map implementation based on array.
 */
public class ArrayHashMap implements HashMap {

	private String[] map = new String[100];
	private final int hashingDivisor = 100;

	/**
	 * performance is O(1)
	 */
	@Override
	public void insertEntry(int key, String value) {
		int indexNumber = getIndexNumber(key);
		if (getEntry(indexNumber) == null) {
			map[indexNumber] = value;
		} else {
			System.out.println("Value for index already exist");
		}
	}

	/**
	 * performance is O(1)
	 * 
	 * @param key is the key value for the map.
	 * @return {@link MapEntry}
	 * 
	 */
	@Override
	public MapEntry getEntry(int key) {
		int indexNumber = getIndexNumber(key);
		return map[indexNumber] == null ? null : new MapEntry(key, map[indexNumber]);
	}

	/**
	 * performance is O(1)
	 */
	@Override
	public void deleteEntry(int key) {
		map[key] = null;
	}

	private int getIndexNumber(int key) {
		return key % hashingDivisor;
	}

	/**
	 * Time complexity is O(N) in worst case	
	 */
	@Override
	public boolean search(String value) {
		for (int i = 0; i < map.length; i++) {
			if (map[i] != null && map[i].equals(value)) {
				return true;
			}
		}
		return false;
	}
}
