package com.generic.method;

public class GenericMethod {
	
	public <T> void showItem(T t) {
		System.out.println("The Generic toString is:"+ t.toString());
	}
}