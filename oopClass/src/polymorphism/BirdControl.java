package polymorphism;

import java.util.Random;

class Bird{
	int age;
	String name;
	String color;
	
	static int totalBirds = 0;
	
	Bird(){ // 기본 생성자
		totalBirds++;
		System.out.println("default");
	}
	
	Bird(int age){ // 중복정의 overloading
		this();
		this.age = age;
	}
	
	Bird(int age, String name){
		this(age);
		this.name = name;
	}
	
	Bird(int age, String name, String color){
		this(age, name);
		this.color = color;
	}
	
	public void move() {
		System.out.println("Flying...");
	}
	
	static int howMany() {
		return totalBirds;
	}
}

class Eagle extends Bird{
	float speed;
	
	Eagle(){} // 기본 생성자, 상속 받았으므로 super(); 자동 생성됨
	
	Eagle(int age){
		super(age, "Ladyhawke"); // 부모인 Bird의 어느 것을 가지는지 명시
	}
	
	Eagle(int age, String name){
		super(age, name);
		this.color = "black";
		this.speed = 1.0f;
	}
	
	Eagle(int age, String name, String color){
		super(age, name, color);
		this.speed = 1.0f;
	}
	
	Eagle(int age, String name, String color, float speed){
		super(age, name, color); // 첫 줄은 super나 this 중 하나만 가능;
//		this(age, name, color);
		this.speed = speed;
	}
}
	
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