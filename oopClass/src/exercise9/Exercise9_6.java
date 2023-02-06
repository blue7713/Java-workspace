package exercise9;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.Color;

public class Exercise9_6 extends JFrame{
	public Exercise9_6() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);
		
		for(int i = 0; i < 20; i++) {
			int x = (int)(Math.random() * 200) + 50; // 50 ~ 250
			int y = (int)(Math.random() * 200) + 50; // 50 ~ 250
			JLabel l = new JLabel(" ");
			l.setBounds(x, y, 10, 10); // 절대 위치 지정 x좌표, y좌표, 가로 크기, 세로 크기
			l.setOpaque(true); // label에 배경색이 보이게 함
			l.setBackground(Color.blue);
			c.add(l);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise9_6();
	}
}