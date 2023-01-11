package oop.inheritance;

import java.util.Arrays;

public class SortComparable {
	public static void main(String[] args) {
		int[] iA = {10, 7, 1, 21, 3, 9, 2, 6, 5};
		String[] sA = {"sort", "this", "will", "be", "ok?", "yes"};
		
		System.out.println("before: " + Arrays.toString(iA));
		Arrays.sort(iA);
		System.out.println("sorted: " + Arrays.toString(iA));
		
		System.out.println("before: " + Arrays.toString(sA));
		Arrays.sort(sA);
		System.out.println("sorted: " + Arrays.toString(sA));
		
		ValueObject[] v0 = {new ValueObject(5, true), new ValueObject(4, false),
				new ValueObject(1, false), new ValueObject(7, true)};
		System.out.println("before: " + Arrays.toString(v0));
		Arrays.sort(v0);
		System.out.println("sorted: " + Arrays.toString(v0));
		
		Arrays.sort(v0, new ValueObjectComparator());
		System.out.println("sorted w/ comparator: " + Arrays.toString(v0));
		}
	}