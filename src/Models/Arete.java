package Models;

public class Arete {
	private int poids;
	private int s1;
	private int s2;
	
	public Arete (int poids, int s1, int s2) {
		this.poids = poids;
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public Arete(int poids) {
		this.poids = poids;
	}

	public void printArete(Arete arete) {
		System.out.print(arete.poids + " ");
		System.out.print(arete.s1 + " ");
		System.out.println(arete.s2 + " ");
		
	}
	
	public int getS1()
	{
		return this.s1;
	}
	
	public int getS2()
	{
		return this.s2;
	}

	public int getPoids() {
		return this.poids;
	}
	
}
