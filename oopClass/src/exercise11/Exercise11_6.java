package exercise11;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Exercise11_6 extends JFrame{
	JSlider js = new JSlider(0, 100, 0);
	JTextArea jta = new JTextArea();
	
	public Exercise11_6() {
		setTitle("TextArea Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 1));
		
		js.setMajorTickSpacing(20); // 슬라이더의 큰 눈금 간격을 20으로 설정
		js.setMinorTickSpacing(5); // 슬라이더의 작은 눈금 간격을 5로 설정
		js.setPaintLabels(true); // 슬라이더의 label을 보이게 함
		js.setPaintTicks(true); // 슬라이더의 눈금을 보이게 함
		
		js.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				JSlider temp = (JSlider)e.getSource();
				String text = jta.getText();
				if(text.length() <= js.getValue()) {
					js.setValue(text.length());
				}
				else {
					jta.setText(text.substring(0, temp.getValue())); 
				}
			}
		});
		
		jta.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				JTextArea temp = (JTextArea)e.getSource();
				String text = temp.getText();
				if(text.length() <= 100) {
					js.setValue(text.length());
				}
				else {
					text = text.substring(0, 99);
					jta.setText(text);
				}
			}
		});
		
		c.add(jta);
		c.add(js);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Exercise11_6();
	}
}