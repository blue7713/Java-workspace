package polymorphism;

public class InitValue {
	boolean b;
	char c;
	int i;
	float f;
	String s;
	
	{
		printAll("1. non-static block");
		b = true;
		c = 'w';
		i = 10;
		f = 3.14f;
		s = "Hi";
	}
	
	public InitValue() {}
	public InitValue(boolean b, char c, int i, float f, String s) {
		this.b = b;
		this.c = c;
		this.i = i;
		this.f = f;
		this.s = s;
	}
	void printAll(String m) {
		String out = String.format("%s: b(%s), c(%c), i(%d), f(%f), s(%s)", m, b, c, i ,f ,s);
		System.out.println(out);
	}
	
	public static void main(String[] args) {
		new InitValue().printAll("default constructor");
		new InitValue(true, 'd', 100, 3.3f, "ok").printAll("init constructor");

	}

}
