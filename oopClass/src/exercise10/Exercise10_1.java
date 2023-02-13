package exercise10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise10_1 extends JFrame{
	private JLabel la = new JLabel("Love Java");
	
	public Exercise10_1() {
		setTitle("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		la.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent e) {
				la.setText("사랑해");
			}
			
			public void mouseEntered(MouseEvent e) {
				la.setText("Love Java");
			}
		});
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercise10_1();
	}
}