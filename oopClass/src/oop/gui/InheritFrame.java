package oop.gui;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class InheritFrame extends JFrame{
	public InheritFrame(String title) {
		super(title);
		Container c = this.getContentPane();
		System.out.println("Default LayoutManager of JFrame: " + c.getLayout());
		
		c.add(new JButton("CENTER"), BorderLayout.CENTER);
		this.setBounds(200, 200, 300, 120);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Scanner scanner = new Scanner(System.in);
		HaveFrame.holdOn(scanner, "1. Press [Enter] to proceed.");
		
		c.add(new JTextField("Type in here..."), BorderLayout.SOUTH);
		c.validate();
		HaveFrame.holdOn(scanner, "2. Press [Enter] to proceed.");
		
		c.add(new JLabel("Welcome!"), BorderLayout.NORTH);
		c.validate();
		HaveFrame.holdOn(scanner, "3. Press [Enter] to proceed.");
		
		c.add(new JButton("WEST"), BorderLayout.WEST);
		c.validate();
	}
	
	public static void main(String[] args) {
		new InheritFrame("InheritFrame Window");
	}
}