package chapter11;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame{
	public SliderEx() {
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100); // 수평 슬라이더, 0~200사이 현재값 100
		slider.setPaintLabels(true); //
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMinorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		c.add(slider);
		
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SliderEx();
	}
}