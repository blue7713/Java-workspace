package exercise11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise11_10 extends JFrame{
	private JLabel num[] = new JLabel[10];
	private int nowindex;
	
	public Exercise11_10() {
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i = 0; i < 10; i++) {
			num[i] = new JLabel(Integer.toString(i));
			num[i].setSize(10, 10);
			num[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JLabel temp = (JLabel)e.getSource();
					int num = Integer.parseInt(temp.getText());
					if(num == nowindex) {
						temp.setVisible(false);
						nowindex++;
					}
					if(nowindex == 10) {
						setting();
					}
				}
			});
			c.add(num[i]);
		}
		setting();
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public void setting() {
		nowindex = 0;
		for(int i = 0; i < 10; i++) {
			int x = (int)(Math.random() * 300);
			int y = (int)(Math.random() * 300);
			
			num[i].setLocation(x, y);
			num[i].setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Exercise11_10();
	}
}