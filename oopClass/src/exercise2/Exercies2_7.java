package exercise2;

import java.util.Scanner;

public class Exercies2_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�� x, y�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int x1 = 100;
		int y1 = 100;
		int x2 = 200;
		int y2 = 200;
		// �Է¹��� x, y�� 100~200���̿� �ִ��� Ȯ��
		if((x >= x1) && (x <= x2) && (y >= y1) && (y <= y2)) {
			System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
		}
		else {
			System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �����ϴ�.");
		}
		scanner.close();
	}	
}