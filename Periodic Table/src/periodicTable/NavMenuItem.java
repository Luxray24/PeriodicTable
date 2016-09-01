package periodicTable;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JMenuItem;

public class NavMenuItem extends JMenuItem {
	/**
	 * 
	 */
	NavMenuItem(String text){
		setText(text);
	}
	
	private static final long serialVersionUID = 1L;
	Color background = Color.WHITE;

	public void setColor(Color bgColor) {
		background = bgColor;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(background);
		g2d.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
	}
}
