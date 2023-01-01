package exercise3;

import java.util.Scanner;

public class Exercise3_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number[] = new int[10]; // 10개짜리 배열 생성
		System.out.println("양의 정수 10개를 입력하시오>>");
		
		for(int i = 0; i < number.length; i++) {
			number[i] = scanner.nextInt();
			}
		
		System.out.print("3의 배수는 ");
		for(int i = 0; i < 10; i++) { // 양의 정수를 배열에 할당
			if(number[i] % 3 == 0) {
				System.out.print(number[i] + " ");
			}
		}
		scanner.close();
	}
}