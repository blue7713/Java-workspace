package exercise4;

import java.util.Scanner;

public class Exercise4_6 {
	static class Circle{
		double x;
		double y;
		int radius;
		
		public Circle(double x, double y, int radius) {
			this.x = x;
			this.y = y;
			this.radius = radius;
		}
		
		public void show() { 
			System.out.println("(" + x + "," + y + ")" +radius);
		}
		
		public int getRadius() {
			return radius;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Circle c[] = new Circle[3];
		int max = 0; // 최댓값을 구하기 위한 변수선언
		for(int i = 0; i < c.length; i++ ) {
			System.out.println("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		
		for(int i = 0; i < c.length; i++) {
			if(max < c[i].getRadius()) {
				max = c[i].getRadius();
			} // max에 가장 큰 반지름 대입
		}
		for(int i = 0; i < c.length; i++) {
			if(max == c[i].getRadius()) {
				System.out.print("가장 면적이 큰 원은 ");
				c[i].show();
			}
		}
		scanner.close();
	}
}