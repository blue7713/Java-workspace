package exercise12;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise12_1_1 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public Exercise12_1_1() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private JButton btn = new JButton("Hide/Show");
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		
		public MyPanel() {
			setLayout(new FlowLayout());
			add(btn);
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new Exercise12_1_1();
	}
}