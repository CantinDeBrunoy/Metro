package Controllers;

import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import Controllers.AlgoChemins;
import javax.swing.JPanel;

import Models.Arete;
import Models.Sommet;

import Views.Panel;

public class MouseController implements MouseListener {
    private HashMap<Integer, Sommet> listeSommets;
    private Sommet sommet1,sommet2;
    private int index=1;
    private HashMap<String,Sommet> listeSommetsSansDoublons;
    private Panel panel;

	public MouseController(HashMap<Integer, Sommet> listeSommets,Panel panel){
        this.listeSommets = listeSommets;
        this.listeSommetsSansDoublons = new HashMap<String,Sommet>();
        this.panel = panel;
        for(Sommet sommet: listeSommets.values()){
            listeSommetsSansDoublons.put(sommet.getNom(),sommet);
        }
    }

    @Override
	public void mouseClicked(MouseEvent e) {
        int coordX = e.getX();
        int coordY = e.getY();
        System.out.println(e.getY());
        System.out.println(e.getX());
        System.out.println();

        for(Sommet sommet : this.listeSommetsSansDoublons.values()){
            if((sommet.getCoordX() < coordX+7 && sommet.getCoordX() > coordX-7)&& (sommet.getCoordY() < coordY+7 && sommet.getCoordY() > coordY-7)){
                System.out.println(sommet.getNom());
                if(this.index==1){
                    this.index = 2;
                    this.sommet1 = sommet;
                }
                else{
                    if(!sommet.getNom().equals(sommet1.getNom())){
                        this.index =1;
                        this.sommet2 = sommet;
                    }
                }

                
            }
        }

        if(sommet1!=null && sommet2!=null){
            AlgoChemins algo = new AlgoChemins(this.listeSommets);

            int tempsDeParcours = Integer.MAX_VALUE;
            int s1=0,s2=0;

            for(Sommet sommetDoublon : listeSommets.values()){

                if(sommetDoublon.getNom().equals(sommet1.getNom())){
                    int tempsActuel = algo.plusCourtChemin(sommetDoublon.getId(),sommet2.getId());
                    if(tempsActuel < tempsDeParcours){
                        tempsDeParcours = tempsActuel;
                        s1 = sommetDoublon.getId();
                        s2 = sommet2.getId();
                    }
                }
                else if(sommetDoublon.getNom().equals(sommet2.getNom())){
                    int tempsActuel = algo.plusCourtChemin(sommet1.getId(),sommetDoublon.getId());
                    if(tempsActuel< tempsDeParcours){
                        tempsDeParcours = tempsActuel;
                        s2 = sommetDoublon.getId();
                        s1 = sommet1.getId();
                    }
                }
                
            }

            algo.plusCourtChemin(s1,s2);
            var liste = algo.affichePlusCourtChemin(s1,s2);
            panel.setSommetAColorier(liste);
            sommet1 = null;
            sommet2 = null;
            panel.repaint();
            panel.revalidate();
        }
	}

    @Override
	public void mouseEntered(MouseEvent e) {

	}

    @Override
	public void mouseExited(MouseEvent e) {

	}

    @Override
	public void mousePressed(MouseEvent e) {
	
	}

    @Override
	public void mouseReleased(MouseEvent e) {

	}
}