package oop.module;

class Ring{
	private static Ring onlyRing;
	
	private Ring() {
		System.out.println("Ring(): Only Sauron can make.");
	}
	
	public static Ring makeRing(String s) {
		if(s.equals("Sauron") && onlyRing == null) {
			onlyRing = new Ring();
		}
		return onlyRing;
	}
	
	public void access() {
		System.out.println("My Lord!");
	}
}

public class TheOneRing {
	public static void main(String[] args) {
//		Ring gollum = new Ring(); // private, error!
		Ring sauron = Ring.makeRing("Sauron");
		sauron.access();
	}
}