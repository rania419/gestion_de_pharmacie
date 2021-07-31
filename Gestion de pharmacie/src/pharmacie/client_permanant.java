package pharmacie;

import java.util.ArrayList;

class client_permanant extends client{
	protected int n_social;
	protected boolean maladie_cronique;
	protected ArrayList<String> medicaments;

	public client_permanant(String nom, String prenom, int age, boolean cronic) {
		super(nom, prenom, age);
		
		this.maladie_cronique = cronic;
		this.medicaments = new ArrayList<String>();
		this.n_social=0;
	}



	public int getN_social() {
		return n_social;
	}
	
	public ArrayList<String> getMedicaments() {
		return medicaments;
	}
	
	public boolean getCronique() {
		return maladie_cronique;
	}
	
	public void setMaladie_cronique(boolean maladie_cronique) {
		this.maladie_cronique = maladie_cronique;
	}
	
	public void setMedicaments(String medicaments) {
		this.medicaments.add(medicaments);
	}
	
	public void setN_social(int n_social) {
		this.n_social = n_social;
	}
}
