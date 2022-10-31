package Views;

import java.io.File;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import Models.Arete;
import Models.Sommet;
import java.util.ArrayList;
import java.util.HashMap;

public class Panel extends JPanel{
    private Image carte;
    private ArrayList<Arete> acpm;
    private HashMap<Integer, Sommet> listeSommets;
    private boolean afficherACPM = false; 
    private List<Sommet> sommetAColorier;
	
	public Panel(ArrayList<Arete> listeAretesLesPlusOpti,HashMap<Integer, Sommet> listeSommets) {
        this.acpm = listeAretesLesPlusOpti;
        this.listeSommets = listeSommets;
        this.setPreferredSize(new Dimension(987,952));
		this.setMinimumSize(new Dimension(987,952));
        this.sommetAColorier = new ArrayList<Sommet>();
        try {
			carte = ImageIO.read(new File("C://Users//Cantin//eclipse-workspace//metro//src//ressourceS/metrof_r.png"));
		}
		catch(IOException exc) {
			exc.printStackTrace();
		}
	}

    public void setSommetAColorier(List<Sommet> sommetAColorier){
        this.sommetAColorier = sommetAColorier;
    }
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;	
        g2.drawImage(carte, 0, 0, 987,952, this);
        if(afficherACPM){
            dessinerACPM(g2);
        }

        g2.setColor(new Color(0,0,240));
        for(Sommet sommet : listeSommets.values()){
            if(this.sommetAColorier.contains(sommet)){
                 g2.fillOval(sommet.getCoordX(),sommet.getCoordY(),7, 7 );
            }
            g2.drawOval(sommet.getCoordX(),sommet.getCoordY(),7, 7 );
        }
	}

	public void dessinerACPM(Graphics2D g2) {
        g2.setStroke(new BasicStroke(3));
        g2.setColor(new Color(0,0,240));
		for(Arete arete : acpm){
            Sommet sommet1 = this.listeSommets.get(arete.getS1());
            Sommet sommet2 = this.listeSommets.get(arete.getS2());
            
            g2.drawLine(sommet1.getCoordX(), sommet1.getCoordY(), sommet2.getCoordX(), sommet2.getCoordY());
        }
	}
	
	public void afficherACPM() {
		afficherACPM = !afficherACPM;
	}	
}
