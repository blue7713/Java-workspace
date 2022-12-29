package exercise2;

import java.util.Scanner;

public class Exercies2_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점 x, y의 좌표를 입력하시오>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int x1 = 100;
		int y1 = 100;
		int x2 = 200;
		int y2 = 200;
		// 입력받은 x, y가 100~200사이에 있는지 확인
		if((x >= x1) && (x <= x2) && (y >= y1) && (y <= y2)) {
			System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");
		}
		else {
			System.out.println("(" + x + "," + y + ")는 사각형 안에 없습니다.");
		}
		scanner.close();
	}	
}