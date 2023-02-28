package Test;

public class PERSONNE {
	private String nom;
	private String prenom;
	private int age;
	
	public PERSONNE(String nom,String prenom) {
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public PERSONNE(String nom,String prenom,int age) {
		this(nom,prenom);
		this.age=age;
	}
	
	public String presenteToi() {
		return this.nom+this.prenom+this.age;
	}
	
	public int set_Age(int new_age) {
			return this.age=new_age;

}
	
	public static void main (String[]args) {
		PERSONNE person1=new PERSONNE("FAYA","Lidao");
		System.out.println(person1.presenteToi());
		person1.set_Age(16);
		System.out.println(person1.presenteToi());
	}
	
	public void set_Age2(int new_age,PERSONNE p) {
		p.age=new_age;
	}
	public void set_Age3(int new_age,PERSONNE p) {
		this.age=new_age;
	}
}