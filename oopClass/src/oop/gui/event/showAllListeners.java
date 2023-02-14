package oop.gui.event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyListener implements ActionListener{
	JTextField name;
	JTextArea results;
	
	public MyListener(JTextField tf, JTextArea ta) {
		this.name = tf;
		this.results = ta;
	}
	
	public void actionPerformed(ActionEvent e) {
		results.append(e.getActionCommand() + "\n");
	}
}

public class showAllListeners extends JFrame {
	private JTextField name = new JTextField("JTextArea", 25);
	private JTextArea results = new JTextArea(40, 35);
	
	public showAllListeners() {
		name.addActionListener(new MyListener(name, results));
		JPanel top = new JPanel();
		top.add(new JLabel("Type Swing class name (press Enter):"));
		top.add(name);
		add(BorderLayout.NORTH, top);
		add(BorderLayout.CENTER, new JScrollPane(results));
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		name.postActionEvent();
	}

	public static void main(String[] args) {
		new showAllListeners();
	}
}