package oop.inheritance;

interface Action {
	default void play() {
		System.out.println("go!");
	}
}

interface CanFight extends Action {
	void fight();
}

interface CanSwim extends Action {
	void swim();
}

interface CanFly extends Action {
	void fly();
}

abstract class ActionCharacter {
	public void fight() {
		System.out.println("ActionCharacter.fight()");
	}

	public abstract void play();
}