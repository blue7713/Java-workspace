package oop.inheritance;

public class CompareObject {
	public static void main(String[] args) {
		Integer x1 = 3;
		Integer x2 = 3;
		if(x1 == x2) {
			System.out.println("Yes, it's the same!");
		}
		else {
			System.out.println("No, it's not the same!");
		}
		
		Integer y1 = new Integer(3);
		Integer y2 = new Integer(3);
		if(y1 == y2) {
			System.out.println("Yes, it's the same!");
		}
		else {
			System.out.println("Np, it's not the same!");
		}
		
		String s1 = "Help";
		String s2 = "Help";
		if(s1 == s2) {
			System.out.println("Yes, it's the same!");
		}
		else {
			System.out.println("Np, it's not the same!");
		}
		
		String t1 = new String("Help");
		String t2 = new String("Help");
		if(t1 == t2) {
			System.out.println("Yes, it's the same!");
		}
		else {
			System.out.println("No, it's not the same!");
		}
		
		if(y1.equals(y2)) {
			System.out.println("Yes, it's equal!");
		}
		else {
			System.out.println("No, it's not eqaul!");
		}
		
		if(t1.equals(t2)) {
			System.out.println("Yes, it's equal!");
		}
		else {
			System.out.println("No, it's not equal!");
		}
		
		ValueObject v1 = new ValueObject(3, true);
		ValueObject v2 = new ValueObject(3, true);
		if(v1 == v2) {
			System.out.println("Yes, it's the same!");
		}
		else {
			System.out.println("No, it's not the same!");
		}
		
		if(v1.equals(v2)) {
			System.out.println("Yes, it's eqaul!");
		}
		else {
			System.out.println("No, it's not equal!");
		}
		
		System.out.print("v1: " + v1);
		System.out.println(", v2: " + v2);
	}
}