package graphUserInterface;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class HelloWorld {
	public HelloWorld() {
		
		// create window
		JFrame frame = new JFrame("Hello World!");
		// build menu bar
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		JMenu menuHelp = new JMenu("Help");
		JMenuItem menuItemOpen = new JMenuItem("Open");
		JMenuItem menuItemSave = new JMenuItem("Save");
		JMenuItem menuItemExit = new JMenuItem("Exit");
		JMenuItem menuItemHelp = new JMenuItem("Help");
		JMenuItem menuItemAbout = new JMenuItem("About");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(50, 50);
		
		menuFile.add(menuItemOpen);
		menuFile.add(menuItemSave);
		menuFile.addSeparator();
		menuFile.add(menuItemExit);
		
		menuHelp.add(menuItemAbout);
		menuHelp.add(menuItemHelp);
		
		menuBar.add(menuFile);
		menuBar.add(menuHelp);
		frame.setJMenuBar(menuBar);
		
		ArrayList<int[]> lightPositions = new ArrayList<int[]>();
		lightPositions.add(new int[] {0,0});
		lightPositions.add(new int[] {1,1});
		lightPositions.add(new int[] {2,0});
		lightPositions.add(new int[] {3,0});
		lightPositions.add(new int[] {4,1});
		lightPositions.add(new int[] {3,0});
		lightPositions.add(new int[] {3,1});
		lightPositions.add(new int[] {0,1});
		lightPositions.add(new int[] {4,0});
		lightPositions.add(new int[] {2,1});
		lightPositions.add(new int[] {6,0});
		
		frame.add(new MyTrafficLights(lightPositions));
		
		Container contentPane = frame.getContentPane();
		
		// make window visible
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new HelloWorld();
	}
}
