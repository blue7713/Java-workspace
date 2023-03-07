package exercise12;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise12_1_2 extends JFrame{
	private MyPanel panel = new MyPanel();

	public Exercise12_1_2() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private JButton btn = new JButton("Hide/Show");
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image image = icon.getImage();
		
		public MyPanel() {
			setLayout(new FlowLayout());
			add(btn);
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(image == null) {
						image = icon.getImage();
					}
					else {
						image = null;
					}
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
		}
	}

	public static void main(String[] args) {
		new Exercise12_1_2();
	}
}