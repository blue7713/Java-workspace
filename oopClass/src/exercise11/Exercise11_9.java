package exercise11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exercise11_9 extends JFrame{
	private JButton btn[] = new JButton[3];
	private ImageIcon image[] = {new ImageIcon("images/bawi.jpg"), new ImageIcon("images/gawi.jpg"), new ImageIcon("images/bo.jpg")};
	private JLabel me = new JLabel("me");
	private JLabel com = new JLabel("com");
	private JLabel result = new JLabel();
	private int mySelect;
	private int comSelect;
	
	public Exercise11_9() {
		setTitle("가위 바위 보 개임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel top = new JPanel();
		top.setLayout(new FlowLayout());
		for(int i = 0; i < 3; i++) {
			btn[i] = new JButton(image[i]);
			btn[i].addActionListener(new action(i));
			top.add(btn[i]);
		}
		
		top.setBackground(Color.DARK_GRAY);
		c.add(top, BorderLayout.NORTH);
		
		JPanel center = new JPanel();
		center.setLayout(new FlowLayout());
		center.add(me);
		center.add(com);
		center.add(result);
		center.setBackground(Color.YELLOW);
		c.add(center);
		
		setSize(1000, 700);
		setVisible(true);
	}
	
	class action implements ActionListener {
		int index;
		action(int i){
			index = i;
		}
		public void actionPerformed(ActionEvent e) {
			mySelect = index;
			comSelect = (int)(Math.random() * 3);
			me.setIcon(image[mySelect]);
			com.setIcon(image[comSelect]);
			if(mySelect - comSelect == 0) {
				result.setText("Same !!!");
			}
			else if(mySelect - comSelect == -2 || mySelect - comSelect == 1) {
				result.setText("Me !!!");
			}
			else {
				result.setText("Com !!!");
			}
		}
	}

	public static void main(String[] args) {
		new Exercise11_9();
	}
}