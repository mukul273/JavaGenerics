package com.generic.method;

public class AppMain {

	public static void main(String[] args) {
		
		GenericMethod genMethod = new GenericMethod();
		genMethod.showItem("Generic Method Demo");
		genMethod.showItem(34);
		
		String[] names = {"1","2","3","4"};
		Integer[] intArray = {1,2,3,4,5}; 
		GenericMethod2 genericMethod2 = new GenericMethod2();
		genericMethod2.showArray(names);
		System.out.println();
		genericMethod2.showArray(intArray);
	}
}