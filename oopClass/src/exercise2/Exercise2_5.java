package exercise2;

import java.util.Scanner;

public class Exercise2_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하시오>>");
		int x = scanner.nextInt(); // 삼각형 변의 길이를 x, y, z에 할당
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		// 삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야한다.
		if((x + y < z)||(x + z < y)||(y + z < x)){
			System.out.println("삼각형을 만들 수 없습니다.");
		} // 두 변의 합이 한 변의 합보다 작은 경우
		else
			System.out.println("삼각형이 됩니다.");
		scanner.close();
	}
}