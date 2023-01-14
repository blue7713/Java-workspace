package exercise5;

class PositivePoint extends Point{
	
	public PositivePoint(){
		super(0, 0);
	}
	
	public void move(int x, int y) {
		if(x > 0 && y > 0) {
			super.move(x, y);
		}
		else {
			return;
		}	
	}
	
	public String toString() {
		return "(" + getX() + ", " + getY() + ")의 점";
	}
}

public class Exercise5_8 {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint();
		p.move(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
}