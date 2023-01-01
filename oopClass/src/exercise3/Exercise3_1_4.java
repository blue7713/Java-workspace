package exercise3;

public class Exercise3_1_4 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		do { // 조건문이 참이면 do 구문 실행, 조건문이 false여도 한 번 더 실행 후 마무리
			i = i + 2;
			sum = sum + i;
		}
		while(i < 98);{
		}
		System.out.println(sum);
	}
}