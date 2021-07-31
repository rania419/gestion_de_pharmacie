package pharmacie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class ordonance {
	client c;
	medecin m;
	SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyyy");
	Date date_consultation = new Date();
	String dat;
	ArrayList <medicament_prescrit> medic;
	
	public ordonance(String nomMed, String prenMed, String spec, String add, String nomC, String prenC, int age,String dat) {
		this.c = new client(nomC, prenC, age);
		this.m = new medecin(nomMed, prenMed, spec, add);
		this.medic = new ArrayList<>();
		try {
			this.date_consultation=df.parse(dat);
		} catch (ParseException e) {
			System.out.println("Veuillez entrer la date suivante dd-jj-yyyy");
		}
	}
	
	public void setMedic(String nomMed, int qt, int dure) {
		this.medic.add(new medicament_prescrit(nomMed, qt, dure));
	}
	
	

	public void afficheClient() {
		System.out.print("Nom Client : " +c.nom+"\t Prenom Client : " + c.prenom + "\t Age : " + c.age);
		
	}
	public ArrayList<medicament_prescrit> getMedicaments() {
		return medic;
	}
	
	public void getMedecin() {
		System.out.print("Nom Medecin : " + m.getNom()+"\t Prenom Medecin : " + m.getPrenom() + "\t Spécialité : " + m.getSpecialite() + "\t Adresse : "+m.getAdd());
		
	}
	public client getC() {
		return c;
	}

}
