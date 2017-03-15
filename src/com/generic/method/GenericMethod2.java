package com.generic.method;

public class GenericMethod2 {
	
	public <T> void showArray(T[] array) {
		for(T item: array)
			System.out.println("The item is :"+item.toString());
	}
}