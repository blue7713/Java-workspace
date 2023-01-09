package exercise4;

import java.util.Scanner;

public class Exercise4_5 {
	
	static class Circle{
		private double x;
		private double y;
		private int radius;
		
		public Circle(double x, double y, int radius) {
			this.x = x;
			this.y = y;
			this.radius = radius;
		}
		
		public void show() {
			System.out.println("(" + x + "," + y + ")" + radius);
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
		for(int i = 0; i < c.length; i++) {
			System.out.println("x, y, radius >>");
			double x = scanner.nextDouble(); // x값 읽기
			double y = scanner.nextDouble(); // y값 읽기
			int radius = scanner.nextInt(); // 반지름 읽기
			c[i] = new Circle(x, y, radius); // Circle 객체 생성
		}
		for(int i = 0; i < c.length; i++) { // 모든 Circle 객체 출력
			c[i].show();
		}
		scanner.close();
	}
}