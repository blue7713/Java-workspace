package oop.gui;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.Constructor;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;

public class ButtonGroups extends JFrame{
	private static String[] options = {"Option1", "Option2", "Option3", "Option4", "Option5"};
	
	static JPanel makePanel(Class<? extends AbstractButton> kind, String[] ids) {
		JPanel jp = new JPanel();
		jp.setBorder(new TitledBorder(kind.getSimpleName()));
		ButtonGroup bg = new ButtonGroup();
		ItemListener listener = new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				AbstractButton source = (AbstractButton)e.getSource();
				System.out.println("ItemEvent: " + source.getActionCommand() + " is selected: " + source.isSelected());
			}
		};
		for(String id : ids) {
			try {
				Constructor cstr = kind.getConstructor(String.class);
				AbstractButton ab = (AbstractButton)cstr.newInstance(id);
				bg.add(ab);
				jp.add(ab);
				ab.addItemListener(listener);
			}
			catch(Exception ex) {}
		}
		return jp;
	}
	public ButtonGroups() {
		setLayout(new FlowLayout());
		
		add(makePanel(JButton.class, options));
		add(makePanel(JToggleButton.class, options));
		add(makePanel(JCheckBox.class, options));
		add(makePanel(JRadioButton.class, options));
		
		setBounds(100, 100, 500, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ButtonGroups();
	}
}