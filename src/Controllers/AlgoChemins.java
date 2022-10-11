package Controllers;

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
}
