package polymorphism;

public class RoomControl {
	public static void main(String[] args) {
		Bulb red = new Bulb();
		Lamp yellow = new Lamp();
		
		red.on();
		yellow.on();
		
		red.brighten();
		yellow.brighten();
		
		red.dim();
		yellow.dim();
		
		red.off();
		yellow.off();
	}
}