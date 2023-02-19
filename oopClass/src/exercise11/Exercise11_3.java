package exercise11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise11_3 extends JFrame{
	private JButton cal;
	private JTextField input;
	private JLabel[] money = new JLabel[8];
	private String[] moneytag = {"오만원", "만원", "천원", "500원", "100원", " 50원", "10원", "1원"};
	private int[] moneys = {50000, 10000, 1000, 500, 100, 50, 10, 1};
	private JTextField[] result = new JTextField[8];
	
	public Exercise11_3() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel North = new JPanel();
		
		North.setLayout(new FlowLayout());
		North.add(new JLabel("금액"));
		input = new JTextField(10);
		cal = new JButton("계산");
		
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total = Integer.parseInt(input.getText());
				for(int i = 0; i < 8; i++) {
					result[i].setText(Integer.toString(total / moneys[i]));
					total = total % moneys[i];
				}
			}
		});
		
		North.add(input);
		North.add(cal);
		North.setBackground(Color.pink);
		c.add(North, BorderLayout.NORTH);
		
		JPanel Center = new JPanel();
		Center.setLayout(new GridLayout(8, 2));
		Center.setBackground(Color.pink);
		for(int i = 0; i < 8; i++) {
			money[i] = new JLabel(moneytag[i]);
			result[i] = new JTextField();
			Center.add(money[i]);
			Center.add(result[i]);
			}
		c.add(Center, BorderLayout.CENTER);
		
		JPanel West = new JPanel();
		West.setBackground(Color.pink);
		c.add(West, BorderLayout.WEST);
		
		JPanel East = new JPanel();
		East.setBackground(Color.pink);
		c.add(East, BorderLayout.EAST);
		
		JPanel South = new JPanel();
		South.setBackground(Color.pink);
		c.add(South, BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
		}

	public static void main(String[] args) {
		new Exercise11_3();
	}
}