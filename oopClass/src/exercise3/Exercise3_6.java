package exercise3;

import java.util.Scanner;

public class Exercise3_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50 , 10, 1}; // 환산할 돈의 종류
		
		System.out.println("금액을 입력하시오>>");
		int money = scanner.nextInt(); // 돈을 입력받음
		
		int i = 0; //반복문을 위한 인수
		while(i != 8) {
			int 오만원 = money / unit[i];
			i++;
			int 만원 = (money % unit[0]) / unit[i];
			i++;
			int 천원 = ((money % unit[0]) % unit[1]) / unit[i];
			i++;
			int 오백원 = (((money % unit[0]) % unit[1]) % unit[2]) / unit[i];
			i++;
			int 백원 = ((((money % unit[0]) % unit[1]) % unit[2]) % unit[3]) / unit[i];
			i++;
			int 오십원 = (((((money % unit[0]) % unit[1]) % unit[2]) % unit[3]) % unit[4]) / unit[i];
			i++;
			int 십원 = ((((((money % unit[0]) % unit[1]) % unit[2]) % unit[3]) % unit[4]) % unit[5]) / unit[i];
			i++;
			int 일원 = (((((((money % unit[0]) % unit[1]) % unit[2]) % unit[3]) % unit[4]) % unit[5]) % unit[6]) / unit[i];
			i++;
			System.out.println("50000원 짜리 : " + 오만원);
			System.out.println("10000원 짜리 : " + 만원);
			System.out.println("1000원 짜리 : " + 천원);
			System.out.println("500원 짜리 : " + 오백원);
			System.out.println("100원 짜리 : " + 백원);
			System.out.println("50원 짜리 : " + 오십원);
			System.out.println("10원 짜리 : " + 십원);
			System.out.println("1원 짜리 : " + 일원);
		}
		scanner.close();
	}
}