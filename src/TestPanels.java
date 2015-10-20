
//package chapter12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestPanels extends JFrame implements ActionListener {
	//display the result
	JTextField result = new JTextField("The result output here");;
	//create the array to new Button
	JButton b[] = new JButton[16];
	//create the Calculator's operator and operand
	String s[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "/", "*", "=", "C" };
	String number = "";
	String mul = "*";
	String div = "/";
	String plus = "+";
	String minus = "-";
	String equi = "=";

	public TestPanels() {

		// Create panel p1 for the buttons and set GridLayout
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 4));

		// Add buttons to the panel
		for (int i = 0; i < 16; i++) {
			b[i] = new JButton(s[i]);
			b[i].addActionListener(this);
			p1.add(b[i]);
		}

		// Create panel p2 to hold a text field and p1
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(result, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);

		// add contents into the frame
		add(p2, BorderLayout.CENTER);

	}

	/** Main method */
	public static void main(String[] args) {
		TestPanels frame = new TestPanels();
		frame.setTitle("Calculator");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// let number display on the Textfield
		for (int i = 0; i <= 9; i++) {
			if (e.getSource() == b[i]) {
				number += i;
				result.setText(number);
			}
		}
		//let operand display on the Textfield
			for (int i =10 ; i <= 15; i++) {
				if (e.getSource() == b[10]) 
					result.setText(plus);
					else if (e.getSource() == b[11]) 
						result.setText(minus);
						else if (e.getSource() == b[12]) 
							result.setText(div);
							else if (e.getSource() == b[13]) 
								result.setText(mul);
								else if (e.getSource() == b[14]) 
									result.setText(equi);
								else if (e.getSource() == b[15]) 
									result.setText("  ");
				}
		
	}
}
