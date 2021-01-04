package colourful.panels;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MyPanel extends JPanel{
	private Color prevColor;
	private Color currColor;
	
	private Color randomColor(){
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		
		return new Color(red, green, blue);
	}

	class myListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			setBackground(randomColor());
		}
	}
	
	public MyPanel() {
	addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(randomColor());
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				setBackground(randomColor());
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e))
					setBackground(prevColor);
				else {
				prevColor = getBackground();
				currColor = randomColor();
				setBackground(currColor);
				}
			}
		});
		addMouseListener(new myListener());
		prevColor = randomColor();
		setBackground(prevColor);
	}

}
