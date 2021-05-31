package graphUserInterface;

import java.awt.*;
import javax.swing.*;

public class MyPaintPanel extends JPanel {
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(300, 200); 
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		g.drawRect(25, 50, 100, 30);
		g.drawString("JPanel", 55, 70);
		
		g.drawRect(25, 120, 100, 30);
		g.drawString("MyPaintPanel", 40, 140);
		
		g.drawLine(75, 80, 75, 120);
		g.fillPolygon(new int[] {70, 75, 80}, new int [] {90, 80, 90}, 3);
		
		g.setColor(Color.RED);
		g.fillRect(202, 70, 12, 42);
		g.fillOval(200, 120, 16, 16);
	}	
}
