package oop.generic;

import java.util.*;

public class IterationDemo {
	public static void main(String[] args) {
		Vector<Double> vect = new Vector<Double>(); // new Vector<Double>();
		for(int i = 0; i < 5; i++) {
			vect.add(Math.random() * 100); // autoboxing.
		}
		System.out.println("1. vect = " + vect);
		System.out.print("2. vect = [");
		
		Enumeration<Double> oldWay = vect.elements();
		while(oldWay.hasMoreElements()) {
			System.out.print(oldWay.nextElement() + (oldWay.hasMoreElements() ? ", " : "]\n"));
		}
		
		List<Integer> list = new ArrayList<Integer>(); // new ArrayList<Integer>(); upcasting
		Iterator<Double> itr = vect.iterator();
		while(itr.hasNext()) {
			Double d = itr.next();
			list.add(d.intValue());
			itr.remove();
		}
		System.out.println("3. list = " + list + "\n4. vect = " + vect);
		
		ListIterator<Integer> listItr = list.listIterator(list.size());
		System.out.print("5. listItr(rev.) = [");
		while(listItr.hasPrevious()) {
			Integer i = listItr.previous();
			System.out.print(i + (listItr.hasPrevious() ? ", " : "]\n"));
		}
	}
}