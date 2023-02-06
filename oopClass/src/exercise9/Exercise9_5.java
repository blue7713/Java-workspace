package exercise9;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

public class Exercise9_5 extends JFrame{
	public Exercise9_5() {
		setTitle("4 x 4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color color[] = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.magenta, Color.DARK_GRAY, Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK, Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA};
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));
		
		for(int i = 0; i < 16; i++) {
			JLabel l = new JLabel(Integer.toString(i));
			l.setBackground(color[i]);
			l.setOpaque(true); // JLabel의 배경색은 기본적으로 투명, Opaque값을 미리 true로 미리 설정해 주어야 배경색이 적용됨
			c.add(l);
		}
		
		setSize(400, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercise9_5();
	}
}