package control.loop.demo;

public class LoopExample {
	public static boolean getBoolean() {
		boolean doLoop = Math.random() < 0.8;
		if(!doLoop) {
			System.out.println("false!");
		}
		return doLoop;
	}
	
	public static void main(String[] args) {
		int loopCounter = 0;
		
		while(getBoolean()) {
			loopCounter++;
			System.out.print("true");
		}
		System.out.println("while ended (loopCounter=" + loopCounter + ").");
		
		loopCounter = 0;
		do {
			loopCounter++;
			System.out.print("true.");
		}
		while(getBoolean());
		System.out.println("do-while ended (loopCounter=" + loopCounter + ").");
		
		for(char c = 0; c < 128; c++) {
			if(Character.isLowerCase(c)) { // print lower case alphabet.
				System.out.println("char(" + c + ") value = " + (int)c);
			}
		}
	}
}