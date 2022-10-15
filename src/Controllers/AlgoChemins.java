package Controllers;

import java.util.ArrayList;
import java.util.HashMap;

import Models.Arete;
import Models.Sommet;

public class AlgoChemins {
	HashMap<Integer, Sommet> listeSommets = new HashMap<Integer, Sommet>();
	
	public AlgoChemins(HashMap<Integer, Sommet> listeSommets)
	{
		this.listeSommets = listeSommets;
	}
	
	public boolean estConnexe()
	{
		visiterSommets(this.listeSommets.get(0));
		for(Sommet sommet : this.listeSommets.values())
		{
			if(sommet.getEstMarque() == false)
			{
				return false;
			}
		}
		return true;
		
	}
	
	public void visiterSommets(Sommet sommet)
	{
		sommet.setEstMarque(true);
		for (Arete arete : sommet.getArete()) 
		{
			var tmp= this.listeSommets.get(arete.getS1());
			if(this.listeSommets.get(arete.getS1())!=null)
			{
				if(!this.listeSommets.get(arete.getS1()).getEstMarque())
				{
					visiterSommets(this.listeSommets.get(arete.getS1()));
				}
				
			}
			if(this.listeSommets.get(arete.getS2())!=null)
			{
				if(!this.listeSommets.get(arete.getS2()).getEstMarque())
				{
					visiterSommets(this.listeSommets.get(arete.getS2()));
				}
				
			}
			
		}
		
	}
	

	
	
	
	
	public void plusCourtChemin(int idSommetDepart,int idSommetArrive) {
		initCheminLePlusCourt(this.listeSommets,idSommetDepart);	
		ArrayList<Sommet> sommetsParcouru = new ArrayList<Sommet>();
		var sommetsAParcourir = new ArrayList<Sommet>(this.listeSommets.values());
		Sommet sommetDepart = sommetsAParcourir.get(idSommetDepart);
		Sommet sommetArrive = sommetsAParcourir.get(idSommetArrive);
		while(!sommetsAParcourir.isEmpty()) {
			
			var plusPetitSommet = retirerLePlusPetit(sommetsAParcourir);
			
			sommetsParcouru.add(plusPetitSommet);
			for(Arete arete : plusPetitSommet.getArete()) {
				
				Sommet voisin;
				if(arete.getS1()!=plusPetitSommet.getId()) {
					voisin = this.listeSommets.get(arete.getS1());
				}
				else {
					voisin = this.listeSommets.get(arete.getS2());
				}
				
				if(voisin.getDistance()> plusPetitSommet.getDistance() + arete.getPoids()) {
					voisin.setDistance(plusPetitSommet.getDistance() + arete.getPoids());
					voisin.setPredecesseur(plusPetitSommet);
				}
			}
		}
		

		while(sommetArrive.getPredecesseur()!=null) {
			System.out.println(sommetArrive);
			sommetArrive = sommetArrive.getPredecesseur();
		}
		System.out.println(sommetArrive);

	}
	
	public Sommet retirerLePlusPetit( ArrayList<Sommet> sommetsAParcourir) {
		var sommetLePlusProche = new Sommet();
		for(var sommet : sommetsAParcourir) {
			if(sommet.getDistance()<sommetLePlusProche.getDistance()) {
				sommetLePlusProche = sommet;
				
			}
		}
		sommetsAParcourir.remove(sommetLePlusProche);
		return sommetLePlusProche;
		
	}
	
	public HashMap<Integer, Sommet> initCheminLePlusCourt(HashMap<Integer, Sommet> listeSommets,int idSommetDepart) {
		Sommet sommetDepart = this.listeSommets.get(idSommetDepart);
		for (Sommet sommet : listeSommets.values()) {
			sommet.setDistance(Integer.MAX_VALUE);
			sommet.setEstMarque(false);
		}
		sommetDepart.setDistance(0);
		return listeSommets;
		
	}
}
