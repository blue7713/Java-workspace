package exercise2;
import java.util.Scanner;

public class Exercise2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2자리 수 정수입력(10~99)>>");
		int number = scanner.nextInt();
		if (number/10 == number%10) // 10의 자리와 일의 자리 비교
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		scanner.close();
	}
}