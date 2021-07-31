package pharmacie;

class medecin {
	protected String nom, prenom, specialite, address;
	
	public medecin(String nom, String pren, String spec, String address) {
		
		this.nom = nom;
		this.prenom = pren;
		this.specialite = spec;
		this.address = address;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public String getSpecialite() {
		return specialite;
	}
	
	public String getAdd() {
		return address;
	}
	
}
