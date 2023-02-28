package exercice_chap4;

import java.time.LocalDate;

public class Comisionaire extends Employés{
	public static int salaire_com=1000;
	public Comisionaire(String nom,String prenom,LocalDate date_emb,int salaire) {
		super(nom,prenom,date_emb,salaire);		
	}
	
	public static void main (String [] args) {
		LocalDate date=java.time.LocalDate.now();
		Permanant permanant=new Permanant("GOGO","LIDAO",date,salaire_com);
		System.out.println(permanant.Infos_Compte());
	}
}