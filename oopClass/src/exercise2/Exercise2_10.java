package exercise2;

import java.util.Scanner;

public class Exercise2_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 원의 중심과 반지름 입력>>");
		double x1 = scanner.nextDouble(); // 첫번째 원의 중심
		double y1 = scanner.nextDouble();
		double radius1 = scanner.nextDouble(); // 첫번째 원의 반지름
		
		System.out.println("두 번째 원의 중심과 반지름 입력>>");
		double x2 = scanner.nextDouble(); // 두번째 원의 중심
		double y2 = scanner.nextDouble();
		double radius2 = scanner.nextDouble(); // 두번쨰 원의 중심
		
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		if ((distance < radius1)||(distance < radius2)){
			System.out.println("두 원은 서로 겹칩니다.");
			
		scanner.close();	
		}
	}
}