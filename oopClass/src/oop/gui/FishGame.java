package oop.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;

public class FishGame extends JFrame{
	private Icon[] icons = new Icon[] {new ImageIcon("images/face-plain.png"),
			new ImageIcon("images/face-smirk.png"),
			new ImageIcon("images/face-suprise.png"),
			new ImageIcon("images/face-tired.png"),
			new ImageIcon("images/emblem-notice.png"),
			new ImageIcon("images/babelfish.png"),
			new ImageIcon("images/emblem-favorite.png"),
			new ImageIcon("images/face-devilish.png")};
	
	private JLabel info = new JLabel("move fish =>", icons[4], SwingConstants.LEFT);
	private BasicArrowButton up = new BasicArrowButton(BasicArrowButton.NORTH),
			down = new BasicArrowButton(BasicArrowButton.SOUTH),
			left = new BasicArrowButton(BasicArrowButton.LEFT),
			right = new BasicArrowButton(BasicArrowButton.RIGHT);
	private JButton addFeed = new JButton("Feed", icons[0]);
	private JToggleButton holdPlay = new JToggleButton("Hold", icons[3]);
	
	public FishGame(String title) {
		super(title);
		
		JPanel controls = new JPanel();
		controls.add(info);
		controls.add(up);
		controls.add(down);
		controls.add(left);
		controls.add(right);
		
		controls.add(addFeed);
		addFeed.setRolloverIcon(icons[1]);
		addFeed.setPressedIcon(icons[2]);
		
		controls.add(holdPlay);
		getContentPane().add(BorderLayout.SOUTH, controls);
		
		JPanel playground = new JPanel();
		playground.setBackground(Color.WHITE);
		playground.setLayout(null);
		JLabel fish = new JLabel(icons[5]);
		playground.add(fish);
		fish.setBounds(200,  200, icons[5].getIconWidth(), icons[5].getIconHeight());
		JLabel feed = new JLabel(icons[6]);
		playground.add(feed);
		feed.setBounds(50, 50, icons[6].getIconWidth(), icons[6].getIconHeight());
		JLabel devil = new JLabel(icons[7]);
		playground.add(devil);
		devil.setBounds(150, 150, icons[7].getIconWidth(), icons[7].getIconHeight());
		getContentPane().add(BorderLayout.CENTER, playground);
		
		setBounds(50, 50, 400, 400);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Point present = fish.getLocation();
				present.y = (present.y - 10 <= 0) ? 0 : present.y - 10;
				fish.setLocation(present);
			}
		});
		down.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Point present = fish.getLocation();
				present.y = (present.y + fish.getHeight() + 10 >= playground.getHeight()) ? playground.getHeight() - fish.getHeight() : present.y + 10;
				fish.setLocation(present);
			}
		});
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Point present = fish.getLocation();
				present.x = (present.x - 10 <= 0) ? 0 : present.x - 10;
				fish.setLocation(present);
			}
		});
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Point present = fish.getLocation();
				present.x = (present.x + fish.getWidth() + 10 >= playground.getWidth()) ? playground.getWidth() - fish.getWidth() : present.x + 10;
				fish.setLocation(present);
			}
		});
	}
		
	public static void main(String[] args) {
		new FishGame("Move Fish!");
	}
}