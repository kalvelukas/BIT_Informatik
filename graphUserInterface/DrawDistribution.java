package graphUserInterface;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawDistribution extends JPanel{
		
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(200,200);
	}
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		
	}
}
