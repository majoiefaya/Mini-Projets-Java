package Test;

import java.util.*;

public class banque_main {
	public static void main(String[] args) {
		ArrayList<Banque> tab_client1=new ArrayList<Banque>();
        int repeat = 10;
		while(repeat<100){
			Scanner entry=new Scanner(System.in);

			System.out.println("Menu de L Application");
			System.out.println("1-Creer Compte\n2-Retrait Compte\n3-Versement\n4-Liste des Clients\n5-Sortir de l'application");
			try {
			int choix=entry.nextInt();
		    switch (choix) {
		    case 1 :
				  
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
				System.out.println("Votre compte a bien �t� Cr�e");
				for (int i = 0; i<tab_client1.size(); i++) {
				System.out.println(tab_client1.get(i).infos_cmpt());
					}
		    	break;
		    	
		    case 2 :
		    	System.out.println("Entrez votre numero de compte");
				int num_client=entry.nextInt();
				
				 for (int i = 0; i<tab_client1.size(); i++) {
					 
					   if(tab_client1.get(i).getnum()==num_client) {
						   System.out.println("Entrez Le solde a retirer");
						   int sold_retrait=entry.nextInt();
						   if( tab_client1.get(i).getSold_cmpt()>sold_retrait) {
							   tab_client1.get(i).retrait(sold_retrait);
							   System.out.println("Le solde actuel de votre compte est:"+tab_client1.get(i).getSold_cmpt());
						   }
						   else {
							   System.out.println("Vous ne disposez pas assez de montant pour effectuer l operation");
						   }
						   
						   
						   
					   };
				  
				 }
		    	break;
		    case 3 : 
		    	System.out.println("Entrez votre numero de compte");
				int num=entry.nextInt();
				
				System.out.println("Entrez Le solde a verser");
				int sold_ajout=entry.nextInt();
				if(sold_ajout>0) {
					 for (int i = 0; i<tab_client1.size(); i++) {
						   if(tab_client1.get(i).getnum()==num) {
							   tab_client1.get(i).setSold_cmpt(sold_ajout);;
							   System.out.println("Le solde actuel de votre compte est:"+tab_client1.get(i).getSold_cmpt());
						   };
					  
					 }
				}
				else{
					System.out.println("Vous ne pouvez pas ajouter un montant Negatif");
				}
				
				
		    	break;
		    
		    case 4:
		    	 System.out.println("Liste des Clients");
		    	 for (int i = 0; i<tab_client1.size(); i++) {
					   System.out.println(tab_client1.get(i).infos_cmpt());
				  }
		    	break;
		    
		    case 5:
		    	System.exit(0);
		    	break;
		    	
		    }
		}catch(InputMismatchException e) {
			
			System.out.println("vous avez entrez une lettre ou un caractere special,\nR�essayez");
	    	
		}
	}
		
}

}
