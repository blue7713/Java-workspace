package exercise11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Exercise11_5 extends JFrame{
	public Exercise11_5() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider js = new JSlider(100, 200, 120);
		JLabel jl = new JLabel("120");
		js.setMajorTickSpacing(20); // 슬라이더의 작은 눈금 간격을 20으로 설정
		js.setPaintTicks(true); // 눈금을 보이게 함
		js.setPaintLabels(true); // 슬라이더의 label을 보이게 한다.
		js.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider temp = (JSlider)e.getSource();
				jl.setText(Integer.toString(temp.getValue()));
			}
		});
		c.add(js);
		
		jl.setBackground(Color.green);
		jl.setOpaque(true);
		c.add(jl);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercise11_5();
	}
}