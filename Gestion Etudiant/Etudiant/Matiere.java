package Etudiant;

public class Matiere {
	private int id_et;
	private String nom_mat;
	private int coeff;
	private int note;
	
	public Matiere(int id,String nom_mat,int coeff,int note) {
		this.id_et=id;
		this.nom_mat=nom_mat;
		this.coeff=coeff;
		this.note=note;
		
	}
	
	public int getId_et() {
		return id_et;
	}

	public void setId_et(int id_et) {
		this.id_et = id_et;
	}

	public String getNom_mat() {
		return nom_mat;
	}

	public void setNom_mat(String nom_mat) {
		this.nom_mat = nom_mat;
	}

	public int getCoeff() {
		return coeff;
	}

	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}
	public String Infos_Mat() {
		return "Matricule_eleve:-->\t"+this.getId_et()+"\n\nNom_matiere:-->\t"+this.getNom_mat()+"\n\nCoeff:-->"+this.getCoeff()+"\n\nNote:-->\t"+this.getNote()+"\n";
	}
}
