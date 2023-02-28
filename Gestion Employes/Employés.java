
package exercice_chap4;
import java.time.LocalDate;
import java.util.*;

public class Employés {
	protected String nom;
	protected String prenom;
	protected LocalDate date_emb;
	protected int matricule;
	protected int salaire;
	public static int matricule_id=0;
	
	public Employés() {
		
	}
	public Employés(String nom,String prenom,LocalDate date_emb,int salaire){
		this.nom=nom;
		this.prenom=prenom;
		this.date_emb=date_emb;
		this.matricule=++matricule_id;
		this.salaire=salaire;
		
	}

	
	public int getMatri() {
		return matricule;
	}
	
	public int SetMatri(int Matri) {
		return this.matricule=Matri;
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


	public LocalDate getDate_emb() {
		return date_emb;
	}


	public void setDate_emb(LocalDate date_emb) {
		this.date_emb = date_emb;
	}


	public int getMatricule() {
		return matricule;
	}


	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}


	public int getSalaire() {
		return salaire;
	}


	public int setSalaire(int salaire) {
		return this.salaire += salaire;
	}
	public String Infos_Compte() {
		return "Matricule:  "+getMatricule()+"  Nom:  "+getNom()+" Prenom :  "+getPrenom()+"  Embauché Le:  "+getDate_emb()+"  \nSalaire  "+getSalaire();
	}
}
