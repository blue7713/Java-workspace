package exercise12;

import java.awt.*;
import javax.swing.*;

public class Exercise12_9 extends JFrame{
		
	public Exercise12_9() {
		setTitle("Blue Label 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		BlueLabel label1 = new BlueLabel("hello");
		label1.setFont(new Font("고딕", Font.PLAIN, 10));
		label1.setForeground(Color.YELLOW);
		label1.setOpaque(true);
		
		BlueLabel label2 = new BlueLabel("Big Hello");
		label2.setFont(new Font("고딕", Font.ITALIC, 50));
		label2.setForeground(Color.MAGENTA);
		label2.setOpaque(true);
		
		c.add(label1);
		c.add(label2);
		
		setSize(350, 300);
		setVisible(true);
	}

	class BlueLabel extends JLabel{
		public BlueLabel(String s) {
			setText(s);
			setBackground(Color.BLUE);
		}
		
		@Override
		public void setBackground(Color color) {
			super.setBackground(Color.BLUE);
		}
	}
	
	public static void main(String[] args) {
		new Exercise12_9();

	}
}