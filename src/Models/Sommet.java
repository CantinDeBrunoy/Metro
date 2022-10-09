package Models;

public class Sommet {
	private int id;
	private String nom;
	private String ligne;
	private Boolean estTerminus;
	private Boolean estMarque = false;	
	
	public Sommet (int id,String nom,String ligne,boolean estTerminus) {
		this.nom = nom;
		this.id = id;
		this.ligne = ligne;
		this.estTerminus = estTerminus;
	}
}
