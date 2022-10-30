package Views;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class MyFrame extends JFrame implements MouseListener {
	
	private static final long serialVersionUID = -7446022262784535668L;

	public MyFrame() {
		super("Mon application");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setExtendedState(JFrame.MAXIMIZED_BOTH);

	    //affiche carte metro
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
		// TODO Auto-generated method stub
		//Add this code to draw a circle each time you click.
        int x = e.getX(); //Position X (mouse will be in the center of the point)
        int y = e.getY(); //Position Y (mouse will be in the center of the point)

        System.out.println(x);
        System.out.println(y);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
