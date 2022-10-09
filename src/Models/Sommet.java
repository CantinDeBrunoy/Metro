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
	
	public void printSommet(Sommet sommet) {
		System.out.print(sommet.id + " ");
		System.out.print(sommet.nom + " ");
		System.out.print(sommet.ligne + " ");
		System.out.print(sommet.estTerminus + " ");
		System.out.println(sommet.estMarque + " ");
	}
}
