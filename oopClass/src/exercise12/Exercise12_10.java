package exercise12;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise12_10 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public Exercise12_10() {
		setTitle("그래픽 이미지 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(350, 350);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("images/back.jpg");
		Image img = icon.getImage();
		int iw = (icon.getIconWidth() - 10) / 2; 
		int ih = (icon.getIconHeight() - 10) / 2;
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int pw = (getWidth() - 10) / 2;
			int ph = (getHeight() - 10) / 2;
			g.drawImage(img, 0, 0, pw, ph, 0, 0, iw, ih, this); // 왼쪽 상단(0,0), 오른쪽 하단(pw, ph), 이미지 내 왼쪽 상단 모서리(0,0), 이미지 내 오른쪽 하단 모서리(iw, ih), observer
			g.drawImage(img, pw + 10, 0, pw * 2 + 10, ph, iw + 10, 0, iw * 2 + 10, ih, this);
			g.drawImage(img, 0, ph + 10, pw, ph * 2 + 10, 0, ih + 10, iw, ih * 2 + 10, this);
			g.drawImage(img, pw + 10, ph + 10, pw *2 + 10, ph * 2 + 10, iw + 10, ih + 10, iw * 2 + 10, ih * 2 + 10, this);
		}
	}

	public static void main(String[] args) {
		new Exercise12_10();
	}
}