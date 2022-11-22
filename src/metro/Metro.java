package metro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Controllers.AlgoChemins;

import Models.Arete;
import Models.Sommet;

import Views.Frame;
import Views.Panel;

public class Metro {
	public static void main(String[] args) {
		HashMap<Integer, Sommet> listeSommets = new HashMap<Integer, Sommet>();
		ArrayList<Arete> listeAretesLesPlusOpti = new ArrayList<Arete>();
		ArrayList<Arete> listeAretes = new ArrayList<Arete>();
		int changement = 135;
		 try
	        {
			 	// ATTENTION CHANGER LA DESTINATION DU FILE	
	            File file = new File("..//Metro//src//ressources/metro.txt");
	            Scanner scannerSommet = new Scanner(file);
	            Scanner scannerArete = new Scanner(file);
	            listeSommets = ParseStation(scannerSommet,listeSommets);
	            listeAretes = ParseArete(scannerArete,listeAretes,listeSommets);
	                
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }   
		  

		AlgoChemins algo = new AlgoChemins(listeSommets);
		 
		//System.out.println(algo.estConnexe());
		//algo.plusCourtChemin(256, 288);
		 
		listeAretesLesPlusOpti = algo.apcm(listeAretes);
		System.out.println(listeAretes);

		/*
		 * Frame fenetre = new Frame(); Panel panel = new
		 * Panel(listeAretesLesPlusOpti,listeSommets); fenetre.add(panel);
		 * fenetre.repaint(); fenetre.revalidate();
		 */
		 
    }
	
	public static HashMap<Integer, Sommet> ParseStation(Scanner scanner,HashMap<Integer, Sommet> listeSommets){
         while (scanner.hasNextLine()) {
         	String ligne = scanner.nextLine();
         	String[] ligneInfo = ligne.split(" " );
				if(ligneInfo[0].equals("V")) {
					Sommet sommet = new Sommet(
							Integer.parseInt(ligneInfo[1]),
							ligneInfo[2],ligneInfo[3],
							Boolean.parseBoolean(ligneInfo[4])
							);
					listeSommets.put(Integer.parseInt(ligneInfo[1]), sommet);
				}
         }
         return listeSommets;
	}
	
	
	
	public static ArrayList<Arete> ParseArete(Scanner scanner,ArrayList<Arete> listeAretes, HashMap<Integer, Sommet> listeSommets){
        while (scanner.hasNextLine()) {
        	String ligne = scanner.nextLine();
        	String[] ligneInfo = ligne.split(" " );
        	if(ligneInfo[0].equals("E")) {
				Arete arete = new Arete(
						Integer.parseInt(ligneInfo[3]),
						Integer.parseInt(ligneInfo[1]),
						Integer.parseInt(ligneInfo[2])
						);
				listeAretes.add(arete);
				 for (Integer i : listeSommets.keySet()) {
					if(listeSommets.get(i).getId() == arete.getS1() || listeSommets.get(i).getId() == arete.getS2())
					{
						listeSommets.get(i).setAretes(arete);
					}	
				}
			}
        }
        return listeAretes;
	}


	public static ArrayList<Arete> ParseCoord(Scanner scanner,ArrayList<Arete> listeAretes, HashMap<Integer, Sommet> listeSommets){
        while (scanner.hasNextLine()) {
        	String ligne = scanner.nextLine();
        	String[] ligneInfo = ligne.split(" " );
        	if(ligneInfo[0].equals("E")) {
				Arete arete = new Arete(
						Integer.parseInt(ligneInfo[3]),
						Integer.parseInt(ligneInfo[1]),
						Integer.parseInt(ligneInfo[2])
						);
				listeAretes.add(arete);
				 for (Integer i : listeSommets.keySet()) {
					if(listeSommets.get(i).getId() == arete.getS1() || listeSommets.get(i).getId() == arete.getS2())
					{
						listeSommets.get(i).setAretes(arete);
					}	
				}
			}
        }
        return listeAretes;
	}
}
