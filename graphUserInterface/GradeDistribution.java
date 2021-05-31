package graphUserInterface;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class GradeDistribution {
	private JFrame frame;
	private JPanel basePane;
	private JLabel textPane;
	private JProgressBar distriBar;
	private int[] distribution;
	
	public GradeDistribution() {
		frame = new JFrame("Grade Distribution");
		Container contentPane = frame.getContentPane();
				
		//basic settings
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100, 100);
		
		//grade distribution
		distribution = new int [] {0, 1, 2, 3, 4, 5, 6, 7, 4, 6, 3, 2, 6, 3, 4, 
				2};
		
		//sum of pupils
		int sumDist = 0;
		for (int i = 0; i < distribution.length; i++) {
			sumDist += distribution[i];
		}
		
		//create progress bar objects /w text
		for (int i = 0; i < distribution.length; i++) {
			textPane = new JLabel(i + " Punkte", JLabel.CENTER);
			basePane = new JPanel();
			distriBar = new JProgressBar(0, sumDist);
			distriBar.setValue(distribution[i]);
			distriBar.setToolTipText(distribution[i] + " Schueler");
			distriBar.setStringPainted(true);
			basePane.add(distriBar);
			contentPane.add(textPane);
			contentPane.add(basePane);
		}
		
		//
		contentPane.setLayout(new GridLayout(16, 2));
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GradeDistribution();
	}
}
