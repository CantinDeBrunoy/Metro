package Models;

public class Coordonnees {
	private int c1;
	private int c2;
	
	public Coordonnees(int s1, int s2) {
		this.c1 = s1;
		this.c2 = s2;
	}
	
	public String toString() {
		return this.c1 +" " + this.c2;
	}
	
	public int getC1()
	{
		return this.c1;
	}
	
	public int getC2()
	{
		return this.c2;
	}
}
