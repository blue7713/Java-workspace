package polymorphism;

import java.util.Random;

public class BirdCage {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.print("Befor. Total = ");
		System.out.println(Bird.howMany());
		
		Bird[] all = new Bird[r.nextInt(10)];
		for(int i = 0; i < all.length; i++) {
			all[i] = BirdControl.getBird(r.nextInt(5));
			
			System.out.print("In. Total = ");
			System.out.print(Bird.howMany());
			System.out.print(", " + all[i].howMany());
			System.out.println(", " + all[i].totalBirds);
		}
		
		System.out.print("After. Total = ");
		System.out.println(Bird.howMany());
	}	
}