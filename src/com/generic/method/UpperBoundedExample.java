package com.generic.method;

import java.util.Arrays;
import java.util.List;

/**
 * With extends word we can only read the list, We can add anything to that list as yet.
 * @author msamak
 *
 */
public class UpperBoundedExample {

	public static double sum(List<? extends Number> list) {
		double sum = 0;

		for(Number n:list) {
			sum += n.doubleValue();
		}
		
		System.out.println("The sum is:" + sum);
		return sum;
	}
	
	public static void main(String[] args) {
			sum(Arrays.asList(1,2,3,4));
	}

}
