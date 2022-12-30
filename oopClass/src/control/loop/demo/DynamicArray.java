package control.loop.demo;

import java.util.Random;

public class DynamicArray {
	
	private static String printArray(int[] target) {
		String s = "[";
		for(int i = 0; i < target.length; i++) {
			s += target[i];
			if(i != target.length - 1) {
				s += ",";
			}
		}	
		s += "]";
		
		return s;
	}
	public static void main(String[] args) {
		Random r = new Random();
		int[] dynamicIntArray = new int[r.nextInt(10)];
		for(int i = 0; i < dynamicIntArray.length; i++) {
			dynamicIntArray[i] = r.nextInt(100);
		}
		System.out.println("dynaminArray" + printArray(dynamicIntArray));
	}
}