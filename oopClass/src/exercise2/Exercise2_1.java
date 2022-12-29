package exercise2;
import java.util.Scanner;

public class Exercise2_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원화를 입력하세요(단위 원)>>");
		int won = scanner.nextInt(); // 원화 입력받기
		float dollar = won / 1100; // 1달러는 1100원

		System.out.println(won + "원은 " + dollar + "$입니다.");
		scanner.close();
	}
}