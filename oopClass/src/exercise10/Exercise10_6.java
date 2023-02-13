package exercise10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise10_6 extends JFrame{
	public Exercise10_6() {
		setTitle("클릭 연습 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("C");
		la.setBounds(100, 100, 10, 10); // x, y, 폭, 높이
		la.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int x = (int)(Math.random() * c.getWidth());
				int y = (int)(Math.random() * c.getHeight());
				la.setLocation(x, y);
			}
		});
		
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercise10_6();
	}
}