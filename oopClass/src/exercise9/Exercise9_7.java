package exercise9;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Exercise9_7 extends JFrame{
	public Exercise9_7() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel north = new JPanel();
		north.setLayout(new FlowLayout());
		north.setBackground(Color.LIGHT_GRAY);
		north.add(new JLabel("수식입력"));
		north.add(new JTextField(" ", 20));
		
		c.add(north, BorderLayout.NORTH);
		
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(4, 4, 5, 5)); // 4 x 4 배치, 수평, 수직 간격 5
		JButton btn[] = new JButton[16];
		String name[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "CE", "계산", "+", "-", "x", "/"};
		for(int i = 0; i < 16; i++) {
			btn[i] = new JButton(name[i]);
			if(i >= 12) {
				btn[i].setBackground(Color.green);
			}
			center.add(btn[i]);
		}
		c.add(center, BorderLayout.CENTER);
		
		JPanel south = new JPanel();
		south.setLayout(new FlowLayout());
		south.setBackground(Color.yellow);
		south.add(new JLabel("계산 결과"));
		south.add(new JTextField(" ", 20));
		c.add(south, BorderLayout.SOUTH);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise9_7();
	}
}