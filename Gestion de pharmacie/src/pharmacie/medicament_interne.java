package pharmacie;

import java.util.HashMap;

class medicament_interne extends medicament{
	
	static protected int tauxRemb = 10;
	protected HashMap <String, Double> composition_dosage = new HashMap<String, Double>();
	protected double prix;
	
	public medicament_interne(String nom, String typ, String mode,double prix) {
		super(nom, typ, mode);
		this.prix = prix;
		
	}


	
	public void setComposition_dosage(String comp , Double dosage) {
		this.composition_dosage.put(comp, dosage);
	}
	
	
	public double getPrix() {
		return prix;
	}
	
	public double calculRembourse(double prix) {
		double prix_rmbrse = 0.0;
		
			prix_rmbrse = ((100 - tauxRemb) * prix)/100;
			return prix_rmbrse;
		}
	
	public double calculprix(int qtt) {
		return getPrix()*qtt;
	}
	
	
	
	

}
