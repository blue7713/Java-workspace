package oop.inheritance;

public class AdventureMovie {
	public static void play(Action a) {
		a.play();
	}
	public static void fight(CanFight c) {
		c.fight();
	}
	public static void swim(CanSwim c) {
		c.swim();
	}
	public static void fly(CanFly c) {
		c.fly();
	}
	
	public static void main(String[] args) {
		Hero superman = new Hero();
		play(superman);
		fight(superman);
		swim(superman);
		fly(superman);
	}
}