package colourful.panels;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Tester {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Colorful Grids");
		myFrame.setSize(300,300);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = myFrame.getContentPane();
		pane.setLayout(new GridLayout(6,6));
	
		for (int i = 0; i < (6*6); i++) {
			myFrame.add(new MyPanel());
		}
	
	}

}
