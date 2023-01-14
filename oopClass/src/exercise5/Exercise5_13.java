package exercise5;

interface Shape2{
	final double PI = 3.14; // 상수
	void draw(); // 도형을 그리는 추상 메소드
	double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	default public void redraw() { // 디폴드 메소드
		System.out.print("-- 다시 그립니다.");
		draw();
	}
}

class Circle2 implements Shape2{
	private int r; // 원의 반지름
	
	Circle2(int r){
		this.r = r;
	}

	@Override
	public void draw() { // 도형을 그리는 메소드
		System.out.println("반지름이 " + r + "인 원입니다.");
	}

	@Override
	public double getArea() { // 도형의 면적을 리턴하는 메소드
		return r * r * PI;
	}
}

public class Exercise5_13 {

	public static void main(String[] args) {
		Shape2 donut = new Circle2(10); // 반지름이 10인 원 객체
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}