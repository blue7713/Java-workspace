package exercise2;
import java.util.Scanner;

public class Exercise2_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ȭ�� �Է��ϼ���(���� ��)>>");
		int won = scanner.nextInt(); // ��ȭ �Է¹ޱ�
		float dollar = won / 1100; // 1�޷��� 1100��

		System.out.println(won + "���� " + dollar + "$�Դϴ�.");
		scanner.close();
	}
}