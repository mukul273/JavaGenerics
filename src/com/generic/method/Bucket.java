package com.generic.method;

public class Bucket<T> {
	
	private T item;
	
	public T getItems() {
		return this.item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}