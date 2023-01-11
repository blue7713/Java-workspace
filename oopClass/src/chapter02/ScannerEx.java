package chapter02;
import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next(); // ���ڿ� �б�
		System.out.println("�̸��� " + name + ",");
		
		String city = scanner.next(); // ���ڿ� �б�
		System.out.println("���ô� " + city + ",");
		
		int age = scanner.nextInt(); // ���� �б�
		System.out.println("���̴� " + age + ",");
		
		double weight = scanner.nextDouble(); // �Ǽ� �б�
		System.out.println("ü���� " + weight + ",");
		
		boolean isSingle = scanner.nextBoolean(); // ���� �б�
		System.out.println("���� ���δ� " + isSingle + "�Դϴ�");
		scanner.close(); // Scanner ��ü �ݱ�
	}
}