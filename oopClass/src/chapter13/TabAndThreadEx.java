package chapter13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyLabel extends JLabel{
	private int barSize = 0; // 현재 그려져야할 바의 크기
	private int maxBarSize; // 바의 최대 크기
	
	public MyLabel(int maxBarSize) {
		this.maxBarSize = maxBarSize;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)(((double)(this.getWidth())) / maxBarSize * barSize);
		if(width == 0){ // 크기가 0이기 때문에 바를 그릴 필요 없음
			return;
		}
		g.fillRect(0, 0, width, this.getHeight());
	}
}

public class TabAndThreadEx {

	public TabAndThreadEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
