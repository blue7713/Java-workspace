package exercise9;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Container;
import java.awt.GridLayout;

public class Exercise9_3 extends JFrame {
	public Exercise9_3() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		
		for(int i = 0; i < 10; i++) {
			c.add(new JButton(Integer.toString(i)));
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise9_3();
	}
}