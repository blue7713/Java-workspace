package oop.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TrackEvent extends JFrame{
	private HashMap<String, JTextField>[] h = new HashMap[]{new HashMap(), new HashMap()};
	private String[] event = {"focusGained", "focusLost", "keyPressed", "keyReleased", "keyTyped",
				"mouseClicked", "mouseEntered", "mouseExited", "mousePressed", "mouseDragged", "mouseMoved"};
	private TestButton b1 = new TestButton(h[0], "Left");
	private TestButton b2 = new TestButton(h[1], "Right");
	
	class TestButton extends JButton{
		HashMap<String, JTextField> h;
		
		public TestButton(HashMap m, String label) {
			super(label);
			this.h = m;
			addFocusListener(new FocusListener(){
				public void focusGained(FocusEvent e) {
					report("focusGained", e.paramString());
				}
				
				public void focusLost(FocusEvent e) {
					report("focusLost", e.paramString());
				}
			});
			addKeyListener(new KeyListener() {
				public void keyPressed(KeyEvent e) {
					report("KeyPressed", e.paramString());
				}
				
				public void keyReleased(KeyEvent e) {
					report("KeyReleased", e.paramString());
				}
				
				public void keyTyped(KeyEvent e) {
					report("KeyTyped", e.paramString());
				}
			});
		}
		
		void report(String field, String msg) {
			h.get(field).setText(msg);
		}
	}
	
	public TrackEvent() {
		JPanel north = new JPanel(new GridLayout(1, 2));
		north.add(b1);
		north.add(b2);
		add(BorderLayout.NORTH, north);
		JPanel center = new JPanel(new GridLayout(event.length, 3));
		for(String evt : event) {
			JTextField t1 = new JTextField();
			t1.setEditable(false);
			center.add(t1);
			h[0].put(evt, t1);
			center.add(new JLabel(evt, JLabel.CENTER));
			JTextField t2 = new JTextField();
			t2.setEditable(false);
			h[1].put(evt, t2);
		}
		add(BorderLayout.CENTER, center);
	}

	public static void main(String[] args) {
		JFrame win = new TrackEvent();
		win.setBounds(100, 100, 700, 500);
		win.setVisible(true);
		win.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}