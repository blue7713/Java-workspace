package oop.inheritance;

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
	@Override
	public void fly() {
		System.out.println("Hero.fly()");
		super.fight();
	}

	@Override
	public void swim() {
		System.out.println("Hero.swim()");
	}

	@Override
	public void play() {
		System.out.println("Hero.play()");
		CanFight.super.play();
	}
}