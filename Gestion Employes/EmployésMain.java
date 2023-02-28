package exercice_chap4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployésMain {

	public static void main(String[] args) {
		LocalDate date=java.time.LocalDate.now();
		ArrayList<Object> tab_Employés=new ArrayList<>();
		ArrayList<Permanant> tab_Permanant=new ArrayList<Permanant>();
		ArrayList<Contractuel> tab_Contractuel=new ArrayList<Contractuel>();
		ArrayList<Comisionaire> tab_Comisionaire=new ArrayList<Comisionaire>();
        int repeat = 10;
		while(repeat<100){
			Scanner entry=new Scanner(System.in);
			System.out.println("---------------------------------------------\n");
			System.out.println("Menu de L Application");
			System.out.println("++++++++++++++++++++\n");
			System.out.println("---------------------------------------------\n");
			System.out.println("1- Creer Compte\n\n2- Visualisation des information d’un employé en utilisant son matricule\n\n3- Mise à jour des informations d’un employé en utilisant son matricule\n\n4-  Afficher la liste des employés\n\n5- Sortir de l'application");
			System.out.println("---------------------------------------------\n");
			try {
				System.out.println("\nQue voulez vous Faire?");
				int choix=entry.nextInt();
			    switch (choix) {
			    	case 1 :
			    		System.out.println("1-Créer Compte Permanant\n2-Créer Compte Contractuel\n3-Créer Compte Commissionnaire");
			    		System.out.println("Que voulez vous Faire?");
						int choix2=entry.nextInt();
						switch(choix2) {
						case 1:
							System.out.print("Entrez le Nom de l employé Permanant");
							String nom_perm=entry.next();
							System.out.print("Entrez le prenom de l employé Permanant");
							String prenom_perm=entry.next();
							System.out.print("Entrez le Salaire de l employé Permanant");
							int salaire_perm=entry.nextInt();
							if(salaire_perm>0) {
							Permanant permanant=new Permanant(nom_perm,prenom_perm,date,salaire_perm);
							tab_Employés.add(permanant);
							tab_Permanant.add(permanant);
							}else {
								System.out.println("Le salaire Ne peut pas etre Negatif,Enregistrement Non éffectué");
							}
							System.out.println("---------------------------------------------\n");
							System.out.println("Liste des Employés Permanants\n");
							System.out.print("++++++++++++++++++++++++++++++++++\n");
							for (int i = 0; i<tab_Permanant.size(); i++) {
								System.out.println(tab_Permanant.get(i).Infos_Compte());
									}
							System.out.println("---------------------------------------------\n");
							break;
						case 2:
							System.out.print("Entrez le Nom de l employé Contractuel");
							String nom_con=entry.next();
							System.out.print("Entrez le prenom de l employé Contractuel");
							String prenom_con=entry.next();
							System.out.print("Entrez le Salaire de l employé Contractuel");
							int salaire_con=entry.nextInt();
							System.out.print("Entrez le nombre d heure de travail de l employé Contractuel");
							int nb_heure=entry.nextInt();
							if(salaire_con>0 && nb_heure>0) {
								salaire_con=salaire_con*nb_heure;
								Contractuel contractuel=new Contractuel(nom_con,prenom_con,date,salaire_con);
								tab_Employés.add(contractuel);
								tab_Contractuel.add(contractuel);
							}
							else {
								System.out.println("Le salaire Ne peut pas etre Negatif,Enregistrement Non éffectué");
							}
							System.out.println("---------------------------------------------\n");
							System.out.println("Liste des Employés Contractuel\n");
							System.out.println("++++++++++++++++++++++++++++++++++\n");
							for (int i = 0; i<tab_Contractuel.size(); i++) {
								System.out.println(tab_Contractuel.get(i).Infos_Compte());
									}
							System.out.println("---------------------------------------------\n");
							break;
						case 3:
							
							System.out.print("Entrez le Nom de l employé Comissionaire");
							String nom_com=entry.next();
							System.out.print("Entrez le prenom de l employé Comissionaire");
							String prenom_com=entry.next();
							System.out.print("Entrez le Salaire de l employé Comissionaire");
							int salaire_com=entry.nextInt();
							if(salaire_com>0) {
								Comisionaire comissionaire=new Comisionaire(nom_com,prenom_com,date,salaire_com);
								tab_Employés.add(comissionaire);
								tab_Comisionaire.add(comissionaire);
							}else {
								System.out.println("Le salaire Ne peut pas etre Negatif,Enregistrement Non éffectué");
							}
							System.out.println("---------------------------------------------\n");
							System.out.println("Liste des Employés Comissionaire\n");
							System.out.println("++++++++++++++++++++++++++++++++++\n");
							for (int i = 0; i<tab_Comisionaire.size(); i++) {
								System.out.println(tab_Comisionaire.get(i).Infos_Compte());
									}
							System.out.println("---------------------------------------------\n");
							break;
						}
			    		break;
			    	case 2:
			    		

						System.out.println("Entrez Le Numero Matriucle de L employé");
						int num_matri=entry.nextInt();
						
							 for (int i = 0; i<tab_Employés.size(); i++) {
								   if(((Employés) tab_Employés.get(i)).getMatri()==num_matri) {
									   System.out.println("---------------------------------------------\n");
									   System.out.println(((Employés) tab_Employés.get(i)).Infos_Compte());
									   System.out.println("---------------------------------------------\n");
									 
								   }
							 }
						break;
			    	case 3:
			    		System.out.println("1-Modifier Une seule Information\n2-Modifier Toutes Les informations\n3-Modifier par Categorie d employés");
			    		System.out.print("Que voulez vous faire?");
			    		int choix3=entry.nextInt();
			    		if (choix3==1) {
			    	
							System.out.print("1-Nom\n2-Prenom\n3-Salaire\nChoisissez Entre Les Options 1,2,3");
							int choix_modifi=entry.nextInt();
							if(choix_modifi==1) {
								System.out.println("Entrez Le Numero Matriucle de L employé");
								int num_matri2=entry.nextInt();
								for (int i = 0; i<tab_Employés.size(); i++) {
									if(((Employés) tab_Employés.get(i)).getMatri()==num_matri2) {
									    System.out.print("Entrez le Nouveau Nom de l employé ");
										String nom=entry.next();
										((Employés) tab_Employés.get(i)).setNom(nom);
										System.out.print("Informations de L employé Modifié");
										System.out.println("---------------------------------------------\n");
										System.out.println(((Employés) tab_Employés.get(i)).Infos_Compte());
										System.out.println("---------------------------------------------\n");
									}
								}
							}
							else if(choix_modifi==2) {
								System.out.println("Entrez Le Numero Matriucle de L employé");
								int num_matri2=entry.nextInt();
								for (int i = 0; i<tab_Employés.size(); i++) {
									if(((Employés) tab_Employés.get(i)).getMatri()==num_matri2) {
										System.out.print("Entrez le Nouveau prenom de l employé");
										String prenom=entry.next();
										((Employés) tab_Employés.get(i)).setPrenom(prenom);
										System.out.print("Informations de L employé Modifié");
										System.out.println("---------------------------------------------\n");
										System.out.println(((Employés) tab_Employés.get(i)).Infos_Compte());
										System.out.println("---------------------------------------------\n");
									}
								}
								
							}
							else if(choix_modifi==3) {
								System.out.println("Entrez Le Numero Matriucle de L employé");
								int num_matri2=entry.nextInt();
								for (int i = 0; i<tab_Employés.size(); i++) {
									if(((Employés) tab_Employés.get(i)).getMatri()==num_matri2) {
										System.out.print("Entrez le  Nouveau Salaire de l employé");
										int salaire=entry.nextInt();
										((Employés) tab_Employés.get(i)).setSalaire(salaire);
										System.out.print("Informations de L employé Modifié");
										System.out.println("---------------------------------------------\n");
										System.out.println(((Employés) tab_Employés.get(i)).Infos_Compte());
										System.out.println("---------------------------------------------\n");
									}
								}
							}
			    		}
			    		else if(choix3==2) {
			    		System.out.println("Entrez Le Numero Matriucle de L employé");
						int num_matri2=entry.nextInt();
			    		
						for (int i = 0; i<tab_Employés.size(); i++) {
							   if(((Employés) tab_Employés.get(i)).getMatri()==num_matri2) {
								    System.out.print("Entrez le Nouveau Nom de l employé ");
									String nom=entry.next();
									System.out.print("Entrez le Nouveau prenom de l employé");
									String prenom=entry.next();
									System.out.print("Entrez le  Nouveau Salaire de l employé");
									int salaire=entry.nextInt();
									((Employés) tab_Employés.get(i)).setNom(nom);
									((Employés) tab_Employés.get(i)).setPrenom(prenom);
									((Employés) tab_Employés.get(i)).setSalaire(salaire);
									System.out.print("Informations de L employé Modifié\n");
									System.out.println("---------------------------------------------\n");
									System.out.println(((Employés) tab_Employés.get(i)).Infos_Compte());
									System.out.println("---------------------------------------------\n");
							   }
						 }
			    		}
			    		else if(choix3==3) {
			    			System.out.println("1-Permanant\n2-Contractuel\n3-Comissionaire");
			    			System.out.print("Que voulez vous faire?");
				    		int choix4=entry.nextInt();
				    		if(choix4==1) {
				    			System.out.println("Entrez Le Numero Matriucle de L employé");
								int num_matri2=entry.nextInt();
								 System.out.print("Entrez le Nouveau Nom de l employé ");
								 String nom=entry.next();
								 System.out.print("Entrez le Nouveau prenom de l employé");
								 String prenom=entry.next();
								 System.out.print("Entrez le  Nouveau Salaire de l employé");
								 int salaire=entry.nextInt();

								for (int i = 0; i<tab_Permanant.size(); i++) {
									   if(tab_Permanant.get(i).getMatri()==num_matri2) {
										   	String nom_perm=tab_Permanant.get(i).getNom();
										   	tab_Permanant.get(i).setNom(nom);
										   	tab_Permanant.get(i).setPrenom(prenom);
										   	tab_Permanant.get(i).setSalaire(salaire);
										   	System.out.print("Informations de L employé Modifié\n");
										   	System.out.println("---------------------------------------------\n");
											System.out.println(((Employés) tab_Employés.get(i)).Infos_Compte());
											System.out.println("---------------------------------------------\n");
									   }
								}
				    		}
				    		else if(choix4==2){
				    			 System.out.println("Entrez Le Numero Matriucle de L employé");
								 int num_matri2=entry.nextInt();
								 System.out.print("Entrez le Nouveau Nom de l employé ");
								 String nom=entry.next();
								 System.out.print("Entrez le Nouveau prenom de l employé");
								 String prenom=entry.next();
								 System.out.print("Entrez le  Nouveau Salaire de l employé");
								 int salaire=entry.nextInt();
									for (int i = 0; i<tab_Contractuel.size(); i++) {
										   if(tab_Contractuel.get(i).getMatri()==num_matri2) {
											   	String nom_perm=tab_Contractuel.get(i).getNom();
											   	tab_Contractuel.get(i).setNom(nom);
											   	tab_Contractuel.get(i).setPrenom(prenom);
											   	tab_Contractuel.get(i).setSalaire(salaire);
											   	System.out.print("Informations de L employé Modifié\n");
												System.out.println(( tab_Contractuel.get(i)).Infos_Compte());
												System.out.print("Voulez vous Modifiez les heures du contrat de Votre Employé?1-Oui\n2-Non");
								    			int choix5=entry.nextInt();
								    			if (choix5==1) {
								    				 System.out.print("Entrez les Nouvelles Heures de Contrats");
													 int heure=entry.nextInt();
													 int salaire2=salaire*heure;
													 tab_Contractuel.get(i).setSalaire(salaire2);
													 ((Employés) tab_Employés.get(i)).setSalaire(salaire2);
								    			 }
								    			 else {
								    				 tab_Contractuel.get(i).setSalaire(salaire);
								    				 ((Employés) tab_Employés.get(i)).setSalaire(salaire);
								    			 }

										   }
										    System.out.println("---------------------------------------------\n");
											System.out.println("Informations de L employé Modifié");
											System.out.println(((Employés) tab_Employés.get(i)).Infos_Compte());
											System.out.println("---------------------------------------------\n");
									}
				    			
				    		}else if(choix4==3) {
				    			 System.out.println("Entrez Le Numero Matriucle de L employé");
								 int num_matri2=entry.nextInt();
								 System.out.print("Entrez le Nouveau Nom de l employé ");
								 String nom=entry.next();
								 System.out.print("Entrez le Nouveau prenom de l employé");
								 String prenom=entry.next();
								 System.out.print("Entrez le  Nouveau Salaire de l employé");
								 int salaire=entry.nextInt();
									for (int i = 0; i<tab_Comisionaire.size(); i++) {
										   if(tab_Comisionaire.get(i).getMatri()==num_matri2) {
											   	String nom_perm=tab_Comisionaire.get(i).getNom();
											   	tab_Comisionaire.get(i).setNom(nom);
											   	tab_Comisionaire.get(i).setPrenom(prenom);
												System.out.print("1-Vente de 1 000 000 Dans Le Mois\n2-Vente de 3 000 000 Dans Le Mois\n3-Vente de 10 0000 0000 Dans Le Mois\n4-Ne Pas Faire d augmentation de Comission a L employé");
										    	int choix5=entry.nextInt();
										    	if (choix5==1) {
													int salaire_ajout=salaire*1/15;
													int salaire2=salaire+salaire_ajout;
													tab_Comisionaire.get(i).setSalaire(salaire2);
										    	}
								    			 else if(choix5==2) {
								    				 int salaire_ajout=salaire*1/10;
								    				 int salaire2=salaire+salaire_ajout;
													 tab_Comisionaire.get(i).setSalaire(salaire2);
								    			 }
								    			 else if(choix5==3) {
								    				 int salaire_ajout=salaire*1/5;
								    				 int salaire2=salaire+salaire_ajout;
													 tab_Comisionaire.get(i).setSalaire(salaire2);
								    			 }
								    			 else if (choix5==4) {
													 tab_Comisionaire.get(i).setSalaire(salaire);
								    			 }
										   }
										   System.out.print("Informations de L employé Modifiés\n");
										   System.out.println("---------------------------------------------\n");
										   System.out.println((tab_Comisionaire.get(i)).Infos_Compte());
										   System.out.println("---------------------------------------------\n");
									}
								   
				    			
				    		}
				    		
				    		
			    		}
					break;
			    	case 4:
			    		 System.out.println("---------------------------------------------\n");
			    		 System.out.println("Liste Complete des Employés Du service\n");
			    		 System.out.println("+++++++++++++++++++++++++++++++++++++++\n");
			    		 for (int i = 0; i<tab_Employés.size(); i++) {
			    			  System.out.println("---------------------------------------------\n");
							  System.out.println(((Employés) tab_Employés.get(i)).Infos_Compte());
							  System.out.println("---------------------------------------------\n");
					}
			    	break;
			    	case 5:
			    		System.out.println("Merci A+\n");
			    		System.exit(0);
				    	break;
			    		 
			    }
	
		}catch(InputMismatchException e) {
			
			System.out.println("vous avez entrez une lettre ou un caractere special,\nRéessayez\nChoisissez Une Autre Option");
	    	
		}
	}
		
}

	}

