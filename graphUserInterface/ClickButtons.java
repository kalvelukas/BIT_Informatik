package graphUserInterface;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ClickButtons implements ActionListener  {
	private JButton buttonRed, buttonBlue, buttonRandom;
	private JPanel colorPanel;
	
	public ClickButtons() {
		JFrame frame = new JFrame("Color Click");
		
		// build menu bar
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		JMenu menuHelp = new JMenu("Help");
		JMenuItem menuItemOpen = new JMenuItem("Open");
		JMenuItem menuItemNew = new JMenuItem("New");
		JMenuItem menuItemSave = new JMenuItem("Save");
		JMenuItem menuItemExit = new JMenuItem("Exit");
		JMenuItem menuItemHelp = new JMenuItem("Help");
		JMenuItem menuItemAbout = new JMenuItem("About");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100, 100);
		
		Container contentPane = frame.getContentPane();
		
		contentPane.setLayout(new GridLayout(4, 1));
		
		buttonRed = new JButton("Change color to red.");
		buttonBlue =new JButton("Change color to blue.");
		buttonRandom = new JButton("Change to random color.");
		colorPanel = new JPanel();
				
		buttonRed.addActionListener(this);
		buttonBlue.addActionListener(this);
		buttonRandom.addActionListener(this);
		menuItemNew.addActionListener(this);
		
		buttonRed.setActionCommand("red");
		buttonBlue.setActionCommand("blue");
		buttonRandom.setActionCommand("random");
		menuItemNew.setActionCommand("new");
		
		contentPane.add(buttonRed);
		contentPane.add(buttonBlue);
		contentPane.add(buttonRandom);
		contentPane.add(colorPanel);
		
		frame.pack();
		frame.setVisible(true);
		
		// Display dialogs
		JOptionPane.showMessageDialog(frame, "This is a plain message.", "Message", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(frame, "This is an information message.", "Message", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(frame, "This is a warning.", "Message", JOptionPane.WARNING_MESSAGE);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String actionCmd = event.getActionCommand();
		
		if(actionCmd.equals("red")) {
			colorPanel.setBackground(Color.RED);
		} else if (actionCmd.equals("blue")) {
			colorPanel.setBackground(Color.BLUE);
		} else if (actionCmd.equals("random")) {
			Random random = new Random();
			float red = random.nextFloat();
			float green = random.nextFloat();
			float blue =  random.nextFloat();
			Color color = new Color(red, green, blue);
			colorPanel.setBackground(color);
		} else if (actionCmd.equals("new")) {
			
		}
	}

	public static void main(String[] args) {
		new ClickButtons();
	}
}
