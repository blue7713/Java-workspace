package exercise2;
import java.util.Scanner;

public class Exercise2_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		int ������ = money / 50000;
		if(������ > 0) {
			System.out.println("��������:" + ������ + "��");
		}
		int ���� = (money%50000) / 10000;
		if(���� > 0)
			System.out.println("������:" + ���� + "��");
		
		int õ�� = ((money%50000)%10000) / 1000;
		if(õ�� > 0)
			System.out.println("õ����:" + õ�� + "��");
		
		int ��� = (((money%50000)%10000)%1000) / 100;
		if(��� > 0)
			System.out.println("���:" + ��� + "��");
		
		int �ʿ� = ((((money%50000)%10000)%1000)%100) / 10;
		if(�ʿ� > 0)
			System.out.println("�ʿ�:" + �ʿ� + "��");
		
		int �Ͽ� = (((((money%50000)%10000)%1000)%100)%10) / 1;
		if(�Ͽ� > 0)
			System.out.println("�Ͽ�:" + �Ͽ� + "��");
		
		scanner.close();
	}
}