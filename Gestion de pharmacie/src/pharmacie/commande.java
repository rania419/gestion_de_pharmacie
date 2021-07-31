package pharmacie;

import java.util.HashMap;

class commande {
	protected HashMap<String, Integer> produit ;
	
	public commande() {
		
		this.produit = new HashMap<String, Integer>();
	}
	
	public HashMap<String, Integer> getProduit() {
		return produit;
	}
	
	public void setProduit(String produit, Integer qtt) {
		this.produit.put(produit, qtt);
	}
	
	public void removeProduit(String produit) {
		this.produit.remove(produit);
	}


}
