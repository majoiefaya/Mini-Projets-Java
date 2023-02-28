package Test;


public class Point {
	private char nom;
	private double abcisse;
	
	public Point(char nom,double abcisse){
		this.nom=nom;
		this.abcisse=abcisse;

	}
	public char get_nom() {
		return this.nom;
	}
	public char set_nom(char new_name) {
		return this.nom=new_name;
	}
	public double get_abcisse() {
		return this.abcisse;
		
	}
	public void set_abcisse(double new_abcisse) {
		this.abcisse=new_abcisse;
	}
	public String affiche(){
		return "Le nom de l objet est  "+get_nom()+"Et l abcisse est: "+get_abcisse();
	}
	
	public double translate(double new_abcisse) {
		return this.abcisse+=new_abcisse;
}
	
}