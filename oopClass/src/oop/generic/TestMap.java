package oop.generic;

import java.util.*;

public class TestMap {
	public static void main(String[] args) {
		Map<String, Apple> apples = new HashMap<String, Apple>();
		apples.put("Fuji", new Apple(1));
		apples.put("Gala", new Apple(2));
		apples.put("Granny smith", new Apple(3));
		apples.put("McIntosh", new Apple(4));
		apples.put("Cripps Pink", new Apple(5));
		apples.put("Honeycrisp", new Apple(6));
		System.out.println("apples = " + apples);
		
		Apple a = apples.get("McIntosh");
		System.out.println("McIntosh = " + a);
		System.out.println("keys: " + apples.keySet());
		System.out.println("values: " + apples.values());
		
		Random rand = new Random();
		Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
		for(int i = 0; i < 1000; i++) {
			int key = rand.nextInt(10);
			Integer frequency = m.get(key);
			m.put(key, frequency == null ? 1 : frequency + 1);
		}
		System.out.println("m = " + m);
	}
}