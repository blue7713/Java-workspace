package exercise3;

import java.util.Scanner;

public class Exercise3_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오>>");
		int n = scanner.nextInt();
		if(n < 0) {
			System.out.println("잘못된 값입니다.");
			scanner.close();
			return;
		}
		
		for(int i = n; i > 0; i--) { // 입력받은 수를 1씩 줄임, 1까지 반복문 수행
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}