package Models;

import java.util.ArrayList;

public class Sommet {
	private int id;
	private String nom;
	private String ligne;
	private Boolean estTerminus;
	private Boolean estMarque = false;	
	private ArrayList<Arete> aretes = new ArrayList<Arete>();
	
	public Sommet (int id,String nom,String ligne,boolean estTerminus) {
		this.nom = nom;
		this.id = id;
		this.ligne = ligne;
		this.estTerminus = estTerminus;
	}
	
	public void printSommet() {
		System.out.print(this.id + " ");
		System.out.print(this.nom + " ");
		System.out.print(this.ligne + " ");
		System.out.print(this.estTerminus + " ");
		System.out.println(this.estMarque + " ");
	}
	
	public void printAretes()
	{
		for(Arete arete : this.aretes)
			 arete.printArete(arete);
	}
	
	public void setEstMarque(boolean bool)
	{
		this.estMarque = bool;
	}
	
	public void setAretes(Arete arete) {
		this.aretes.add(arete);
	}
	
	public ArrayList<Arete> getArete() {
		return this.aretes;
	}
	
	public int getId()
	{
		return this.id;
	}

	public boolean getEstMarque() {
		return this.estMarque;
	}
}
