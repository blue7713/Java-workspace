package exercise2;

import java.util.Scanner;

public class Exercies2_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�>>");
		int number = scanner.nextInt();
		// (���� �ڸ� �� + ���� �ڸ� ��)�� 3�� ����� ��� ���
		int ten = number / 10; // ���� �ڸ���
		int one = number % 10; // ���� �ڸ���
		if(number < 10) { // 10������ ���
			if(number % 3 == 0) {
			System.out.println("�ڼ�¦");
			}
			else
				System.out.println("3�� ����� �ƴմϴ�");
		}
		else if(number > 10) { // 10 �̻��� ���
			if((ten % 3 == 0)&&(one % 3 == 0)) { // �� �� 3�� ����ΰ��
				System.out.println("�ڼ�¦¦");
			}
			else if(ten % 3 == 0) { // �� ���� 3�� ����� ���
				System.out.println("�ڼ�¦");
			}
			else if(one % 3 == 0) {
				System.out.println("�ڼ�¦");
			}
			else {
				System.out.println("3�� ����� �ƴմϴ�.");
			}
		}
		scanner.close();
	}
}