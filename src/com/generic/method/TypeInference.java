package com.generic.method;

import java.util.ArrayList;
import java.util.List;

/**
 * Type inference is a Java compiler’s ability to look at each method invocation 
 * and corresponding declaration to determine the type argument (or arguments) that makes 
 * the invocation applicable. The inference algorithm determines the types of the arguments and, 
 * if available, the type that the result is being assigned or returned. 
 * Finally, the inference algorithm tries to find the most specific type that works with all 
 * the arguments.
 * @author msamak
 *
 */
public class TypeInference {
	
	public static<T> void addStore(T t, List<Bucket<T>> list) {
		Bucket<T> bucket = new Bucket<>();
		bucket.setItem(t);
		list.add(bucket);
		System.out.println(t.toString() + " has been added to the list");
		
		/*for(Bucket<T> item : list){
			System.out.println(item.getItems());
		}*/
	}
	
	public static void main(String[] args) {
		
		List<Bucket<String>> list = new ArrayList<>();
		List<Bucket<Integer>> iList = new ArrayList<>();
		
		TypeInference.addStore("Adam", list);
		TypeInference.addStore(10, iList);
		
		// "Type witness"
		TypeInference.<Integer>addStore(20, iList);
	}
}
