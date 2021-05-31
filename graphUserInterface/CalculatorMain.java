package graphUserInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class CalculatorMain implements ActionListener {
	JFrame frame;
	Container contentPane;
	JTextField display;
	JLabel notiLabel;
	GridBagConstraints c;
	ArrayList<JButton> buttons;
	CalculatorReturn result;

	public CalculatorMain() {
		// initialise JFrame
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100, 100);

		contentPane = frame.getContentPane();
		contentPane.setLayout(new GridBagLayout());	
		c = new GridBagConstraints();

		constructGraphicElements();
		setupGridBag();

		// packing up
		frame.pack();
		frame.setVisible(true);
	}

	private void constructGraphicElements() {
		display = new JTextField("Hello");
		notiLabel = new JLabel("Meldungen");
		
		//buttons
		ArrayList<String> buttonTextStrings = new ArrayList<String>();
		buttonTextStrings.add("7");
		buttonTextStrings.add("8");
		buttonTextStrings.add("9");
		buttonTextStrings.add("+");
		buttonTextStrings.add("CE");
		buttonTextStrings.add("4");
		buttonTextStrings.add("5");
		buttonTextStrings.add("6");
		buttonTextStrings.add("-");
		buttonTextStrings.add("C");
		buttonTextStrings.add("1");
		buttonTextStrings.add("2");
		buttonTextStrings.add("3");
		buttonTextStrings.add("*");
		buttonTextStrings.add("=");
		buttonTextStrings.add("0");
		buttonTextStrings.add(",");
		buttonTextStrings.add("/");
		
		//iterable for creating button commands
		buttons = new ArrayList<JButton>();
		
		for (String string : buttonTextStrings) {
			buttons.add(new JButton(string));
		}
		
		for (JButton jButton : buttons) {
			setupButtonCommands(jButton);
		}
	}

	private void setupButtonCommands(JButton editButton) {
		editButton.addActionListener(this);
		editButton.setActionCommand(editButton.getText());
	}

	private void setupGridBag() {
		//button sizes
		c.ipady = 20;
		c.ipadx = 5;
		c.fill = GridBagConstraints.BOTH;

		//layout input/display field
		c.weightx = 1.0;
		c.gridwidth = 5; //set width of text field
		c.gridx = 0;
		c.gridy = 0;
		contentPane.add(display, c);
		c.gridwidth = 1; //reset width to standard

		//layout buttons
		int buttonIndex = 0;
		
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 1;
		contentPane.add(buttons.get(buttonIndex++), c);
		
		c.gridx = 1;
		contentPane.add(buttons.get(buttonIndex++), c);
		
		c.gridx = 2;
		contentPane.add(buttons.get(buttonIndex++), c);
				
		c.gridx = 3;
		contentPane.add(buttons.get(buttonIndex++), c);
		
		c.gridx = 4;
		contentPane.add(buttons.get(buttonIndex++), c);
		
		c.gridx = 0;
		c.gridy = 2;
		contentPane.add(buttons.get(buttonIndex++), c);
		
		c.gridx = 1;
		contentPane.add(buttons.get(buttonIndex++), c);

		c.gridx = 2;
		contentPane.add(buttons.get(buttonIndex++), c);

		c.gridx = 3;
		contentPane.add(buttons.get(buttonIndex++), c);

		c.gridx = 4;
		contentPane.add(buttons.get(buttonIndex++), c);

		c.gridx = 0;
		c.gridy = 3;
		contentPane.add(buttons.get(buttonIndex++), c);

		c.gridx = 1;
		contentPane.add(buttons.get(buttonIndex++), c);

		c.gridx = 2;
		contentPane.add(buttons.get(buttonIndex++), c);

		c.gridx = 3;
		contentPane.add(buttons.get(buttonIndex++), c);

		// equals button higher
		c.gridheight = 2;
		c.weighty = 1.0;
		c.gridx = 4;
		contentPane.add(buttons.get(buttonIndex++), c);
		c.gridheight = 1;
		c.weighty = 0.0;

		// zero button wider
		c.gridwidth = 2;
		c.gridx = 0;
		c.gridy = 4;
		contentPane.add(buttons.get(buttonIndex++), c);
		c.gridwidth = 1;

		c.gridx = 2;
		contentPane.add(buttons.get(buttonIndex++), c);

		c.gridx = 3;
		contentPane.add(buttons.get(buttonIndex++), c);

		//layout notifier label
		c.ipady = 0;
		c.weightx = 0.0;
		c.gridwidth = 5;
		c.gridx = 0;
		c.gridy = 5;
		contentPane.add(notiLabel, c);

	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String actionCommand = event.getActionCommand();
		result = CalculatorBackend.command(actionCommand);
		display.setText(result.getDisplayString());
		notiLabel.setText(result.getNotifyString());
	}

	public static void main(String[] args) {
		new CalculatorMain();
	}
}
