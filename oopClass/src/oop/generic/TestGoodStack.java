package oop.generic;

import java.util.Random;

public final class TestGoodStack {
	public static void main(String[] args) {
		Random r = new Random();
		
//		GoodStack<Apple> gs1 = new GoodStack<>(-1);
		BetterStack<Apple> gs1 = new BetterStack<Apple>(-1);
		for(int i = 0; i < 5; i++) {
			gs1.push(new Apple(i));
		}
		
		for(int i = 0; i < 10; i++) {
			if(r.nextBoolean()) {
				Apple a = new Apple(r.nextInt());
				gs1.push(a);
				System.out.println("push: " + a);
			}
			else {
				Apple a = gs1.pop();
				System.out.println("pop: " + a);
			}
		}
		
//		GoodStack<Orange> gs2 = new GoodStack<>(-1);
		BetterStack<Orange> gs2 = new BetterStack<Orange>(-1);
		for(int i = 0; i < 5; i++) {
			gs2.push(new Orange(i));
		}
		
		for(int i = 0; i < 10; i++) {
			if(r.nextBoolean()) {
				Orange o = new Orange(r.nextInt());
				gs2.push(o);
				System.out.println("push: " + o);
			}
			else {
				Orange o = gs2.pop();
				System.out.println("pop: " + o);
			}
		}
	}
}