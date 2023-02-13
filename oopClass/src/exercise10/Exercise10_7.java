package exercise10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise10_7 extends JFrame {
	public Exercise10_7() {
		setTitle("마우스 휠을 굴려 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("Love Java");
		la.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				Font f = la.getFont();
				int size = f.getSize();
				if(n < 0) { // 휠을 위로 굴리면 음수
					if(size - 5 > 0) {
						la.setFont(new Font("Arial", Font.PLAIN, size-5));
					}
				}
				else { // 휠을 아래로 굴리면 양수
					la.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
			}
		});
		
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercise10_7();
	}
}