package graphUserInterface;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class CalDemo implements ActionListener {
	JFrame frame;
	Container contentPane;
	ArrayList<JButton> buttons;
	JTextField textField;
	double num1, num2, result;
	char operator;

	public CalDemo() {
		frame = new JFrame("Calculator");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100, 100);
		
		contentPane = frame.getContentPane();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		textField = new JTextField();
		contentPane.add(textField);
		
		buttons = new ArrayList<JButton>();
		for (int i = 0; i < 10; i++) {
			buttons.add(new JButton(Integer.toString(i)));			
		}
		
		for (JButton jButton : buttons) {
			contentPane.add(jButton);
		}
		
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new CalDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	} 
}
