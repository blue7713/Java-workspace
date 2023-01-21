package exercise6;

import java.util.Scanner;

class Person3{
	private String name;
	private int num1;
	private int num2;
	private int num3;
	
	public Person3(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean game() {
		num1 = (int)(Math.random() * 3 + 1);
		num2 = (int)(Math.random() * 3 + 1);
		num3 = (int)(Math.random() * 3 + 1);
		System.out.print("\t" + num1 + " " + num2 + " " + num3 + " ");
		if(num1 == num2 && num2 == num3) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Exercise6_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1번쨰 선수 이름>>");
		String name = scanner.next();
		Person3 person1 = new Person3(name);
		System.out.print("2번째 선수 이름>>");
		name = scanner.next();
		Person3 person2 = new Person3(name);
		
		String buffer = scanner.nextLine();
		while(true) {
			System.out.print("[" + person1.getName() + "]:<Enter>");
			buffer = scanner.nextLine();
			if(person1.game()) {
				System.out.println(person1.getName() + "님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
			System.out.print("[" + person2.getName() + "]:<Enter>");
			buffer = scanner.nextLine();
			if(person2.game()) {
				System.out.println(person2.getName() + "님이 이겼씁니다!");
				break;
			}
			System.out.println("아쉽군요!");
		}
		scanner.close();
	}
}