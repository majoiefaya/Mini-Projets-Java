package Etudiant;
import java.util.*;


public class EtudiantMain {
	
	
	
	public static <K, V> K get_key(Map<K, V> map, V value) {
		
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
	
	
	
	public static void main(String []ags) {
		Map<Object,Integer> Moyenne_Etudiant=new HashMap<>();
		Map<Object,Object> tab_Ecole=new HashMap<>();
		Scanner entry=new Scanner(System.in);
		while(true) {
			try {
				System.out.print("1-Ajout Etudiant\n2-Affichage Etudiant et Notes\n3-Classement");
				System.out.println("Que voulez vous faire?");
				int choix=entry.nextInt();
				switch(choix) {
				
					case 1:
						System.out.println("Entrez le nom Etudiant");
						String nom=entry.next();
						System.out.println("Entrez le prenom");
						String prenom=entry.next();
						System.out.println("Entrez l age");
						int age=entry.nextInt();
						Etudiant Student=new Etudiant(nom,prenom,age);
						int id=Student.getMatricule();
						
						System.out.print("Entrez Le nombre de Matiere");
						int nombre_mat=entry.nextInt();
						while (nombre_mat>0) {
							System.out.println("Entre Le nom de La Matiere");
							String nom_mat=entry.next();
							
							System.out.println("Entrez le Coeff");
							int coeff=entry.nextInt();
							
							System.out.println("Entrez la note de L eleve dans cette Matiere");
							int note=entry.nextInt();
							
							Matiere lesson=new Matiere(id,nom_mat,coeff,note);
							tab_Ecole.put(Student,lesson);
							
							int somme_note=0;
							somme_note+=note;
							int somme_coeff=0;
							somme_coeff+=coeff;
							int note_glob=somme_note*somme_coeff;
							
							int Moyenne=note_glob/somme_coeff;
							Student.setMoyenne(Moyenne);
							nombre_mat-=1;
						}
						
						int Moyenne=Student.getMoyenne();
						Moyenne_Etudiant.put(Student,Moyenne);
						System.out.println("Innformations de L enregistrement\nv");
						System.out.println("------------------------------------------------------------------");
						tab_Ecole.forEach((key,value)->{
							System.out.println(((Etudiant) key).infos_et());
						});
						System.out.println("------------------------------------------------------------------");
						System.out.println("\nEleve Bien enregistré");
						break;
						
						
					case 2:
						tab_Ecole.forEach((key,value)->{
							System.out.println(((Etudiant) key).infos_et()+"\n"+((Matiere) value).Infos_Mat());
							System.out.println("------------------------------------------------------------------");
							
						});
						
						break;
						
						
					case 3:
						System.out.println("Classement des Eleves Par Ordre de Merite de Moyenne");
						
						Moyenne_Etudiant.forEach((key,value)->{
							int value2=0;
							for(int i=0;i<Moyenne_Etudiant.size();i++) {
								if(value>value2) {
									value2=value;
									
									if(Moyenne_Etudiant.containsValue(value)) {
										key=Moyenne_Etudiant.get(key);
										  Object Etudiant = get_key(Moyenne_Etudiant,value2);
									      System.out.println(((Etudiant) Etudiant).infos_et());
									}
									
								}
							}
						});
						
						break;
					}
				
			}catch(InputMismatchException e) {
				System.out.println("vous avez entrez une lettre ou un caractere special,\nRéessayez\nChoisissez Une Autre Option");
			}
		}
	}
}
