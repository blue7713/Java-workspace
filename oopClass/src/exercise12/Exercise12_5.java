package exercise12;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise12_5 extends JFrame{
	private MyPanel panel = new MyPanel();
	private Point p = new Point(30, 30);

	public Exercise12_5() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(400, 400);
		setVisible(true);
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				char c = e.getKeyChar();
				if(c == '+') {
					p.x = (int)(p.x + (p.x * 0.1));
					p.y = (int)(p.y + (p.y * 0.1));
				}
				else if(c == '-') {
					p.x = (int)(p.x - (p.x * 0.1));
					p.y = (int)(p.y - (p.y * 0.1));
				}
				repaint();
			}
		});
		setSize(400, 400);
		setVisible(true);
		
		setFocusable(true);
		requestFocus();
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/apple.jpg");
		private Image image = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 10, 10, p.x, p.y, this);
		}	
	}

	public static void main(String[] args) {
		new Exercise12_5();
	}
}