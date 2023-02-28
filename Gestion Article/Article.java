package TP5;

public class Article {
	private double prixAchat;
	private double prixVente;
	private String NomArticle;
	private String Fournisseur;
	
	
	public Article(double prixA,double prixV,String Nom,String Fournisseur) {
		this.prixAchat=prixA;
		this.prixVente=prixV;
		this.NomArticle=Nom;
		this.Fournisseur=Fournisseur;
		
	}
	public double getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}
	public double getPrixVente() {
		return prixVente;
	}
	public void setPrixVente(double prixVente) {
		this.prixVente = prixVente;
	}
	public String getFournisseur() {
		return Fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		Fournisseur = fournisseur;
	}
	public String getNomArticle() {
		return NomArticle;
	}
	public void setNomArticle(String nomArticle) {
		NomArticle = nomArticle;
	}
	
	
	public String InfosAarticle() {
	return "Le Nom de l article est:"+
	this.getNomArticle()+"Le Prix d Achat est:"
	+this.getPrixAchat()+"Le Prix de Vente est:"+
	this.getPrixVente()+"Le Fournisseur du Produit est:"+
	this.getFournisseur();
	}
	
	public double Rendement() {
		return(this.getPrixAchat()-this.getPrixVente())/this.getPrixAchat();
	}
}

