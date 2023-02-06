package exercise9;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Color;

public class Exercise9_4 extends JFrame{
	public Exercise9_4() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Color color[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.magenta, Color.GRAY, Color.PINK, Color.LIGHT_GRAY}; 
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		
		JButton btn[] = new JButton[10];
		
		for(int i = 0; i < 10; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise9_4();
	}
}