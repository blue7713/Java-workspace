package Chapter06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; // auto boxing // Integer intObject = Integer.valueOf(n);
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10; // auto unboxing // m = intObject.intValue() + 10;
		System.out.println("m = " + m);
	}
}