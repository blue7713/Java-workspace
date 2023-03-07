package exercise12;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise12_4 extends JFrame{
	private MyPanel panel = new MyPanel();

	public Exercise12_4() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/apple.jpg");
		private Image image = icon.getImage();
		private int x = 0;
		private int y = 0;
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, x, y, this.getWidth()/4, this.getHeight()/4, this);
			this.addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					x = e.getX();
					y = e.getY();
					repaint();
				}
			});
		}
	}

	public static void main(String[] args) {
		new Exercise12_4();
	}
}