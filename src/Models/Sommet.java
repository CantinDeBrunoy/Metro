package Models;

public class Sommet {
	private int id;
	private String nom;
	private int ligne;
	private int estTerminus;
	private Boolean estMarque = false;	
	
	
	public Sommet (int id,String nom,int ligne,int estTerminus) {
		this.nom = nom;
		this.id = id;
		this.ligne = ligne;
		this.estTerminus = estTerminus;
	}
}
