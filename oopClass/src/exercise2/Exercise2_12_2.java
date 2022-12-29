package exercise2;

import java.util.Scanner;

public class Exercise2_12_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연산>>");
		float operend1 = scanner.nextFloat();
		String operator = scanner.next();
		float operend2 = scanner.nextFloat();
		
		switch(operator) {
			case "+" :
				System.out.println(operend1 + "+" + operend2 + "의 계산 결과는" + (operend1 + operend2));
				break;
			case "-" :
				System.out.println(operend1 + "-" + operend2 + "의 계산 결과는" + (operend1 - operend2));
				break;
			case "*" :
				System.out.println(operend1 + "*" + operend2 + "의 계산 결과는" + (operend1 * operend2));
				break;
			case "/" :
				if(operend1 == 0 || operend2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				else {
				System.out.println(operend1 + "/" + operend2 + "의 계산 결과는" + (operend1 / operend2));
				}
				break;
			default:
				System.out.println("잘못된 값입니다.");
		}
		scanner.close();
	}
}