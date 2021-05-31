package graphUserInterface;

import java.awt.*;
import javax.swing.*;

public class PicFrame {
	public PicFrame() {
		JFrame frame = new JFrame("Beispiel Text und Bild");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLocation(500, 500);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.add(new JButton("rechts"));
		panel1.add(new JButton("oben"));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
		panel2.add(new JButton("rechts"));
		panel2.add(new JButton("oben"));
		
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new GridLayout(2,2));
		contentPane.add(new JLabel("rechts unten", JLabel.CENTER));
		contentPane.add(panel1);
		contentPane.add(new JLabel("links unten", JLabel.CENTER));
		contentPane.add(panel2);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new PicFrame();
	}
}
