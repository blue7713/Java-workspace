package polymorphism;

class Lamp implements Light {
	int knob;
	
	public void on() {
		knob = 30;
		System.out.println("L.on()");
	}
	public void off() {
		knob = 0;
		System.out.println("L.off()");
	}
	public void brighten() {
		knob = knob + 5;
		System.out.println("L.brighten()");
	}
	public void dim() {
		knob = knob - 5;
		System.out.println("L.dim()");
	}
}