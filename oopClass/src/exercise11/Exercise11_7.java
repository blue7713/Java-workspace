package exercise11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Exercise11_7 extends JFrame{
	private JSlider js = new JSlider(1, 100, 56);
	private JLabel jl = new JLabel("I Love Java");
	
	public Exercise11_7() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		js.setMajorTickSpacing(20); // 큰 눈금 20마다 나눔
		js.setMinorTickSpacing(5); // 작은 눈금 5마다 나눔
		js.setPaintLabels(true);
		js.setPaintTicks(true);
		js.setPaintTrack(true);
		
		js.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider temp = (JSlider)e.getSource();
				jl.setFont(new Font("Arial", Font.PLAIN, temp.getValue()));
			}
		});
		c.add(js, BorderLayout.NORTH);
		
		jl.setFont(new Font("Arial", Font.PLAIN, 56));
		jl.setHorizontalAlignment(JLabel.CENTER); // 중앙정렬
		c.add(jl, BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercise11_7();
	}
}