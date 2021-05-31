package graphUserInterface;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphDice implements ActionListener{
	private int numberOfPips;
	private DrawDice dicePanel;
	private JButton rollButton;
	private JFrame frame;
	
	public GraphDice() {
		numberOfPips = 6;
		// create window
		frame = new JFrame("Dice Roller");
		//basic settings
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100, 100);
		//create components		
		dicePanel = new DrawDice(0);
		rollButton = new JButton("roll dice");
		
		rollButton.addActionListener(this);
		rollButton.setActionCommand("roll");
		
		JPanel buttonPane = new JPanel();
		buttonPane.add(rollButton);
		
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		contentPane.add(dicePanel);
		contentPane.add(buttonPane);
		
		// make window visible
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String actionCommand = event.getActionCommand();
		
		if (actionCommand.equals("roll")) {
			int result = roll(this.numberOfPips);
			dicePanel.setDiceEyes(result);
			System.out.println("Pressed " + (result));
			dicePanel.repaint();
		}
	}

	private int roll(int numberOfPips) {
		Random random = new Random();
		int diceRoll = random.nextInt(numberOfPips);
		return diceRoll+1;
	}
	
	public static void main(String[] args) {
		new GraphDice();
	}
}
