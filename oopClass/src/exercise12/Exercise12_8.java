package exercise12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise12_8 extends JFrame{
	private MyPanel panel = new MyPanel();
	private Vector<Circle> circle = new Vector<Circle>();

	public Exercise12_8() {
		setTitle("마우스로 원 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 300);
		setVisible(true);
	}
	
	class Circle{ 
		int x; 
		int y; 
		int d; // 원의 지름
		
		public Circle(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
	}
	
	class MyMouseListener extends MouseAdapter{
		private int startX;
		private int startY;
		private int endX;
		private int endY;
		
		public void mousePressed(MouseEvent e) {
			Point startP = e.getPoint();
			startX = (int)startP.getX();
			startY = (int)startP.getY();
		}
		
		public void mouseRelaesed(MouseEvent e) {
			Point endP = e.getPoint();
			endX = (int)endP.getX();
			endY = (int)endP.getY();
			
			int disX = endX - startX; // 중심으로부터 드래그한 점까지 x좌표 차이
			int disY = endY - startY; // 중심으로부터 드래그한 점까지 y좌표 차이
			int radius = (int)Math.sqrt(disX * disX + disY * disY); // 반지름 구하기
			Circle c = new Circle(startX - radius, startY - radius, 2 * radius);
			circle.add(c); // 벡터에 추가
			repaint();
		}
	}
	
	class MyPanel extends JPanel{
		public MyPanel() {
			setFocusable(true);
			requestFocus();
			addMouseListener(new MyMouseListener());
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			for(int i = 0; i < circle.size(); i++) {
				Circle c = circle.elementAt(i);
				g.drawOval(c.x, c.y, c.d, c.d);
				// (x, y) 위치에서 시작하고 한 변 길이가 c.d인 정사각형에 내접하는 원을 그림
			}
		}
	}

	public static void main(String[] args) {
		new Exercise12_8();
	}
}