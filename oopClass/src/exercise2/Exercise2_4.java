package exercise2;
import java.util.Scanner;

public class Exercise2_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 3개 입력>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		int median = (x <= y)?((y <= z)?y:z):((x <= z)?x:z);
		System.out.println("중간 값은 " + median);
		
		scanner.close();
	}	
}