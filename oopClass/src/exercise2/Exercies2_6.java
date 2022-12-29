package exercise2;

import java.util.Scanner;

public class Exercies2_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~99 사이의 정수를 입력하시오>>");
		int number = scanner.nextInt();
		// (십의 자리 수 + 일의 자리 수)가 3의 배수인 경우 출력
		int ten = number / 10; // 십의 자리수
		int one = number % 10; // 일의 자리수
		if(number < 10) { // 10이하의 경우
			if(number % 3 == 0) {
			System.out.println("박수짝");
			}
			else
				System.out.println("3의 배수가 아닙니다");
		}
		else if(number > 10) { // 10 이상의 경우
			if((ten % 3 == 0)&&(one % 3 == 0)) { // 둘 다 3의 배수인경우
				System.out.println("박수짝짝");
			}
			else if(ten % 3 == 0) { // 한 개만 3의 배수인 경우
				System.out.println("박수짝");
			}
			else if(one % 3 == 0) {
				System.out.println("박수짝");
			}
			else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		scanner.close();
	}
}