package metro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

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
						/*System.out.print(Integer.parseInt(ligneInfo[1]));
						System.out.print(ligneInfo[2]);
						System.out.print(ligneInfo[3]);
						System.out.print(ligneInfo[4]);
						System.out.println();
						Sommet sommet = new Sommet(Integer.parseInt(ligneInfo[1]),ligneInfo[2],);*/
					}
	            }
	                
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }

		       
    }
}
