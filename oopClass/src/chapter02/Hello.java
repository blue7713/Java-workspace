package chapter02;
public class Hello {

	public static int sum(int n, int m) {
		return n + m;
	}
	
	// main() �޼ҵ忡�� ���� ����
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s = sum(i,10); // �޼ҵ� ȣ��
		a = '?';
		System.out.println(a); // ���� '?' ���
		System.out.println("Hello"); // "Hello" ���ڿ� ���
		System.out.println(s); // ���� s �� 30 ���

	}

}
