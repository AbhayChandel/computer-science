package com.zerosolutions.MyHashMap;

public class MapEntry {
	
	final int key;
	final String value;
	
	MapEntry(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}

}
