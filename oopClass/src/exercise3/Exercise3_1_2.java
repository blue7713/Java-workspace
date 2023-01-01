package exercise3;

public class Exercise3_1_2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(i < 100) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
	}
}