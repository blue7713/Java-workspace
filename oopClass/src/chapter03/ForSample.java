package chapter03;
public class ForSample {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) { // 1~10���� �ݺ�
			sum += i;
			System.out.print(i); // ���ϴ� �� ���
			if(i <= 9) // 1~9������ '+' ���
				System.out.print("+");
			else { // i�� 10�ΰ��
				System.out.print("="); // '=' ����ϰ�
				System.out.print(sum); // ���� ��� ���
			}
		}
	}
}