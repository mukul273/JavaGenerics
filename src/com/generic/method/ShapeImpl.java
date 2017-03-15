package com.generic.method;

/**
 * Wildcards exercise
 */
import java.util.ArrayList;
import java.util.List;

public class ShapeImpl {
	
	public static void main(String[] args) {
		List<Circle> cList = new ArrayList<>();
		
		// Its not possible to call drawAll(List<Shape>...with List<Circle> Or List<Rectangle>
		//Because its going to work only for List<Shape> 
		//drawAll(cList);
	}
	
	public void drawAll(List<Shape> l) {
		
		for(Shape i : l) {
			i.draw();
		}
	}
}