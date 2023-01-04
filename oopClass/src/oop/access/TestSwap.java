package oop.access;

public class TestSwap {
	static void print(String message, int x, int y) {
		System.out.println(String.format("%s: (%d, %d)", message, x, y));
	}
	
	static void swapInt(int x, int y) {
		print("swapInt", x, y);
		int temp = x;
		x = y;
		y = temp;
		print("swapInt", x, y);
	}
	
	static void swapInteger(Integer i1, Integer i2) {
		print("swapInteger", i1, i2);
		Integer temp = i1;
		i1 = i2;
		i2 = temp;
		print("swapInteger", i1, i2);
	}
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		print("1. main", a, b);
		swapInt(a, b);
		print("1. main", a, b);
		
		Integer v1 = 1;
		Integer v2 = 2;
		print("2. main", v1, v2);
		swapInteger(v1, v2);
		print("2. main", v1, v2);
		
		Integer temp = v1;
		v1 = v2;
		v2 = temp;
		print("3.main", v1, v2);
	}
}