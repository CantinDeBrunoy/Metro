package metro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class metro {
	public static void main(String[] args) {
		// ATTENTION CHANGER LA DESTINATION DU FILE
		File file = new File("C://Users//Cantin//eclipse-workspace//metro//src//ressourceS/metro.txt");
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		try(FileInputStream fis = new FileInputStream(file)){
			Scanner sc = new Scanner(fis);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch(IOException e) {
			e.printStackTrace();
		}

		       
    }
}
