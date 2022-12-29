package exercise2;

import java.util.Scanner;

public class Exercise2_12_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연산>>"); // 수와 연산 입력받기
		float operend1 = scanner.nextFloat();
		String operator = scanner.next();
		float operend2 = scanner.nextFloat();
		
		if (operator.equals("+")) { // 연산자 구분
			System.out.println(operend1 + "+" + operend2 + "의 계산 결과는 " + (operend1 + operend2));
		}
		else if(operator.equals("-")) {
			System.out.println(operend1 + "-" + operend2 + "의 계산 결과는 " + (operend1 - operend2));
		}
		else if(operator.equals("*")) {
			System.out.println(operend1 + "*" + operend2 + "의 계산 결과는 " + (operend1 * operend2));
		}
		else if(operator.equals("/") || operend1 == 0 || operend2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		else if(operator.equals("/")) {
			System.out.println(operend1 + "/" + operend2 + "의 계산 결과는 " + (operend1 / operend2));
		}
		else {
			System.out.println("잘못된 값입니다.");
		}
		scanner.close();
	}
}