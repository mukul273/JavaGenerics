package com.generic.method;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Lower Bounded wildcards "? super T"
 * Can specify lower OR upper bounded wild cards but not both
 * i.e. use either super OR extends but not both
 * for e.g. Object and Number are super types
 * 
 * @author msamak
 *
 */
public class LowerBoundedWildCards {
	
	public static void show (List<? super Number> list) {
		for(Object o : list)
			System.out.println(o);
	}
	
	public static void main(String[] args) {
		
		List<Serializable> list = new ArrayList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		LowerBoundedWildCards.show(list);
	}
}