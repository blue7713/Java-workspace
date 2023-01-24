package oop.generic;

import java.util.*;

public class Upcasting {
	public static void main(String[] args) {
		Object[] oA1 = new Object[] {"String1", "String2", "String3"};
		oA1[0] = "String4";
		oA1[1] = new Object();
		System.out.println("oA1 = " + Arrays.toString(oA1));
		System.out.println("oA1.class = " + oA1.getClass().getName());
		
		Object[] oA2 = new String[] {"StringX", "StringY", "StringZ"};
		oA2[0] = "StringW";
//		oA2[1] = new Object();
		System.out.println("oA2 = " + Arrays.toString(oA2));
		System.out.println("oA2.Class = " + oA2.getClass().getName());
		
		List<String> oL = new ArrayList<String>(Arrays.asList((String[]) oA2)); // upcasting
//		List<Object> OL = new ArrayList<String>(Arrays.asList((String[]) oA2));
		System.out.println("oL = " + oL);
		System.out.println("oL.Class = " + oL.getClass().getName());
		
		Object object = oL;
		System.out.println("object.Class = " + object.getClass().getName());
		System.out.println("object = " + object);
	}
}