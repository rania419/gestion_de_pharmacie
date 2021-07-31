package pharmacie;

class medicament_prescrit {
	protected String nom;
	protected int quantite,dure;
	
	
	public medicament_prescrit(String nom, int qt, int dure) {
		this.nom = nom;
		this.quantite = qt;
		this.dure = dure;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public int getDure() {
		return dure;
	}

}
