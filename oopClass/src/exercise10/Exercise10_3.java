package exercise10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise10_3 extends JFrame {
	public Exercise10_3() {
		setTitle("Left키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		c.add(la);
		c.setFocusable(true);
		c.requestFocus();
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					String text = la.getText();
					if(text.equals("Love Java")) {
						la.setText("avaJ evoL");
					}
					else {
						la.setText("Love Java");
					}
				}
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercise10_3();
	}
}