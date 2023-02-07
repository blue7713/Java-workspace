package oop.gui;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class HaveFrame {
	public static void holdOn(Scanner scanner, String message) {
		System.out.print(message);
		scanner.nextLine();
	}
	
	public static void main(String[] args) {
		JFrame win = new JFrame("Title comes here....");
		Container c = win.getContentPane();
		System.out.println("Default LayoutManager of JFrame: " + c.getLayout());
		c.add(new JButton("CENTER"), BorderLayout.CENTER);
		win.setBounds(200, 200, 300, 120);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Scanner scanner = new Scanner(System.in);
		holdOn(scanner, "1. Press [Enter] to proceed.");
		
		c.add(new JTextField("Type in here..."), BorderLayout.SOUTH);
		c.validate();
		holdOn(scanner, "2. Press [Enter] to proceed.");
		
		c.add(new JLabel("Welcome!"), BorderLayout.NORTH);
		c.validate();
		holdOn(scanner, "3. Press [Enter] to proceed.");
		
		c.add(new JButton("WEST"), BorderLayout.WEST);
		c.validate();
	}
}