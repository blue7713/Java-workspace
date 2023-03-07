package exercise12;

import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise12_3 extends JFrame{
	private ImageIcon appleIcon = new ImageIcon("images/apple.jpg");
	private JLabel appleLabel = new JLabel(appleIcon);

	public Exercise12_3() {
		setTitle("이미지 레이블 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		appleLabel.setLocation(50, 50);
		appleLabel.setSize(appleIcon.getIconWidth(), appleIcon.getIconHeight());
		c.add(appleLabel);
		
		appleLabel.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				Point p = e.getPoint();
				appleLabel.setLocation(p);
			}
		});
		
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercise12_3();
	}
}