package chapter04;
class Clac{
	public static int abs(int a) {
		return a > 0 ? a : -a;
	}
	public static int max(int a, int b) {
		return (a > b)? a : b;
	}
	public static int min(int a, int b) {
		return (a > b)? b : a;
	}
}

public class ClacEx2 {
	public static void main(String[] args) {
		System.out.println(Clac.abs(-5));
		System.out.println(Clac.max(10, 8));
		System.out.println(Clac.min(-3, -8));
	}
}