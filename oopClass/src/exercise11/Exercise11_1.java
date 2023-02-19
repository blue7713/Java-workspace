package exercise11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Exercise11_1 extends JFrame{
	public Exercise11_1() {
		setTitle("CheckBox practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox b1;
		JCheckBox b2;
		b1 = new JCheckBox("버튼 비활성화");
		b2 = new JCheckBox("버튼 감추기");
		JButton btn1 = new JButton("test button");
		b1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					btn1.setEnabled(false);
				}
				else {
					btn1.setEnabled(true);
				}
			}
		});
		b2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					btn1.setVisible(false);
				}
				else {
					btn1.setVisible(true);
				}
			}
		});
		
		c.add(b1);
		c.add(b2);
		c.add(btn1);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise11_1();
	}
}