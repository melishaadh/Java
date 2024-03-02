package java;

import javax.swing.*;
import java.awt.*;
import java.awt.Component;
import java.awt.event.*;

class Button extends JFrame implements ActionListener {
	JButton b1, b2;

	public Button() {
		setSize(400, 500);
		b1 = new JButton("Insert");
		b2 = new JButton("View");

		b1.setAlignmentX(Component.CENTER_ALIGNMENT);
		b2.setAlignmentX(Component.CENTER_ALIGNMENT);

		add(b1);
		add(b2);

		setLayout(new FlowLayout());

		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			try {
				Insert.main(null);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		if (e.getSource() == b2) {
			try {
				View.main(null);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Button();
	}
}