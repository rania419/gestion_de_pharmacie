package pharmacie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class medicament_Extern extends medicament {
	
	
	static protected  int tauxRemb = 20;
	protected String dat="",nom_fourn;
	protected double prix;
	protected int numlot,stock;
	SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyyy");
	Date date_exp =new Date();
	protected boolean exige_ord,est_remboursable;

	
	public medicament_Extern(int n,String nom_f,String nom, String typ, String mode,boolean exige_ord,double prix,String dat,int s,boolean remboursable) {
		super(nom, typ, mode);
		this.prix=prix;
		this.stock = s;
		this.exige_ord= exige_ord;
		this.numlot = n;
		this.est_remboursable = remboursable;
		this.nom_fourn = nom_f;
	
		try {
			this.date_exp=df.parse(dat);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	public boolean exige_ord() {
		return exige_ord;
	}
	public int getStock() {
		return stock;
	}
	
	
	public Date getDate_exp() {
		return date_exp;
	}
	
	public int getNumlot() {
		return numlot;
	}
	
	
	
	public void setDate_exp(String date) throws ParseException {
		
		this.date_exp=df.parse(date);
				
	}
	
	public void setNumlot(int numlot) {
		this.numlot = numlot;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public void setNom_fourn(String nom_fourn) {
	this.nom_fourn = nom_fourn;
	}
	
	
	public static void setTauxRemb(int tauxRemb) {	
	medicament_Extern.tauxRemb = tauxRemb;
	}
	
	
	public static int getTauxRemb() {
		return tauxRemb;
	}
	
	
	public String getNom_fourn() {
		return nom_fourn;
	}
	
	
	public void diminuerStock(int quantite) {
		
	    stock = stock - quantite;
		
	  }
	public void augmenterStock(int quantite) {
	    stock = stock + quantite;
	  }
	
	public double getPrix() {
		return prix;
	}
	
	public double calculprix(int qtt) {
		return this.prix*qtt;
	}

	
	public double calculRembourse(double prix) {
		double prix_rmbrse = 0.0;
		
			prix_rmbrse = ((100 - getTauxRemb()) * prix)/100;
			return prix_rmbrse;
		}
	public boolean isExige_ord() {
		return exige_ord;
	}
	
}
		
	
