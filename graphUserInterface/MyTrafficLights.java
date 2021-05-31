package graphUserInterface;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class MyTrafficLights extends JPanel {
	
	private ArrayList<int[]> lightPositions;
	
	public MyTrafficLights(ArrayList<int[]> lightPositions) {
		this.lightPositions = lightPositions;
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(160*this.lightPositions.size()-50, 530);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		
		for (int i = 0; i < this.lightPositions.size(); i++) {
			//set up parameters
			int panX = (i)*160;
			Color[] lightSetup = new Color[3];
			try {
				lightSetup = getLightSetup(lightPositions.get(i)[0]);
			} catch (Exception e) {
				lightSetup = getLightSetup(0);
				System.out.println("Exceptional integer \"" + lightPositions.get(i)[0] + "\" at index " + i);
			}
			
			drawLightpost(g, panX, lightSetup);
			drawSign(g, lightPositions.get(i)[1], panX);
		}
	}

	private void drawLightpost(Graphics g, int panX, Color[] lightSetup) {
		g.setColor(Color.BLACK);
		// light casing
		g.fillRect(20+panX, 20, 70, 190);
		// lamp posts
		g.fillRect(50+panX, 210, 10, 300);
		//lights
		g.setColor(lightSetup[0]);
		g.fillOval(30+panX, 30, 50, 50);
		g.setColor(lightSetup[1]);
		g.fillOval(30+panX, 90, 50, 50);
		g.setColor(lightSetup[2]);
		g.fillOval(30+panX, 150, 50, 50);
		
	}

	private void drawSign(Graphics g, int type, int panX) {
		switch (type) {
		// draw "Vorfahrt"
		case 0: {
			g.setColor(Color.WHITE);
			g.fillPolygon(new int[] {55+panX, 95+panX, 55+panX, 15+panX}, new int[] {230, 270, 310, 270}, 4);
			g.setColor(Color.BLACK);
			g.drawPolygon(new int[] {55+panX, 95+panX, 55+panX, 15+panX}, new int[] {230, 270, 310, 270}, 4);
			g.setColor(Color.YELLOW);
			g.fillPolygon(new int[] {55+panX, 75+panX, 55+panX, 35+panX}, new int[] {250, 270, 290, 270}, 4);
			g.setColor(Color.BLACK);
			g.drawPolygon(new int[] {55+panX, 75+panX, 55+panX, 35+panX}, new int[] {250, 270, 290, 270}, 4);
			return;
		}
		// draw "Vorfahrt achten"
		case 1: {
			g.setColor(Color.RED);
			g.fillPolygon(new int[] {15+panX, 95+panX, 55+panX}, new int[] {230, 230, 310}, 3);
			g.setColor(Color.BLACK);
			g.drawPolygon(new int[] {15+panX, 95+panX, 55+panX}, new int[] {230, 230, 310}, 3);
			g.setColor(Color.WHITE);
			g.fillPolygon(new int[] {35+panX, 75+panX, 55+panX}, new int[] {245, 245, 285}, 3);
			g.setColor(Color.BLACK);
			g.drawPolygon(new int[] {35+panX, 75+panX, 55+panX}, new int[] {245, 245, 285}, 3);
			return;
		}
		default: {
			drawSign(g, 0, panX);
		}
		}
		
	}

	/**
	 * 
	 * @param integer 0=off; 1=red light, 2=red/yellow lights, 3=green light, 
	 * 			4=yellow light
	 * @return {@link Color}[] with light settings from top to bottom
	 * @throws IndexOutOfBoundsException
	 */
	private Color[] getLightSetup(Integer integer) throws IndexOutOfBoundsException{
		Color[] colors = new Color[3];
		colors[0] = Color.RED;
		colors[1] = Color.YELLOW;
		colors[2] = Color.GREEN;
		switch (integer){
		case 0: {
			colors[0] = Color.GRAY;
			colors[1] = Color.GRAY;
			colors[2] = Color.GRAY;
			break;
		}
		case 1: {
			colors[1] = Color.GRAY;
			colors[2] = Color.GRAY;
			break;
		}
		case 2: {
			colors[2] = Color.GRAY;
			break;
		}
		case 3: {
			colors[0] = Color.GRAY;
			colors[1] = Color.GRAY;
			break;
		}
		case 4: {
			colors[0] = Color.GRAY;
			colors[2] = Color.GRAY;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + integer);
		}
		return colors;
	}	
}
