package pharmacie;

abstract class medicament {
	protected String nom,modeprise;
	protected String type;
	
	public medicament(String nom, String typ, String mode) {
		this.nom=nom;
		this.type = typ;
		this.modeprise = mode;
		
	}
	
	public  String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setModeprise(String modeprise) {
		this.modeprise = modeprise;
	}
	
	
	
	
}
