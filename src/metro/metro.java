package metro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Models.Arete;
import Models.Sommet;


public class metro {
	public static void main(String[] args) {
		ArrayList<Sommet> listeSommets = new ArrayList<Sommet>();
		ArrayList<Arete> listeAretes = new ArrayList<Arete>();
		 try
	        {
			 	// ATTENTION CHANGER LA DESTINATION DU FILE	
	            File file = new File("C://Users//Cantin//eclipse-workspace//metro//src//ressourceS/metro.txt");
	            Scanner scannerSommet = new Scanner(file);
	            Scanner scannerArete = new Scanner(file);
	            listeSommets = ParseStation(scannerSommet,listeSommets);
	            listeAretes = ParseArete(scannerArete,listeAretes);
	                
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }   
		 
		 for(Sommet sommet : listeSommets)
			   sommet.printSommet(sommet);
		 
		 for(Arete arete : listeAretes)
			 arete.printArete(arete);
    }
	
	public static ArrayList<Sommet> ParseStation(Scanner scanner,ArrayList<Sommet> listeSommets){
         while (scanner.hasNextLine()) {
         	String ligne = scanner.nextLine();
         	String[] ligneInfo = ligne.split(" " );
				if(ligneInfo[0].equals("V")) {
					Sommet sommet = new Sommet(
							Integer.parseInt(ligneInfo[1]),
							ligneInfo[2],ligneInfo[3],
							Boolean.parseBoolean(ligneInfo[4])
							);
					listeSommets.add(sommet);
				}
         }
         return listeSommets;
	}
	
	public static ArrayList<Arete> ParseArete(Scanner scanner,ArrayList<Arete> listeAretes){
        while (scanner.hasNextLine()) {
        	String ligne = scanner.nextLine();
        	String[] ligneInfo = ligne.split(" " );
        	if(ligneInfo[0].equals("E")) {
				Arete arrete = new Arete(
						Integer.parseInt(ligneInfo[3]),
						Integer.parseInt(ligneInfo[1]),
						Integer.parseInt(ligneInfo[2])
						);
				listeAretes.add(arrete);
			}
        }
        return listeAretes;
	}
}
