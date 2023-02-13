package Chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnnoymousClassListener extends JFrame {
	public AnnoymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() { // 익명 클래스로 Action 리스너 작성 -> 클래스 작성과 인ㅅ턴스 생성 동시에
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) {
					b.setText("액션");
				}
				else {
					b.setText("Action");
				}
				
				// AnnpymousClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
				setTitle(b.getText());
			}
		});
		
		setSize(350, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AnnoymousClassListener();
	}
}