package exercise2;
import java.util.Scanner;

public class Exercise2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2�ڸ� �� �����Է�(10~99)>>");
		int number = scanner.nextInt();
		if (number/10 == number%10) // 10�� �ڸ��� ���� �ڸ� ��
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		scanner.close();
	}
}