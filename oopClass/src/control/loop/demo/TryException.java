package control.loop.demo;

import java.io.IOException;

public class TryException {
	public static void f() throws IOException, ClassNotFoundException{
		double choice = Math.random();
		if(choice <= 0.33) {
			System.out.println("Safely ended.");
		}
		else if(choice <= 0.66) {
			throw new IOException("Throwing an IOException");
		}
		else {
			throw new ClassNotFoundException("Throwing an ClassNotFoundExceoption");
		}
	}
	
	public static void main(String[] args) {
		int i = 5/0;
		
		String s = null;
		System.out.println(s.length());
		
		if(s == null) {
			throw new NullPointerException("oops!");
		}
	//	f();
	}
}
