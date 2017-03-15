package com.generic.method;

/**
 * There may betime when you want to restrict the types that can be used as type argument
 * in a parameterized type. For e.g.: If the methos operates on numbers might only want to accept 
 * instances of numbers or its subclasses
 * 
 * Bounded type parameters allow you to invoke methods defined in the bounds.
 * 
 * @author msamak
 *
 */
public class BoundedTypeParameter {

	public static <U extends Comparable<U>> U calculateMin(U t1, U t2) {
	
		if(t1.compareTo(t2)<0)
			return t1;
		
		return t2;
	}
	
	public static void main(String[] args) {
		System.out.println(calculateMin('v', 'b'));
		System.out.println(calculateMin(9, 10));
		System.out.println(calculateMin("adaj", "adam"));
	}
}