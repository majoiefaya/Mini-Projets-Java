package Etudiant;

public class Etudiant {
	private int matricule;
	private String nom;
	private String prenom;
	private int age;
	public static int id=0;
	public int Moyenne;
	
	public Etudiant(String nom,String prenom,int age) {
		this.matricule=++id;
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.Moyenne=0;
		
	}
	
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getMoyenne() {
		return Moyenne;
	}

	public void setMoyenne(int moyenne) {
		Moyenne = moyenne;
	}
	
	

	public String infos_et() {
		return "Nom:\t"+this.getNom()+"\n\nPrenom:\t"+this.getPrenom()+"\n\nAge:\t"+this.getAge()+"\n\nMoyenne:\t"+getMoyenne()+"\n";	
	}
}
