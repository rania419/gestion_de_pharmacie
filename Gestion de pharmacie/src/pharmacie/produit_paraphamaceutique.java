package pharmacie;

class produit_paraphamaceutique {

	protected String nom,nom_forunisseur;
	protected int qtt,num_lot;
	protected double prix;
	
	public produit_paraphamaceutique(int num_lot2, String nom_f, String nom2, int qtt2, double prix2) {
		this.num_lot = num_lot2;
		this.nom_forunisseur = nom_f;
		this.nom = nom2;
		this.qtt = qtt2;
		this.prix = prix2;
	}
	public String getNom() {
		return nom;
	}
	public double getPrix() {
		return prix;
	}
	public int getQtt() {
		return qtt;
	}
	public int getNum_lot() {
		return num_lot;
	}
	public String getNom_forunisseur() {
		return nom_forunisseur;
	}
	
	public void diminuerStock(int quantite) {
		
	    qtt = qtt - quantite;
		
	  }
	public void augmenterStock(int quantite) {
	    qtt = qtt + quantite;
	  }
	public double calculprix(int qtt) {
		return this.prix*qtt;
	}
	
}
