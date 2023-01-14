package exercise5;

class Oval implements Shape2{
	private int a;
	private int b;
	
	Oval(int a, int b){
		this.a = a;
		this.b = b;
	}

	@Override
	public void draw() {
		System.out.println(" " + a + "x" + b + "크기의 사각형 입니다.");
	}

	@Override
	public double getArea() {
		return a * b * PI;
	}
}

class Rect2 implements Shape2{
	private int a;
	private int b;
	
	Rect2(int a, int b){
		this.a = a;
		this.b = b;
	}

	@Override
	public void draw() {
		System.out.println(" " + a + "x" + b +"에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		return a * b;
	}
}

public class Exercise5_14 {

	public static void main(String[] args) {
		Shape2[] list = new Shape2[3]; // Shape을 상속받은 클래스 객체의 래퍼런스 배열
		list[0] = new Circle2(10); // 반지름이 10인 원 객체
		list[1] = new Oval(20, 30); // 20 x 30 사각형에 내접하는 타원
		list[2] = new Rect2(10, 40); // 10 x 40 크기의 사각형

		for(int i = 0; i < list.length; i++) {
			list[i].redraw();
		}
		for(int i = 0; i < list.length; i++) {
			System.out.println("면적은 " + list[i].getArea());
		}
	}
}
