package oop.inheritance;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class ClickListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("You clicked me!");
	}
}

public class ButtomFrame extends JFrame {
	JButton button = new JButton("Click Me");
	
	public ButtomFrame() {
		button.addActionListener(new ClickListener());
		add(button);
		setBounds(800, 800, 100, 80);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ButtomFrame window = new ButtomFrame();
	}
}