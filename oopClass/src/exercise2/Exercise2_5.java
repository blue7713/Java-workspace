package exercise2;

import java.util.Scanner;

public class Exercise2_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��Ͻÿ�>>");
		int x = scanner.nextInt(); // �ﰢ�� ���� ���̸� x, y, z�� �Ҵ�
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		// �ﰢ���� �Ƿ��� �� ���� ���� �ٸ� �� ���� �պ��� Ŀ���Ѵ�.
		if((x + y < z)||(x + z < y)||(y + z < x)){
			System.out.println("�ﰢ���� ���� �� �����ϴ�.");
		} // �� ���� ���� �� ���� �պ��� ���� ���
		else
			System.out.println("�ﰢ���� �˴ϴ�.");
		scanner.close();
	}
}