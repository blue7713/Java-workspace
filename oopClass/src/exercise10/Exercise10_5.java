package exercise10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise10_5 extends JFrame {
	public Exercise10_5() {
		setTitle("+, - 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 10)); // Arial 폰트로 10 픽셀 크기
		c.add(la);
		c.setFocusable(true);
		c.requestFocus();
		
		c.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				Font temp = la.getFont();
				int size = temp.getSize();
				if(e.getKeyCode() == KeyEvent.VK_ADD || e.getKeyCode() == KeyEvent.VK_EQUALS) {
					la.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
				if(e.getKeyCode() == KeyEvent.VK_MINUS || e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
					if(size - 5 > 0) {
						la.setFont(new Font("Arial", Font.PLAIN, size - 5));
					}
				}
			}
		});
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercise10_5();
	}
}