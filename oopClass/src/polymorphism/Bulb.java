package polymorphism;

class Bulb implements Light {
	int watt;
	
	public void on() {
		watt = 50;
		System.out.println("B.on()");
	}
	public void off() {
		watt = 0;
		System.out.println("B.off()");
	}
	public void brighten() {
		watt = watt + 10;
		System.out.println("B.brighten()");
	}
	public void dim() {
		watt = watt - 10;
		System.out.println("B.dim()");
	}
}