package exercise2;

import java.util.Scanner;

public class Exercise2_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù��° ���� �߽ɰ� ������ �Է�>>");
		double x1 = scanner.nextDouble(); // ù��° ���� �߽�
		double y1 = scanner.nextDouble();
		double radius1 = scanner.nextDouble(); // ù��° ���� ������
		
		System.out.println("�� ��° ���� �߽ɰ� ������ �Է�>>");
		double x2 = scanner.nextDouble(); // �ι�° ���� �߽�
		double y2 = scanner.nextDouble();
		double radius2 = scanner.nextDouble(); // �ι��� ���� �߽�
		
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		if ((distance < radius1)||(distance < radius2)){
			System.out.println("�� ���� ���� ��Ĩ�ϴ�.");
			
		scanner.close();	
		}
	}
}