package Models;

import java.util.ArrayList;

public class Sommet {
	private int id;
	private String nom;
	private String ligne;
	private Boolean estTerminus;
	private Boolean estMarque = false;	
	private ArrayList<Arete> aretes = new ArrayList<Arete>();
	private int distance;
	private Sommet predecesseur;
	private int ensemble;
	
	public Sommet (int id,String nom,String ligne,boolean estTerminus) {
		this.nom = nom;
		this.id = id;
		this.ligne = ligne;
		this.estTerminus = estTerminus;
	}
	
	public Sommet() {
		this.distance = Integer.MAX_VALUE;
	}
		
	@Override
	public String toString() {
		return this.id + " " + this.nom + this.ligne + " " + this.estTerminus +" "+ this.estMarque+" " + this.ensemble;
	}
	
	public int getEnsemble() {
		return ensemble;
	}
	
	public void setEnsemble(int ensemble) {
		this.ensemble = ensemble;
	}

	public void printAretes()
	{
		for(Arete arete : this.aretes)
			 arete.toString();
	}
	
	public void setEstMarque(boolean bool)
	{
		this.estMarque = bool;
	}
	
	public void setAretes(Arete arete) {
		this.aretes.add(arete);
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public int getDistance() {
		return this.distance;
	}
	
	public ArrayList<Arete> getArete() {
		return this.aretes;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setPredecesseur(Sommet predecesseur) {
		this.predecesseur = predecesseur;
	}
	
	public Sommet getPredecesseur() {
		return this.predecesseur;
	}

	public boolean getEstMarque() {
		return this.estMarque;
	}

	public String getNom() {
		return this.nom;
	}
}
