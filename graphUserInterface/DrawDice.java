package graphUserInterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawDice extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int diceEyes;
	
	public DrawDice(int diceEyes) {
		this.diceEyes = diceEyes;
	}

	public void setDiceEyes(int diceEyes) {
		this.diceEyes = diceEyes;
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(200, 200);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		
		switch (this.diceEyes) {
			case 0: {
				break;
			}
			case 1: {
				g.drawRoundRect(50, 50, 100, 100, 15, 15);
				//center
				g.fillOval(90, 90, 20, 20);
				break;
			}
			case 2: {
				g.drawRoundRect(50, 50, 100, 100, 15, 15);
				//upper-left corner
				g.fillOval(60, 60, 20, 20);
				//lower-right corner
				g.fillOval(120, 120, 20, 20);
				break;
			}
			case 3: {
				g.drawRoundRect(50, 50, 100, 100, 15, 15);
				//center
				g.fillOval(90, 90, 20, 20);
				//upper-left corner
				g.fillOval(60, 60, 20, 20);
				//lower-right corner
				g.fillOval(120, 120, 20, 20);
				break;
			}
			case 4: {
				g.drawRoundRect(50, 50, 100, 100, 15, 15);
				//upper-left corner
				g.fillOval(60, 60, 20, 20);
				//lower-right corner
				g.fillOval(120, 120, 20, 20);
				//lower-left corner
				g.fillOval(60, 120, 20, 20);
				//upper-right corner
				g.fillOval(120, 60, 20, 20);
				break;
			}
			case 5: {
				g.drawRoundRect(50, 50, 100, 100, 15, 15);
				//center
				g.fillOval(90, 90, 20, 20);
				//upper-left corner
				g.fillOval(60, 60, 20, 20);
				//lower-right corner
				g.fillOval(120, 120, 20, 20);
				//lower-left corner
				g.fillOval(60, 120, 20, 20);
				//upper-right corner
				g.fillOval(120, 60, 20, 20);
				break;
			}
			case 6: {
				g.drawRoundRect(50, 50, 100, 100, 15, 15);
				//upper-left corner
				g.fillOval(60, 60, 20, 20);
				//lower-right corner
				g.fillOval(120, 120, 20, 20);
				//lower-left corner
				g.fillOval(60, 120, 20, 20);
				//upper-right corner
				g.fillOval(120, 60, 20, 20);
				//middle left-right
				g.fillOval(60, 90, 20, 20);
				g.fillOval(120, 90, 20, 20);
				break;
			}
		}
	}
}
