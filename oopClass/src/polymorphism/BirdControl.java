package polymorphism;

import java.util.Random;

class Bird{
	public void move() {
		System.out.println("Flying...");
	}
}
class Eagle extends Bird{}
class Penguin extends Bird{
	public void move() {
		System.out.println("Sliding...");
	}
}
class Goose extends Bird{
	public void move() {
		System.out.println("Running");
	}
}
class WildGoose extends Bird{
	public void move() {
		System.out.println("Running faster...");
	}
}

public class BirdControl {
	static Bird getBird(int type) {
		switch(type) {
		case 0:
			return new Eagle();
		case 1:
			return new Penguin();
		case 2:
			return new Goose();
		case 3:
			return new WildGoose();
		default:
			return new Bird();
		}
	}
	public static void main(String[] args) {
		Random r = new Random();
		Bird[] allBirds = new Bird[r.nextInt(10)];
		for(int i = 0; i < allBirds.length; i++) {
			allBirds[i] = getBird(r.nextInt(5));
			System.out.print(allBirds[i].getClass().getName() + ": ");
			allBirds[i].move();
		}
	}
}