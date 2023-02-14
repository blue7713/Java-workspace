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

public class showAllListeners3 extends JFrame{
	private JTextField name = new JTextField("JTextArea", 25);
	private JTextArea results = new JTextArea(40, 35);
	
	public showAllListeners3() {
		name.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				results.append(e.getActionCommand() + "\n");
			}
		});
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
		new showAllListeners3();
	}
}
