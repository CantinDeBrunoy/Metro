package Views;

import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JFrame;

public class Frame extends JFrame{
	public Frame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		Insets inset = this.getInsets();
		setPreferredSize(new Dimension(987+inset.left+inset.right,952+inset.top+inset.bottom));
		pack();
	}
}