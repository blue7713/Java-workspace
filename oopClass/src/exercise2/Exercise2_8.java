package exercise2;

import java.util.Scanner;

public class Exercise2_8 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 점의 좌표를 입력하시오>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int rectx1 = 100;
		int recty1 = 100;
		int rectx2 = 200;
		int recty2 = 200;
		// 입력받은 직사각형의 좌표가 기존 직사각형과 충돌하면 true
		if(inRect(x1, y1, rectx1, recty1, rectx2, recty2) == true
				|| inRect(x2, y2, rectx1, recty1, rectx2, recty2) == true) {
			System.out.println("충돌하였습니다.");
		}
		else {
			System.out.println("충돌하지 않습니다.");
		}
		scanner.close();
	}
}