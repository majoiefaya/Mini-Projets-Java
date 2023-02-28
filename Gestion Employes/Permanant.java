package exercice_chap4;

import java.time.*;

public class Permanant extends Employés{
	public static  int salaire_perm=0;
	public Permanant(String nom,String prenom,LocalDate date_emb,int salaire) {
		super(nom,prenom,date_emb,salaire);
		
	}
	
	public static void main (String [] args) {
		LocalDate date=java.time.LocalDate.now();
		Permanant permanant=new Permanant("faya","LIDAO",date,1299);
		System.out.println(permanant.Infos_Compte());
		
		
	}
}
