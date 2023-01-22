package oop.generic;

import java.util.Random;

public class TestStack {
	public static void main(String[] args) {
		Random r = new Random();
		
//		AppleStack as = new AppleStack(r.nextInt(10) + 5);
		ObjectStack os1 = new ObjectStack(r.nextInt(10) + 5);
		for(int i = 0; i < 5; i++) {
//			as.push(new Apple(i));
			os1.push(new Apple(i));
		}
		
		for(int i = 0; i < 10; i++) {
			if(r.nextBoolean()) {
				Apple a = new Apple(r.nextInt());
//				as.push(a);
				os1.push(a);
				System.out.println("push: " + a);
			}
			else {
//				Apple a = as.pop();
				Apple a = (Apple)os1.pop();
				System.out.println("pop: " + a);
			}
		}
		
//		OrangeStack os = new OrangeStack(r.nextInt(10) + 5);
		ObjectStack os2 = new ObjectStack(r.nextInt(10) + 5);
		for(int i = 0; i < 5; i++) {
//			os.push(new Orange(i));
			os2.push(new Orange(i));
		}
		
		for(int i = 0; i < 10; i++) {
			if(r.nextBoolean()) {
				Orange o = new Orange(r.nextInt());
//				os.push(o);
				os2.push(o);
				System.out.println("push: " + o);
			}
			else {
//				Orange o = os.pop();
				Orange o = (Orange) os2.pop();
				System.out.println("pop: " + o);
			}
		}
	}
}