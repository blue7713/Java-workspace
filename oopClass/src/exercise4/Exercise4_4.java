package exercise4;

public class Exercise4_4 {

static class Rectangle{ // Static 변수가 붙은 변수나 클래스는 클래스가 메모리에 올라갈 때 자동으로 생성됨
	private int x;  	// 상위 클래스에 포함된 하위 클래스는 미리 생성하고 나서 사용이 가능합니다.
	private int y;
	private int width;
	private int height;
	
	Rectangle(int x, int y, int width, int height){ // 사각형의 좌표를 받음
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;	
	}
	
	public int square() { // 사각형의 넓이 리턴
		return (width * height);
	}
	
	public void show() { // 사각형의 좌표와 넓이를 화면에 출력
		System.out.println("(" + x + "," + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
	}
	
	public boolean contains(Rectangle r) { // 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
		if(x < r.x && y < r.y) {
			if((width + x) > (r.x + r.width) && (height + y) > (r.y + r.height)) {
				return true;
			}
		}
		return false;
	}
}

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) {
			System.out.println("t는 r을 포함합니다.");
		}
		if(t.contains(s)) {
			System.out.println("s는 r을 포함합니다.");
		}
	}
}