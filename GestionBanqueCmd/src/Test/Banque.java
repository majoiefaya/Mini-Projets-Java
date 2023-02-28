package Test;
import java.util.ArrayList;
import java.util.Scanner;


public class Banque {
	private int num_clt;
	private String nom;
	private String prenom;
	private String address;
	private int num_cmpt;
	private int sold_cmpt;
	public static int id=0;
	public static int id_cmpt=0;
	
	Scanner entry=new Scanner(System.in);
	ArrayList<Banque> tab_client1=new ArrayList<Banque>();
	
	public Banque() {
	}
 
	public Banque(String nom,String prenom ,String address,int sold_cmpt) {
		this.num_clt=++id;
		this.nom=nom;
		this.prenom=prenom;
		this.address=address;
		this.num_cmpt=++id_cmpt;
		this.sold_cmpt=sold_cmpt;
	}

	public int getnum() {
		return num_clt;
	}


	public void setnum(int num) {
		this.num_clt = num;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getNum_cmpt() {
		return num_cmpt;
	}


	public void setNum_cmpt(int num_cmpt) {
		this.num_cmpt = num_cmpt;
	}


	public int getSold_cmpt() {
		return sold_cmpt;
	}


	public void setSold_cmpt(int sold_cmpt) {
		this.sold_cmpt += sold_cmpt;
	}
	
	public String infos_cmpt() {
		return  this.getnum()+"\t"+this.getNom()+"\t"+this.getPrenom()+"\t"+this.getAddress()+"\t"+this.getNum_cmpt()+"\t"+this.getSold_cmpt();
	}
	public void retrait(int sold) {
		this.sold_cmpt=this.sold_cmpt-sold;
	}
	
	public void creer_compte() {
		System.out.println("\nEntrez le nom");
		String nom=entry.next();
		System.out.println("Entrez le prenom");
		String prenom=entry.next();
		System.out.println("Entrez l'addresse");
		String adress=entry.next();
		System.out.println("Entrez le Solde");
		int solde=entry.nextInt();

		Banque client = new Banque(nom,prenom,adress,solde);
						  
		tab_client1.add(client);

		for (int i = 0; i<tab_client1.size(); i++) {
		System.out.println(tab_client1.get(i).infos_cmpt());
			}
	}
	
	
	public void retrait_compte() {
		System.out.println("Entrez votre numero de compte");
		int num_client=entry.nextInt();
		
		 for (int i = 0; i<tab_client1.size(); i++) {
			   if(tab_client1.get(i).getnum()==num_client) {
	
				   System.out.println("Entrez Le solde a retirer");
				   int sold_retrait=entry.nextInt();
				   
				   tab_client1.get(i).retrait(sold_retrait);
				   System.out.println(tab_client1.get(i).getSold_cmpt());
			   };
		  
		 }
		 
		
	}
	
	public void versement() {
		System.out.println("Entrez votre numero de compte");
		int num_client=entry.nextInt();
		
		System.out.println("Entrez Le solde a verser");
		int sold_ajout=entry.nextInt();
		
		 for (int i = 0; i<tab_client1.size(); i++) {
			   if(tab_client1.get(i).getnum()==num_client) {
				   tab_client1.get(i).setSold_cmpt(sold_ajout);;
				   tab_client1.get(i).getSold_cmpt();
			   };
		  
		 }
		
		
	}
	public void Liste_client() {
		 for (int i = 0; i<tab_client1.size(); i++) {
			   System.out.println(tab_client1.get(i).infos_cmpt());
		  }
	}
	
	
}

	

		
		
				
	 


