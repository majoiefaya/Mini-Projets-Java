package TP5;

public class Electromenager extends Article implements VenteParPiece{

	private int stock;
	public Electromenager(double prixA, double prixV, String Nom, String Fournisseur) {
		super(prixA, prixV, Nom, Fournisseur);
		stock=0;
	
	}


	public double RemplirLeStock(int quantite) {
		return this.stock=this.stock+quantite;
	}
	
	public String InfosStock() {
		return "Le Stock de Ce Produit est:"+this.stock;
		
	}
	
	public double vendre(int quantite) {
		if(quantite<this.stock) {
			this.stock=this.stock-quantite;
			return quantite*this.getPrixVente();
		}else {
			System.out.println("La quantite voulue est Superieur au Stock Present");
			return 0;
		}
		
	}

}
