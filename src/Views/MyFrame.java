package Views;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import Controllers.AlgoChemins;


public class MyFrame extends JFrame implements MouseListener {
	
	private static final long serialVersionUID = -7446022262784535668L;

	public MyFrame() {
		super("Mon application");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1003, 992);
		this.setResizable(false);
	   
	  	ImageIcon carte = new ImageIcon("src/ressources/metrof_r.png");
	  	JLabel image = new JLabel(carte);
	  	this.add(image);
	  		
	  	image.addMouseListener(this);

		/*
		 * this.add(new JButton("clique wsh")); this.add(new JCheckBox("coche la"));
		 * this.add(new JTextField("ecris la"));
		 * 
		 * JButton lebouton = new JButton("ya pas wsh"); this.add(lebouton);
		 */	
	}


	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
        int x = e.getX(); 
        int y = e.getY(); 

        System.out.println(x);
        System.out.println(y);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
