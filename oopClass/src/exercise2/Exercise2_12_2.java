package exercise2;

import java.util.Scanner;

public class Exercise2_12_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����>>");
		float operend1 = scanner.nextFloat();
		String operator = scanner.next();
		float operend2 = scanner.nextFloat();
		
		switch(operator) {
			case "+" :
				System.out.println(operend1 + "+" + operend2 + "�� ��� �����" + (operend1 + operend2));
				break;
			case "-" :
				System.out.println(operend1 + "-" + operend2 + "�� ��� �����" + (operend1 - operend2));
				break;
			case "*" :
				System.out.println(operend1 + "*" + operend2 + "�� ��� �����" + (operend1 * operend2));
				break;
			case "/" :
				if(operend1 == 0 || operend2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
				}
				else {
				System.out.println(operend1 + "/" + operend2 + "�� ��� �����" + (operend1 / operend2));
				}
				break;
			default:
				System.out.println("�߸��� ���Դϴ�.");
		}
		scanner.close();
	}
}