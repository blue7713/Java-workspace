package exercise9;

import javax.swing.JFrame;

public class Exercise9_1 extends JFrame {
	public Exercise9_1() {
		setTitle("Let's study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise9_1();
	}
}