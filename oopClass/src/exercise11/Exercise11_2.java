package exercise11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Exercise11_2 extends JFrame{
	private JTextField tf = new JTextField(10);
	private JComboBox cb = new JComboBox();
	
	public Exercise11_2() {
		setTitle("JTextField and JComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField j = (JTextField)e.getSource();
				String temp = j.getText();
				j.setText("");
				cb.addItem(temp);
			}
		});
		
		c.add(tf);
		c.add(cb);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise11_2();
	}
}