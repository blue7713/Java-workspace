package exercise2;

import java.util.Scanner;

public class Exercise2_12_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����>>"); // ���� ���� �Է¹ޱ�
		float operend1 = scanner.nextFloat();
		String operator = scanner.next();
		float operend2 = scanner.nextFloat();
		
		if (operator.equals("+")) { // ������ ����
			System.out.println(operend1 + "+" + operend2 + "�� ��� ����� " + (operend1 + operend2));
		}
		else if(operator.equals("-")) {
			System.out.println(operend1 + "-" + operend2 + "�� ��� ����� " + (operend1 - operend2));
		}
		else if(operator.equals("*")) {
			System.out.println(operend1 + "*" + operend2 + "�� ��� ����� " + (operend1 * operend2));
		}
		else if(operator.equals("/") || operend1 == 0 || operend2 == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		else if(operator.equals("/")) {
			System.out.println(operend1 + "/" + operend2 + "�� ��� ����� " + (operend1 / operend2));
		}
		else {
			System.out.println("�߸��� ���Դϴ�.");
		}
		scanner.close();
	}
}