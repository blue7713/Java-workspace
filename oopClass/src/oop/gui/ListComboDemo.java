package oop.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListComboDemo extends JFrame{
	private String[] options = {"Apple", "Strawberry", "Grape", " Banana", "Pear", "Kiwi", "Orange"};
	private JList<String> list = new JList<String>(options);
	private JComboBox<String> combo = new JComboBox<String>(options);
	private JTextField input = new JTextField(15);
	private JButton addButton = new JButton("Add Item");
	private JTextArea output = new JTextArea(options.length, 20);
	
	public ListComboDemo() {
		super("JList & JComboBox Demo");
		
		JPanel top = new JPanel();
		top.add(input);
		top.add(addButton);
		getContentPane().add(BorderLayout.NORTH, top);
		
		JPanel middle = new JPanel(new GridLayout(1, 2));
		middle.add(list);
		middle.add(combo);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				output.setText("");
				for(String item : list.getSelectedValuesList()) {
					output.append(item + "\n");
				}
			}
		});
		
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText("index: " + combo.getSelectedIndex() + ", " + combo.getSelectedItem());
			}
		});
		getContentPane().add(BorderLayout.CENTER, middle);
		
		getContentPane().add(BorderLayout.SOUTH, output);
		
		setBounds(100, 100, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ListComboDemo();
	}
}