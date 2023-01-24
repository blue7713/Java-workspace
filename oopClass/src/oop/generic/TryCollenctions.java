package oop.generic;

import java.util.*;

class Tiny{}
class Small extends Tiny{}
class Normal extends Small{}
class Big extends Normal{}
class Huge extends Big{}

public class TryCollenctions {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		list1.set(0, 17); // ok. autoboxing.
//		list1.add(99); // error!, unalbe to resize!
		System.out.println("1. list1 = " + list1);
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		list2.set(0, 17); // ok.
		list2.add(99); // Autoboxing!
		System.out.println("2. list2 = " + list2);
		
		Integer[] iA = list2.toArray(new Integer[0]);
		System.out.println("3. iA = " + Arrays.toString(iA));
		list2.addAll(Arrays.asList(iA));
		System.out.println("4. list2 = " + list2);
		
		Collections.addAll(list2, 100, 101, 102, 103);
		System.out.println("5. list2 = " + list2);
		
		List<Tiny> t1 = Arrays.asList(new Small(), new Normal(), new Big());
//		t1.add(new Huge()); // error!, unable to resize!
		List<Small> t2 = Arrays.asList(new Small(), new Normal(), new Big());
		List<Tiny> t3 = new ArrayList<>(t2);
		t3.remove(0);
		Collections.addAll(t3, new Huge(), new Tiny());
		System.out.println("6. t3 = " + t3.toString());
	}
}