package graphUserInterface;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TaxCalc {
	private JFrame frame;
	private JPanel basePane;
	private Container contentPane;
	
	public TaxCalc () {
		//create objects
		frame = new JFrame();
		contentPane = frame.getContentPane();
		
		//basic settings
		frame.setLayout(new GridLayout(2,2));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100, 100);
		
		
		
		
		
		//wrapping up and visibility
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new TaxCalc();
	}

}
