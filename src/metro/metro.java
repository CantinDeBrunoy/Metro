package metro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import Models.Arete;
import Models.Sommet;


public class metro {
	public static void main(String[] args) {
		 try
	        {
			 	// ATTENTION CHANGER LA DESTINATION DU FILE	
	            File file = new File("C://Users//Cantin//eclipse-workspace//metro//src//ressourceS/metro.txt");
	            Scanner scanner = new Scanner(file);
	            while (scanner.hasNextLine()) {
	            	String ligne = scanner.nextLine();
	            	String[] ligneInfo = ligne.split(" " );
					if(ligneInfo[0].equals("V")) {
						Sommet sommet = new Sommet(
								Integer.parseInt(ligneInfo[1]),
								ligneInfo[2],ligneInfo[3],
								Boolean.parseBoolean(ligneInfo[4])
								);
					}
					else if(ligneInfo[0].equals("E")) {
						Arete arrete = new Arete(
								Integer.parseInt(ligneInfo[3]),
								Integer.parseInt(ligneInfo[1]),
								Integer.parseInt(ligneInfo[2])
								);
					}
	            }
	                
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }

		       
    }
}
