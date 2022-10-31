package Views;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import Models.Coordonnees;


public class MyFrame extends JFrame implements MouseListener {
	
	private static final long serialVersionUID = -7446022262784535668L;

	public MyFrame() {
		super("Mon application");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1003, 992);
		this.setResizable(false);
	   
	  	ImageIcon carte = new ImageIcon("src/ressources/metrof_r.png");
	  	JLabel image = new JLabel(carte);
	  	//JButton buttonAcpm = new JButton("Voir l'ACPM");
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
        Coordonnees c = new Coordonnees(e.getX(), e.getY());
        System.out.println(c);
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.drawOval(c.getC1()+6, c.getC2()+29, WIDTH+4, HEIGHT+4);
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
