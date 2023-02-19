package exercise11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Exercise11_8 extends JFrame{
	private JRadioButton jb[] = new JRadioButton[2];
	private JLabel jl;
	private ImageIcon image[];
	private int index = 0;
	private Vector<ImageIcon> v = new Vector<ImageIcon>();

	public Exercise11_8() {
		setTitle("Image Gallery Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel north = new JPanel();
		north.setLayout(new FlowLayout());
		jb[0] = new JRadioButton("left");
		jb[0].setSelected(true);
		jb[1] = new JRadioButton("right");
		north.add(jb[0]);
		north.add(jb[1]);
		
		ButtonGroup g = new ButtonGroup();
		g.add(jb[0]);
		g.add(jb[1]);
		
		c.add(north, BorderLayout.NORTH);
		
		File f = new File("images");
		File files[] = f.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			ImageIcon images = new ImageIcon(files[i].getPath());
			v.add(images);
		}
		
		image = new ImageIcon[v.size()];
		
		for(int i = 0; i < v.size(); i++) {
			image[i] = v.elementAt(i);
		}
		
		System.out.println(image);
		
		jl = new JLabel(v.get(0));
		jl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(jb[0].isSelected()) {
					index = (index + 1) % v.size();
				}
				else {
					index--;
					if(index < 0) {
						index = v.size() - 1;
					}
				}
				jl.setIcon(image[index]);
			}
		});
		c.add(jl, BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise11_8();
	}
}