package com.zerosolutions.MyHashMap;

public interface HashMap {
	
	public void insertEntry(int key, String value);
	
	public MapEntry getEntry(int key);
	
	public void deleteEntry(int key);
	
	public boolean search(String value);

}
