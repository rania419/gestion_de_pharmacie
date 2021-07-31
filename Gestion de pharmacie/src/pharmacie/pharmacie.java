package pharmacie;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.text.ParseException;
import java.util.Scanner;



class pharmacie {
	static private ArrayList<client_permanant> clients=new ArrayList<client_permanant>(); 
	static private ArrayList<medicament_Extern> medicament_externe = new ArrayList<medicament_Extern> ();
	static private ArrayList<produit_paraphamaceutique> produits_parapharmaceutique = new ArrayList<produit_paraphamaceutique>();
	static private ArrayList<ordonance> ordonnance = new ArrayList <ordonance>();
	static private ArrayList<medicament_interne> medicament_intern = new ArrayList<medicament_interne>();
	static private commande commande_interne = new commande();
	static private commande commande_externe = new commande();
	static int seuil = 15;
	
	public static void main(String[] args) throws ParseException {
		
		medicament_externe.add(new medicament_Extern(1,"lounis","paracetamol","antalgique", "orale",true,50.00,"05-11-2022",15,true));
		medicament_externe.add(new medicament_Extern(2,"belarbi","aspejic","Analgique et antipyrétique", "orale",false,100.00,"05-11-2020",15,true));
		medicament_externe.add(new medicament_Extern(1,"kiared","amoxcillin","antibiothique", "orale",false,100.00,"05-11-2020",50,false));
		medicament_externe.add(new medicament_Extern(13,"lounas","dolic","aAnalgique et antipyrétique", "orale",false,50.00,"01-01-2022",20,true));
		medicament_externe.add(new medicament_Extern(20,"mechekour","smecta","anti Analgésique et antipyrétique", "orale",false,100.00,"05-11-2020",30,true));
		medicament_externe.add(new medicament_Extern(5,"lounis","betaderm","anti_inflamatoire", "voie cutanée",true,179.00,"07-09-2020",20,true));
		medicament_externe.add(new medicament_Extern(19,"belarbi","voltarene","Anti_inflammatoire", "voie cutanée",false,145.00,"01-02-2025",50,true));
		medicament_externe.add(new medicament_Extern(2,"benbara","mycotine","antifongique", "voie cutanée",false,120.00,"05-11-2020",50,true));
		
		produits_parapharmaceutique.add(new produit_paraphamaceutique(5,"lounas","bavette",40,120.0));
		produits_parapharmaceutique.add(new produit_paraphamaceutique(7,"lounas","bavette",40,140.0));
		produits_parapharmaceutique.add(new produit_paraphamaceutique(44,"kiared","coton",40,120.0));
		produits_parapharmaceutique.add(new produit_paraphamaceutique(10,"lounis","eauoxygene",35,200.0));
		produits_parapharmaceutique.add(new produit_paraphamaceutique(13,"belarbi","eosine",16,150.0));
		produits_parapharmaceutique.add(new produit_paraphamaceutique(91,"mahjoub","couches bébé",70,560.0));
		produits_parapharmaceutique.add(new produit_paraphamaceutique(1,"bochama","brosse a dent",20,150.0));
		produits_parapharmaceutique.add(new produit_paraphamaceutique(6,"mahjoub","lingette",70,80.0));
		produits_parapharmaceutique.add(new produit_paraphamaceutique(10,"lounas","lingette",70,75.0));
		
		commande_interne.getProduit().put("eczéma_lichinifié", 2);
		commande_interne.getProduit().put("psoriasis", 2);
		commande_externe.getProduit().put("aracetamol", 20);
		
		clients.add(new client_permanant("lounas", "rania", 20, false));
		clients.get(0).setMedicaments("herica");
		clients.get(0).setN_social(10);
	
		medicament_intern.add(new medicament_interne("eczéma_lichinifié","antiseptique","voie cutanée",1000.0));
		medicament_intern.get(0).setComposition_dosage("sulfat de cuivre", 0.2);
		medicament_intern.get(0).setComposition_dosage("sulfat de zinc", 0.4);
		medicament_intern.get(0).setComposition_dosage("glecyrine", 10.0);
		medicament_intern.get(0).setComposition_dosage("ichtyol",2.0);
		medicament_intern.get(0).setComposition_dosage("creme froide", 100.0);

	
		medicament_intern.add(new medicament_interne("psoriasis","apaisante", "voie cutanée",1000.0));
		medicament_intern.get(1).setComposition_dosage("vasline",25.0);
		medicament_intern.get(1).setComposition_dosage("glycerine",25.0);
		medicament_intern.get(1).setComposition_dosage("creme froide",25.0);
		
		medicament_intern.add(new medicament_interne("pelade","kératolytique", "voie cutanée",1000.0));
		medicament_intern.get(2).setComposition_dosage("acide salicylique", 1.0);
		medicament_intern.get(2).setComposition_dosage("aioxyanthranol", 1.0);
		medicament_intern.get(2).setComposition_dosage("creme froide",50.0);
		
		medicament_intern.add(new medicament_interne("acné","kératolytique antibiotique", "voie cutanée",1000.0));
		medicament_intern.get(3).setComposition_dosage("acide salicylique",1.5);
		medicament_intern.get(3).setComposition_dosage("erythromycine",2.0);
		medicament_intern.get(3).setComposition_dosage("glycérine",5.0);
		medicament_intern.get(3).setComposition_dosage("creme froide",50.0);

		medicament_intern.add(new medicament_interne("verrus","kératolytique ", "voie cutanée",1000.0));
		medicament_intern.get(4).setComposition_dosage("acide salicylique",10.0);
		medicament_intern.get(4).setComposition_dosage("acide lactique",5.0);
		medicament_intern.get(4).setComposition_dosage("creme froide",20.0);
		
		medicament_intern.add(new medicament_interne("folliculite","antiséptique ", "voie cutanée",1000.0));
		medicament_intern.get(5).setComposition_dosage("sulfate de cuivre",0.1);
		medicament_intern.get(5).setComposition_dosage("sulfate de zinc",0.2);
		medicament_intern.get(5).setComposition_dosage("eau purifiée",3.0);
		medicament_intern.get(5).setComposition_dosage("creme froide",50.0);


		medicament_intern.add(new medicament_interne("fcrevasses","cicatrisante ", "voie cutanée",1000.0));
		medicament_intern.get(6).setComposition_dosage("baume de commandeur",5.0);
		medicament_intern.get(6).setComposition_dosage("glycerine",5.0);
		medicament_intern.get(6).setComposition_dosage("creme froide",50.0);

		ordonnance.add(new ordonance("lounas","farid","generaliste","alger","lounas","rania",20,"6-6-2019"));
		ordonnance.get(0).setMedic("amoxcillin", 2, 15);
		ordonnance.get(0).setMedic("folliculite", 1, 30);
		int choix;
			do {
				choix = menu();
			      
				switch (choix) {
				case 1:
					achat();//achat
			    	break;
				case 2:
					ajoutclient_permanant();
			    	break;
				case 3:
			    	etat_stock( medicament_externe,produits_parapharmaceutique);//verifier etat de stock
			    	break;
				case 4:
			    	menu1();
			    	break;
				case 5:
					faire_commande();//passer commande
					break;
				case 6:
					afiche_client(clients);//affiche clients
					break;
				case 7:
					affiche_commande_externe();
			    	break;
				case 8:
			    	affiche_commande_interne();
			    	break;
				case 9:
			    	System.out.println("quitter");
			    	affiche_ordonnace();
			    	break;
				case 10:
			    	System.out.println("--- Au revoir! ---");//quitter	
			    	break;
				}
			}while (choix < 11);
			  
			

}
	 static int menu() {
		    int choix = 0;
		
		   System.out.println("1 : Achat medicament  ");
		   System.out.println("2 : Ajouter client");
		   System.out.println("3 : Etat du stock");
		   System.out.println("4 : Approvisionement");
		   System.out.println("5 : Passer une commande");
		   System.out.println("6 : Consulter les clients enregistrés");
		   System.out.println("7 : Consulter la liste des commandes externes");
		   System.out.println("8 : Consulter la liste des commandes internes");
		   System.out.println("9 : consulter ordonnance des client permanants");
		   System.out.println("10 : quitter");
		   do {
			   choix = scanint();
		    		if(choix<1 || choix>10) {
		    		System.out.println("Veuillez introduire un chiffre entre [1-10]\n");
		    		}
		   }while(choix<1 || choix>10);
		
		   return choix;
	 }	
	

	 
   static void achat() {
	   int choix = demand_ord();
	   switch(choix) {
	   case 1:
		  achat_avec_ord();
		  break;
	   case 2:
		  achat_sans_ord();
		  break;
	   }
   }
   //choix entre achat avec ordonnance et sans ordonnance
   static int  demand_ord() {
	   
	   int choix ;
		
	   System.out.println("1 : Achat medicament avec ordonnance  ");
	   System.out.println("2 : Achat medicament sans ordonnance");
	
	   do {
		   choix = scanint();
	    	
		   if(choix<1 || choix>2) {
	    		System.out.println("Veuillez introduire un chiffre entre 1 ou 2\n");
		   }
	   }while(choix<1 || choix>2);
	
	   return choix;
   }
   
   
   static void achat_sans_ord() {
	   int choix = menu2();
	   switch(choix) {
	   case 1:
		   achat_medecin();
		   break;
	   case 2:
		   achat_medicament();
		   break;
	   case 3:
		   achat_parapharmaceutique();
		   break;

	   }
		 
		}
   
   //choix entre achat d'un medecin conventioné et achat medicament ou achat d'un produit parapharmaceutique
   static int menu2() {
	   int choix = 0;
	   
	   System.out.println("1 : Achat de medecin conventioné ");
	   System.out.println("2 : Achat medicament  ");
	   System.out.println("3 : Achat produit paraphramaceutique");

	  do {
		  
		  choix = scanint();
	   	
		  if(choix<1 || choix>3) {
	   		System.out.println("Veuillez introduire un chiffre entre [1-3]\n");
		  }
	  }while(choix<1 || choix>3);

	   return choix;
   }

   //choix entre approvisionement d'un medicament ou d'un produit parapharmaceutique
   static void menu1() {
	   int choix = approvisionement();
	   switch(choix) {
	   case 1:
		   approvisionnement_medicament(medicament_externe);
		   break;
	   case 2:
		   approvisionement_produit_parapharmaceutique(produits_parapharmaceutique);
		   break;
	   }
   }
	
  
   static int approvisionement() {
	   
	   int choix = 0;
		
	   System.out.println("1 : medicaments  ");
	   System.out.println("2 : produits parapharmaceutiques");
	 
	   
	   do {
		   choix = scanint();
	    		if(choix<1 || choix>2) {
	    		System.out.println("Veuillez introduire un chiffre entre [1-2]\n");
	    		}
	   }while(choix<1 || choix>2);
	
	   return choix;
	   
   }
   
   static void achat_parapharmaceutique() {
	   
	   int i=1;
	   double prixtot=0;
	   HashMap<String, Integer> list = new HashMap<String ,Integer>();
	   produit_paraphamaceutique m;
	   System.out.println("veuillez saisire le produit et ca quantité, tapper sur q pour aretez");
	   System.out.print("produit  "+i);
	   String p = scanstring();
	   
	   while (!p.equals("q")) {
		   System.out.print("quantité  ");
		   int qtt = scanint();
		   list.put(p, qtt);
		   i++;
		   System.out.print("produit  "+i);
		   p = scanstring();	
	}
	   
	   for (String j : list.keySet()) {
		      
		   m = lire_parapharmaceutique(produits_parapharmaceutique,j);
		
		   if(m!=null) {//produit existe
			   if(list.get(j)<m.getQtt()){
			   if(m.getQtt()>seuil) {
					  
				   prixtot = prixtot + m.calculprix(list.get(j));
				   m.diminuerStock(list.get(j));	
				   remove_parapharmaceutique(j, produits_parapharmaceutique);
			   }
			   else {//si le stock <= seuil
				   
				   prixtot = prixtot + m.calculprix(list.get(j));
				   m.diminuerStock(list.get(j));
				   
				   System.out.println("Le medicament "+m.getNom()+"  atteint son seuil, Voulez vous effectué une commande maintenant? [o/n]");
				   String s = scanstring();
				   if (s.equals("o")) {
					   faire_commande();
				   }else {
					   System.out.println("veuillez effectuer la commande ultérieurement  ");
					   }
				   remove_parapharmaceutique(j, produits_parapharmaceutique);

			   }}else {
				      produit_paraphamaceutique l = null ;
					  int qt = list.get(j)-m.getQtt();//4-3 = 1
					  int stock = m.getQtt();
					  
					  m.diminuerStock(list.get(j)-qt);
					  
					  l = lire_parapharmaceutique(produits_parapharmaceutique, j);//verifier si le produit demandé est un produit parapharmaceutique
					
					  if(l == null) {//si produit n'est pas trouvé dans l'autre lot
							   
						  System.out.println("il existe que  "+stock+"  boites  de  "+i+" Voulez vous les prendre ?[o/n]");
						  String a = scanstring();
						  if(a.equals("o")) {
								  
							  prixtot = prixtot+ m.calculprix(stock);
							  remove_parapharmaceutique(j, produits_parapharmaceutique);
						  }
						  else {
							  m.augmenterStock(list.get(j)-qt);
						  }
					  }//si produit trouvé dans l'autre lot
					  else {
						  l.diminuerStock(qt);
						  prixtot = prixtot +l.calculprix(qt) + m.calculprix(stock);
						  remove_parapharmaceutique(j, produits_parapharmaceutique);
					  }
			   }
			    
			   
		   }else System.out.println(j+" N'existe pas !");
	   }
	   System.out.println("Le prix totale est "+prixtot);
		 
	
}
	
   static void achat_medicament() {
		 int i=1;
		   double prixtot=0;
		   HashMap<String, Integer> list = new HashMap<String ,Integer>();
		   medicament_Extern m;
		   System.out.println("veuillez saisire le produit et ca quantité [ tapper sur q pour aretez]");
		   
		   System.out.print("produit  "+i);
		   String p = scanstring();
		   while (!p.equals("q")) {
			   System.out.print("quantité  ");
			   int qtt = scanint();
			   list.put(p, qtt);
			   i++;
			   System.out.print("produit  "+i);
			   p = scanstring();	
		}
		   
		   for (String j : list.keySet()) {
			      
			   m = lireMedicament_externe(medicament_externe,j);
			   
		       if(m!=null) {//produit existe
				   
				if (m.isExige_ord()==false) {
					
				Date actuelle = new Date();
				float dif=actuelle.getTime() - m.getDate_exp().getTime();
				float difj=dif/ (1000 * 3600 * 24);
				
				  if((list.get(j)<m.getStock())&&(difj<0)) {
					  
				   if(m.getStock()>seuil) {
					   prixtot = prixtot + m.calculprix(list.get(j));
					   m.diminuerStock(list.get(j));
					  
					    
				   }else {//vendre +faire commande
					   prixtot = prixtot + m.calculprix(list.get(j));
					   m.diminuerStock(list.get(j));
					   System.out.println("Le medicament "+m.getNom()+"  atteint son seuil, Voulez vous effectué une commande maintenant? [o/n]");
					   String s = scanstring();
						if (s.equals("o")) {
							
							faire_commande();
						}
						else { System.out.println("veuillez effectuer la commande ultérieurement  ");}
				   }
 
				 }else {
					 if(list.get(j)>=m.getStock()) { //commande
						int index=0;
						boolean existe = false;
						  medicament_Extern l = null ;
						  int qt = list.get(j)-m.getStock();//4-3 = 1
						  int  stock = m.getStock();
						  
						  m.diminuerStock(list.get(j)-qt);
						  
						  for(int j3=i+1;((j3<medicament_externe.size()) && (existe=false));j3++) {
							   if(medicament_externe.get(j3).getNom().equals(j)) {
								   l = medicament_externe.get(j3);
								   existe= true;
								   index = j3;
							   }
						   }
						  if(existe==false) {//si produit n'est pas trouvé dans l'autre lot
								   
							  System.out.println("il existe que  "+stock+"  boites  de  "+i+" Voulez vous les prendre ?[o/n]");
							  String a = scanstring();
							  if(a.equals("o")) {
									  
								  prixtot = prixtot+ m.calculprix(stock);
								  remove_medicament(index, medicament_externe);
							  }
							  else {
								  m.augmenterStock(list.get(j)-qt);
							  }
						  }//si produit trouvé dans l'autre lot
						  else {
							  l.diminuerStock(qt);
							  prixtot = prixtot +l.calculprix(qt) + m.calculprix(stock);
							  remove_medicament(index, medicament_externe);
						  }
						  
						  
					  }else {
						  System.out.println(j+" est expiré vous ne pouver pas le vendre");
					  }
				 }
				  }
					 
				 
				 else
					 {
					
					 System.out.println(m.getNom()+" Exige l'ordonnance! vous ne pouvez pas vendre ce medicament");
					 }
				 
				   
			   }else System.out.println(j+" N'existe pas !");
		   }
		   System.out.println("Le prix totale est "+prixtot);
	}  
	
   
   static produit_paraphamaceutique lire_parapharmaceutique(ArrayList<produit_paraphamaceutique> medicaments,String o) {   
	 
	    boolean trouve = false;
	    produit_paraphamaceutique m = null;
	    
	    for (int i = 0; (!trouve && i < medicaments.size()); i++) {
	    	if (((medicaments.get(i).getNom()).equals(o)) && (medicaments.get(i).getQtt()!=0)) {
	    		trouve = true;
			    m = medicaments.get(i);
	    	}
	    }
	    return m;
   }
   
   static void achat_avec_ord() {
	
	  String produit;
	  ordonance list_medic_lambda = new ordonance(null, null, null, null, null, null, 0, "00-00-0000");//initialiser les medicaments saisie pour clients lambda a null
	  int j = 0,quantite;
	  
	  
	  client_permanant c = verifie_permanant( clients);//verifier si le client est permanant
	  
	  if (c != null) {//si le client est permanant
		  meth2(c);
		  
	  }else {	//le client n'est pas permanant
		
		j=0;
		int dure=0;
		System.out.println("veullez saisir tout les medicament du client [tapper sur q pour arreter]");
		System.out.println("medicament "+j);
		produit = scanstring();
		while (!produit.equals("q")) {
			
			System.out.println("quantité ");
			quantite = scanint();
			
			System.out.println("dure ");
			dure = scanint();
			
			list_medic_lambda.setMedic(produit, quantite, dure);
			
			j++;
			System.out.println("medicament "+j);
			produit = scanstring();	
		}
		
		
			 meth1(list_medic_lambda);
		
		
	}
	  
	  
	  
	
	 }
 
   //verifier si le client est permanant
	static client_permanant verifie_permanant( ArrayList<client_permanant> clients) {	
		
		boolean trouvé=false;
		client_permanant c=null;
		String n,p;
		System.out.println("veuillez qaisir le nom et prenom du client \n");
		System.out.print("-Nom  ");
		n = scanstring();
		System.out.print("-Prenom  ");
		p = scanstring();
		
		for(int i=0 ; (i<clients.size()&& trouvé==false) ; i++) {
			if ((clients.get(i).getNom().equals(n)) && (clients.get(i).getPrenom().equals(p))) {
				trouvé = true;
				c=clients.get(i);
			}
		}
		return c;
	}
	
   //lire medicament interne
   static medicament_interne lireMedicament_interne(ArrayList<medicament_interne> medicaments,String o) {   
	    boolean trouve = false;
	    medicament_interne m = null;
	  
	   
	    for (int i = 0; (!trouve && i < medicaments.size()); i++) {
	     if ((medicaments.get(i).getNom()).equals(o)) {//si le medicament demandé appartient au liste des medicaments internes
	      trouve = true;
	      m = medicaments.get(i);}}
	    
	
	    return m;
	  }
   
  
   //lire medicament externe
   static medicament_Extern lireMedicament_externe(ArrayList<medicament_Extern> medicaments,String o) {  
	   
	   boolean trouve = false;
	   medicament_Extern m = null;
	    
	    	for (int i = 0; (!trouve && i < medicaments.size()); i++) {
	    		if (((medicaments.get(i).getNom()).equals(o)) && (medicaments.get(i).getStock()!=0)) {//pour s'assurer que les lots trouvés ne sont pas vides
	    			trouve = true;
	    			m = medicaments.get(i);
	    		}
	    	}
	    	return m;
   }
   
   //supprimer le lot qui a le stock=0
   static void remove_medicament(int i,ArrayList<medicament_Extern> medicament) {
	   if(medicament.get(i).getStock()==0) {
		   medicament.remove(i);
	   }
   }
   
   
   static void remove_parapharmaceutique(String s,ArrayList<produit_paraphamaceutique> produit) {
	  boolean b = false;
	   for(int i=0;i<produit.size();i++) {
		   if((produit.get(i).getNom().equals(s))&&(produit.get(i).getQtt()==0)&&(b==false)) {
			   produit.remove(i); 
			   b = true;
		   }   
	   }
   }
		  
   
   static ordonance saisi_info() {//enregistrer les information de ordonnance
	   
	   String nomed,prenmed,spec,add = null,date,nomc,prenc,var=" ";
	   int age,j=1,qtt,dure;
	   
	   System.out.print("nom medecin :  \n");
	    nomed=scanstring();
	    
	    System.out.print("prenom medecin :  \n");
	    prenmed=scanstring();
		
	    System.out.print("Specialité du medecin :  \n");
	    spec=scanstring();
	    
	    System.out.print("address du medecin :  \n");
	    add=scanstring();
	    
	    System.out.print("nom client :  \n");
	    nomc=scanstring();
	    
	    System.out.print("prenom client :  \n");
	    prenc=scanstring();
	    
	    System.out.print("age client :  \n");
	    age = scanint();
	    
	    System.out.print("Date de consultation:  \n");
	    date = scanstring();
	    
	    ordonance o = new ordonance(nomed, prenmed, spec, add, nomc, prenc, age,date);
	    System.out.println("Veuillez saisir tous les medicaments dans l'ordonnance taper sur q pour terminer\n");

	    System.out.println("nom medicament \n"+j);
		var = scanstring();
	    while(!var.equals("q")){
					
					System.out.println("quantité  \n");
					qtt = scanint();
					System.out.println("duré  \n");
					dure = scanint();
					o.setMedic(var, qtt, dure);
					j++;
					System.out.println("nom medicament \n"+j);
					var = scanstring();
					//var = scanstring();
				
			
		}
	     if(var.equals("q")) {
	    	 System.out.println("--  L'ajout est terminer  --\n");
	     }
	   ordonnance.add(o);
	 return o;
	 
   }
   //scanner de type string 
   

   static void affiche_ordonnace() {
	   int j=1;
	   for(int i=0;i<ordonnance.size();i++) {
		   System.out.println("ordonnance "+j);
		   ordonnance.get(i).afficheClient();
		   System.out.println();
		   ordonnance.get(i).getMedecin();
		   System.out.println();
		   System.out.print("medicaments: ");
		   for(int j1=0;j1<ordonnance.get(i).getMedicaments().size();j1++) {
			   System.out.print(ordonnance.get(i).getMedicaments().get(j1).getNom()+" .");
		   }
		   j++;
	   }
	   System.out.println();
   }
   
   static String scanstring() {
	   Scanner s = new Scanner (System.in);
	   String n = s.nextLine();
	   return n;
   }
   
   //scanner de type int
   static int scanint() {
	   Scanner s = new Scanner (System.in);
	   int i = s.nextInt();
	   return i;
   }
   
   
   //scanner de type double
   static double scandouble() {
	   Scanner s = new Scanner (System.in);
	   double i = s.nextDouble();
	   return i;
   }
   
  
  
	// affichage etat du stock 
	static void etat_stock(ArrayList <medicament_Extern> medicaments,ArrayList <produit_paraphamaceutique> produit) {
		
		System.out.println("--  Affichage  Etat du stock --\n");
	
		System.out.println("num_lot\t nom_fourn\t produit\t prix\t quantité");
		for(int i=0;i<medicaments.size();i++) {
			System.out.println("  "+medicaments.get(i).getNumlot()+" \t "+medicaments.get(i).getNom_fourn()+" \t "+medicaments.get(i).getNom()+"  \t "+medicaments.get(i).getPrix()+" \t "+medicaments.get(i).getStock());
		}
		for(int i=0;i<produit.size();i++) {
			System.out.println("  "+produit.get(i).getNum_lot()+" \t "+produit.get(i).getNom_forunisseur()+" \t "+produit.get(i).getNom()+" \t "+produit.get(i).getPrix()+" \t "+produit.get(i).getQtt());
		}
		System.out.println();
		
	}
	
	
	//afichage les clients permanants
	static void afiche_client(ArrayList<client_permanant> clients) {
		
		System.out.println("Nom\tPrenom\tAge\tNum_sec\tmaladie_cronic\tmedicaments   ");
		for(int i=0;i<clients.size();i++) {
			
			System.out.println(clients.get(i).getNom()+"\t"+clients.get(i).getPrenom()+"\t"+clients.get(i).getAge()+"\t"+clients.get(i).getN_social()+"\t"+clients.get(i).getCronique()+"\t\t"+clients.get(i).getMedicaments());
		}
		System.out.println();
	}
	
	
	//creation du nv client permanant
	static client_permanant ajoutclient_permanant(){	
	   
		String nom="",prenom="",medic="",var1,var2;
		
		int age,num_sec=0,j=1;
		boolean chronic;

		
		System.out.println("-- veuillez saisir les information du client --\n");
		
		
		//nom
		System.out.println("- Nom : ");
		nom = scanstring();
		
		
		//prenom
		System.out.println("- Prenom : ");
		prenom = scanstring();
		
		
		//age
		System.out.println("- Age : ");
		age = scanint();
		
		
		
		System.out.println("- Le client souffre-t-il d’une maladie chronique? veuillez rependre par  o/n \n  ");
		var2 = scanstring();
		
		if (var2.equals("o")) {
			System.out.println("yes \n");
			chronic = true;
		}
		else {
			chronic = false;
			}
		
		client_permanant client = new client_permanant(nom, prenom, age, chronic);
		
		
		
		//numero sociale
		System.out.println("- Le client a-t-il une carte de sécurité sociale? veuillez rependre par  o/n \n ");
		var1=scanstring();
		
		if (var1.equals("o")) {
			
			System.out.println("- Veuillez saisir le numero de securité social : ");
			num_sec = scanint();
			client.setN_social(num_sec);
	
		}
		
		
		System.out.println("- Veuillez introduire tous les medicament [taper sur q pour terminer ] ");
		 
		System.out.println("medicament \n"+j);
		medic = scanstring();
	
		while(!medic.equals("q")){
			
				client.setMedicaments(medic);
				j++;
				System.out.println("medicament \n"+j);
				medic = scanstring();
		}
	  
		clients.add(client);
		
	    System.out.println("Le client a bien été ajouté.");
	    
	    return client;
	
	}
	
	
	static void faire_commande() {
		
		String nom ="";
		int qtt = 0;
		boolean ajout = false;
		
		
		System.out.println("Donner le nom de medicament a commandé");
		nom = scanstring();
		
		System.out.println("Donner la quantité de medicament a commandé");
		qtt = scanint();
		
		
		for(int i=0;(i<medicament_intern.size() && ajout==false);i++) {//verifier si le nom de medicament est un medicament interne 
			if(medicament_intern.get(i).getNom().equals(nom)) {
				commande_interne.setProduit(nom, qtt);
				ajout = true;
			}
		}
		if(ajout==false) {//sinon ajouter a la liste des commandes externes
		commande_externe.setProduit(nom, qtt);
		}
		System.out.println("-- commande ajouté --\n");
		
	}
	
	static void approvisionnement_medicament(ArrayList<medicament_Extern> medicaments) {
		 
		 boolean trouvé= false,ord,remboursable;
		 String nom="",nom_f,type,mode,dat_exp,var;
		 int lot,qtt = 0;
		 double prix;
			
		System.out.print("Numero de lot  ");
		lot = scanint();
		
		System.out.print("Nom fournisseur :   ");
		nom_f = scanstring();
			
		System.out.print("Nom medicament :  ");
		nom = scanstring();
		
		System.out.print("Type  medicament : [parapharmaceutique/anitseptique/antalgique....] ");
		type = scanstring();
		
		System.out.print("Mode de prise :  ");
		mode = scanstring();
			
		System.out.print("Quantité :  ");
		qtt = scanint();
		
		System.out.print("prix :   ");
		prix = scandouble();
		
		System.out.print("Le medicament exige il l'ordonnance? [o/n] ");
		var = scanstring();
		if(var.equals("o")) {
			ord = true;
		}else ord= false;
		
		System.out.println("Le medicament est il remboursable? [o/n] ");
		var = scanstring();
		if(var.equals("o")) {
			remboursable = true;
		}else remboursable = false;
		
		System.out.println("Date expiration [jj-mm-aaaa] ");
		dat_exp = scanstring();
		
		
		      
		for (int i=0 ;(i<medicaments.size() && !trouvé);i++) {
			if(medicaments.get(i).getNom().equalsIgnoreCase(nom)) {
				if(medicaments.get(i).getNumlot() == lot && (prix == medicaments.get(i).getPrix()) ) {
					medicaments.get(i).augmenterStock(qtt);
					trouvé = true;
				}
			}
			commande_externe.removeProduit(nom);//supprimer le medicament demandé de la liste des commandes externes
		}
		
		if (trouvé == false) {//si pas de medicament qui a le meme numero de lot on ajout un nouveau lot
			medicaments.add(new medicament_Extern(lot,nom_f,nom, type, mode,ord,prix, dat_exp, qtt,remboursable));
			}
	}

	static void approvisionement_produit_parapharmaceutique(ArrayList<produit_paraphamaceutique> produit) {
		
		boolean trouvé = false;
		String nom_f,nom;
		int qtt,num_lot;
		double prix;
		
		System.out.print("Numero de lot  ");
		num_lot = scanint();
		
		System.out.print("Nom fournisseur :   ");
		nom_f = scanstring();
			
		System.out.print("Nom produit :  ");
		nom = scanstring();
		
		System.out.print("Quantité :  ");
		qtt = scanint();
		
		System.out.print("prix :   ");
		prix = scandouble();

		
		for (int i=0 ;(i<produit.size() && !trouvé);i++) {
			if(produit.get(i).getNom().equalsIgnoreCase(nom)) {
				if((produit.get(i).getNum_lot() == num_lot)&&(produit.get(i).getPrix()==prix) ) {
					produit.get(i).augmenterStock(qtt);
					trouvé = true;
				}
				commande_externe.removeProduit(nom);//supprimer le medicament dans la liste des commandes externe
			}
		}
		
		if (trouvé == false) {
			produit.add(new produit_paraphamaceutique(num_lot,nom_f,nom,qtt,prix ));
			}
	}

	//client lambda
	 static void meth1(ordonance c) {
		 
		   double prixtot_extern=0,prixtot_interne = 0,prixtot_externe_remboursabla=0;
		   medicament_Extern m = null;
		   medicament_interne x = null;
		   commande intern = new commande();
		   commande extern = new commande();
		   new HashMap<String ,Integer>();
		   boolean k = false;
		   
		   for (int j1 =0;j1<c.getMedicaments().size();j1++) {
			   
			   m = lireMedicament_externe(medicament_externe,c.getMedicaments().get(j1).getNom());//verifier dans stock externe
				   
			   if (m!=null) {//si on a trouvé le medicament
				   
				   Date actuelle = new Date();
				   float dif=actuelle.getTime() - m.getDate_exp().getTime();
				   float difj=dif/ (1000 * 3600 * 24);
			
				   if(c.getMedicaments().get(j1).getQuantite()< m.getStock() && (difj <c.getMedicaments().get(j1).getDure())) {//verifier si on peut vendre ce medicament
					   if(m.getStock()>seuil) {
						   
						   if(m.est_remboursable==true) {
								  prixtot_externe_remboursabla = prixtot_externe_remboursabla + m.calculprix(c.getMedicaments().get(j1).getQuantite());
							  }else {
								  prixtot_extern = prixtot_extern +m.calculprix(c.getMedicaments().get(j1).getQuantite());
							  }
						   
						   m.diminuerStock(c.getMedicaments().get(j1).getQuantite());
						   remove_medicament(j1, medicament_externe);		
					   }
					   else {//si le stock <= seuil
						   
						   
						   
						   if(m.est_remboursable==true) {
								  prixtot_externe_remboursabla = prixtot_externe_remboursabla + m.calculprix(c.getMedicaments().get(j1).getQuantite());
							  }else {
								  prixtot_extern = prixtot_extern +m.calculprix(c.getMedicaments().get(j1).getQuantite());
							  }
						   
						   m.diminuerStock(c.getMedicaments().get(j1).getQuantite());
						   remove_medicament(j1, medicament_externe);
						   
						   System.out.println("Le medicament "+m.getNom()+"  atteint son seuil, Voulez vous effectué une commande maintenant? [o/n]");
						   String s = scanstring();
						   if (s.equals("o")) {
							   faire_commande();
						   }else {
							   System.out.println("veuillez effectuer la commande ultérieurement  ");
							   }
					   }		   
				   }else {
				   if(c.getMedicaments().get(j1).getQuantite()>=m.getStock()) { //commande
						  
						  medicament_Extern l = null ;
						  
						  int qt = c.getMedicaments().get(j1).getQuantite()-m.getStock();//4-3 = 1
						  int stock = m.getStock(),index =0;
						  boolean existe = false;
						 
						  
						   m.diminuerStock(c.getMedicaments().get(j1).getQuantite()-qt);
						  
							   medicament_externe.remove(m);
							   
							   for(int j3=j1+1;((j3<medicament_externe.size()) && (existe=false));j3++) {
								   if(medicament_externe.get(j3).getNom().equals(c.getMedicaments().get(j3).getNom())) {
									   l = medicament_externe.get(j3);
									   existe= true;
									   index = j3;
								   }
							   }
							   
								if(existe == false) {
								 System.out.println("il existe que  "+stock+"  boites  de  "+m.getNom()+" Voulez vous les prendre ?[o/n]");
								 String a = scanstring();
									 if(a.equals("o")) {
										 if(m.est_remboursable==true) {
												  prixtot_externe_remboursabla = prixtot_externe_remboursabla + m.calculprix(stock);
											  }else prixtot_extern = prixtot_extern + m.calculprix(stock);
										   remove_medicament(j1, medicament_externe);
									   }
									   else {
										   m.augmenterStock(c.getMedicaments().get(j1).getQuantite()-qt);
									   }
								   }else {
								   l.diminuerStock(qt);
								   //le prix qui existe dans ancien lot
								   prixtot_extern = prixtot_extern + l.calculprix(qt) + m.calculprix(stock);
								   remove_medicament(j1, medicament_externe);
							   }   
					  		}else {
					  			if(difj >= 0) System.out.println("Vous ne pouvez pas vendre ce medicament il est perimé");
					  }
				   }
				   }
			   else {	//si pas de medicament en externe on chercher dans interne
				
				   x=lireMedicament_interne(medicament_intern,c.getMedicaments().get(j1).getNom());
			
				   if(x!=null) {//si le medicament demander est un medicament interne
					
					   prixtot_interne = prixtot_interne +x.calculprix(c.getMedicaments().get(j1).getQuantite());
				
					   intern.setProduit(c.getMedicaments().get(j1).getNom(), c.getMedicaments().get(j1).getQuantite());
					   System.out.println(x.getNom()+" est ajouter a la liste des commandes internes");
				   }
				
				   else {
						  //existe pas
						  System.out.println("--  Le medicament "+c.getMedicaments().get(j1).getNom()+" N'existe pas dans la pharmacie !--\n ");
						  extern.setProduit(c.getMedicaments().get(j1).getNom(),c.getMedicaments().get(j1).getQuantite());
						  k = true;
				   }
			   }
		   }
			
		   
		if(k==true ) {//list des medic externe qui nexiste pas
			
			System.out.println("Le client veut il effectuer un achat partiel? [o/n]");
			String var = scanstring();
			
			if(var.equals("o")) {
				
				System.out.println("le client a il un numero de securtie social? [O/n]");//effectuer le remboursement si le client a le numerp sociale
				String b = scanstring();
			
				if(b.equals("o")) {
				if(m!=null) {
				prixtot_externe_remboursabla = m.calculRembourse(prixtot_externe_remboursabla);
				}
				if(x!=null) {
					prixtot_interne=x.calculRembourse(prixtot_interne);}
				}
				 
			}else {
				
				System.out.println("Le client veut il etre permanant?");
				var = scanstring();
				
				if(var.equals("o")) {
					client_permanant client = ajoutclient_permanant();
					System.out.println("Le client veut il commander les medicaments inexistant o/n");
					var = scanstring();
					
					if(var.equals("o")) {
						for (String j1 : extern.getProduit().keySet()) {
							commande_externe.setProduit(j1,  extern.getProduit().get(j1));
						}
						
						System.out.println("commande ajouter\n");
						
					}else System.out.println("au revoir!");
					
					
					if(client.getN_social()!=0) {
					if(m!=null) {
					prixtot_externe_remboursabla = m.calculRembourse(prixtot_externe_remboursabla);}
					if(x!=null) {
					prixtot_interne=x.calculRembourse(prixtot_interne);}
				}
				}
				
			}	
		}else {
			
		
			System.out.println("le client a il un numero de securtie social? [O/n]");//effectuer le remboursement si le client a le numerp sociale
			String b = scanstring();
			if(b.equals("o")) {
			if(m!=null) {
			prixtot_externe_remboursabla = m.calculRembourse(prixtot_externe_remboursabla);
			}
			if(x!=null) {
			prixtot_interne=x.calculRembourse(prixtot_interne);}
		}
			}
		
		
			
			double prixtot =prixtot_extern+ prixtot_externe_remboursabla+prixtot_interne;
			System.out.println("Le prix totale est "+ prixtot);
		
	 }
	 
	 //client permanant
	 static void meth2(client_permanant c) {
		 
		  medicament_Extern m = null ;
		  medicament_interne x = null;
		  int j = 0;
		  double prixtot_extern=0,prixtot_interne=0,prixtot_externe_remboursabla = 0;
		  boolean var1=false;
		  
		  commande extern = new commande();//medicaments inexistantes
		 
		  ordonance o = saisi_info();//saisir tous les information au l'ordonnance pour les enregistrer

		  for (int i= 0;i<o.medic.size();i++) {//parcourir l'ordonnance
			   
			  m = lireMedicament_externe(medicament_externe,o.medic.get(i).getNom());//verifier si le medicament existe en stock des medicaments externes
			 
			  if (m!=null) {//si medicament en stock existe
				   
				  Date actuelle = new Date();
				  float dif=actuelle.getTime() - m.getDate_exp().getTime();
				  float difj=dif/ (1000 * 3600 * 24);//calculer la difference de jour entre la date actuelle (date que le medicament est vendue )avec la date d'expiration de medicament
				
		
				  if((o.getMedicaments().get(i).getQuantite() < m.getStock()) && (difj < o.getMedicaments().get(i).getDure())) {//verifier si on peut vendre ce medicament et assurer que le medicament ne ce perime pas durant le traitement
					
					  if(m.getStock()>seuil) {
						  
						  if(m.est_remboursable==true) {
							  prixtot_externe_remboursabla = prixtot_externe_remboursabla + m.calculprix(o.getMedicaments().get(i).getQuantite());
						  }else {
							  prixtot_extern = prixtot_extern +m.calculprix(o.getMedicaments().get(i).getQuantite());
						  }
						 
						  m.diminuerStock(o.getMedicaments().get(i).getQuantite());//diminuer le stock
						  remove_medicament(i, medicament_externe);
					  }
					  else {//si le stock <= seuil vendre + faire commande
						  
						  if(m.est_remboursable==true) {
							  prixtot_externe_remboursabla = prixtot_externe_remboursabla + m.calculprix(o.getMedicaments().get(i).getQuantite());
						  }else {
							  prixtot_extern = prixtot_extern + m.calculprix(o.getMedicaments().get(i).getQuantite());
						  }
						  
						  m.diminuerStock(o.getMedicaments().get(i).getQuantite());
						  
						  System.out.println("Le medicament "+m.getNom()+"  atteint son seuil, Voulez vous effectué une commande maintenant? [o/n]");
						  String s = scanstring();
						  if (s.equals("o")) {
							  faire_commande();
						  }
						  else{
							  System.out.println("veuillez effectuer la commande ultérieurement  ");}
						  remove_medicament(i, medicament_externe);
					  }
				  }else {
					  if(o.getMedicaments().get(i).getQuantite()>m.getStock() ) { //commande
						
//on cherchent d'autre lots qui ont le meme medicament demandé si trouvé on diminuent le stock et ajouter son prix avec le prix totale sinon on demandent si le client veyt acheter la quantité de medicament restant
						  medicament_Extern l = null ;
						  
						  
						  int qt = o.getMedicaments().get(i).getQuantite()-m.getStock();//4-3 = 1
						  int stock = m.getStock(),index = 0;
						  boolean existe = false;
						 
						  
						   m.diminuerStock(o.getMedicaments().get(i).getQuantite()-qt);
						   
							   
							   for(int j3=i+1;((j3<medicament_externe.size()) && (existe=false));j3++) {
								   if(medicament_externe.get(j3).getNom().equals(o.getMedicaments().get(i).getNom())) {
									   l = medicament_externe.get(j3);
									   existe= true;
									   index = j3;
								   }
							   }
							   if(existe == false) {
								   
								   System.out.println("il existe que  "+stock+"  boites  de  "+m.getNom()+" Voulez vous les prendre ?[o/n]");
								   String a = scanstring();
								   if(a.equals("o")) {
									  
									   if(m.est_remboursable==true) {
											  prixtot_externe_remboursabla = prixtot_externe_remboursabla + m.calculprix(stock);
											 
										  }else prixtot_extern = prixtot_extern + m.calculprix(stock);
									   remove_medicament(i, medicament_externe);
								   }
								   else {
									   m.augmenterStock(o.getMedicaments().get(i).getQuantite()-qt);
								   }
							   }else {
								   l.diminuerStock(qt);
						
							//le prix qui existe dans ancien lot
								   
								   if(m.est_remboursable==true) {
										  prixtot_externe_remboursabla = prixtot_externe_remboursabla + m.calculprix(stock);
									  }else prixtot_extern = prixtot_extern +m.calculprix(stock);
								   
								   
								   if(l.est_remboursable==true) {
										  prixtot_externe_remboursabla = prixtot_externe_remboursabla + l.calculprix(qt);
									  }else prixtot_extern = prixtot_extern +l.calculprix(qt);
								   remove_medicament(index, medicament_externe);
							   }
							   
						   
					  }else {
						  if(difj >= o.getMedicaments().get(i).getDure()) System.out.println("Vous ne pouvez pas vendre ce medicament il est perimé");
					  }
				  }
					}
			  else {	//si pas de medicament en externe on chercher dans interne
			
				  x=lireMedicament_interne(medicament_intern,o.medic.get(i).getNom());
		
				  if(x!=null) {//si le medicament demander est un medicament interne
				
					  
						 prixtot_interne = prixtot_interne + x.calculprix(o.getMedicaments().get(i).getQuantite());
					  
					  
					  commande_interne.setProduit(o.getMedicaments().get(i).getNom(), o.getMedicaments().get(i).getQuantite());
					  System.out.println(x.getNom()+" est ajouter a la liste des commandes internes");
					  
				  }
			
				  else {	//medicamen n'existe pas
					  
					  System.out.println("--  Le medicament "+o.getMedicaments().get(i).getNom()+" N'existe pas dans la pharmacie !--\n ");
					  extern.setProduit(o.getMedicaments().get(i).getNom(), o.getMedicaments().get(i).getQuantite());
					  j++;
					  var1 = true;
				  }
			  }
			  
		  }
		
	if(c.getN_social()!=0) {//effectuer le remboursement si le client a le numerp sociale
		
		if(m!=null) {
		prixtot_externe_remboursabla = m.calculRembourse(prixtot_externe_remboursabla);}
		if(x!=null) {
		prixtot_interne=x.calculRembourse(prixtot_interne);}
	}
	
	
	if(var1 == true){//si les les medicaments dans ordonnance n'existe pas
		
		 System.out.println("Le Client veut -il effectuer une commande pour les medicament inexistants? [o/n]"); 
		 String d = scanstring();
		 if(d.equals("o")) {
			for (String j1 : extern.getProduit().keySet()) {
				commande_externe.setProduit(j1,  extern.getProduit().get(j1));
			}
			System.out.println("commande envoyé\n");
		 }
		 
	 }
	 
	 
	 
	 

	 double prixtot =prixtot_extern + prixtot_externe_remboursabla + prixtot_interne;//calcul prix total
	 System.out.println("Le prix totale est "+ prixtot+"\n");//afficher le prix totale
	 
	}
	
	 static void affiche_commande_interne() {
		 System.out.println("Produit\t\tQuantité");
		 for(String i : commande_interne.getProduit().keySet()) {
			 System.out.println(i+"\t"+commande_interne.getProduit().get(i));
		 }
	 }
	 
	
	 static void affiche_commande_externe() {
		 System.out.println("Produit\t\tQuantité");
		 for(String i : commande_externe.getProduit().keySet()) {
			 System.out.println(i+"\t"+commande_externe.getProduit().get(i));
		 }
}
	 
	 
	 static void achat_medecin() {
		 
		  medicament_Extern m = null ;
		  medicament_interne x = null;
		  produit_paraphamaceutique p =null;
		  int j = 1,qtt;
		  String produit;
		  double prixtot_extern=0,prixtot_interne=0;
		  boolean var1=false,var2=false;
		  
		  commande extern = new commande();//medicaments inexistantes
		 
		  HashMap<String , Integer> o = new HashMap<String,Integer>();
		
		  System.out.println("veullez saisir tout les medicament du client [tapper sur q pour arreter]");
		
		  System.out.println("medicament "+j);
		  produit = scanstring();
		  while (!produit.equals("q")) {
			  
			System.out.println("quantité ");
			qtt = scanint();
			
			o.put(produit, qtt);
			
			j++;
			System.out.println("medicament "+j);//produit suivant
			produit = scanstring();	
		}
		j=0;
		  for (String i : o.keySet()) {//parcourir l'ordonnance
			   
			  m = lireMedicament_externe(medicament_externe,i);//verifier si le medicament existe en stock des medicaments externes
			 
			  if (m!=null) {//si medicament en stock existe
				  if (m.isExige_ord()==false) {
				  Date actuelle = new Date();
				  float dif=actuelle.getTime() - m.getDate_exp().getTime();
				  float difj=dif/ (1000 * 3600 * 24);//calculer la difference de jour entre la date actuelle (date que le medicament est vendue )avec la date d'expiration de medicament
				
		
				  if((o.get(i) < m.getStock()) && (difj < 0)) {//verifier si on peut vendre ce medicament et assurer que le medicament ne ce perime pas durant le traitement
					
					  if(m.getStock()>seuil) {
						  
						  prixtot_extern = prixtot_extern +m.calculprix(o.get(i));
						  m.diminuerStock(o.get(i));//diminuer le stock
					  }
					  else {//si le stock <= seuil vendre + faire commande
						  
						  prixtot_extern = prixtot_extern + m.calculprix(o.get(i));
						  
						  
						  m.diminuerStock(o.get(i));
						  
						  System.out.println("Le medicament "+m.getNom()+"  atteint son seuil, Voulez vous effectué une commande maintenant? [o/n]");
						  String s = scanstring();
						  if (s.equals("o")) {
							  faire_commande();
						  }
						  else{
							  System.out.println("veuillez effectuer la commande ultérieurement  ");}
					  }
				  }else {
					  if(o.get(i)>=m.getStock() ) { //on cherche dans les autres lots qui on le meme produit
						
						  medicament_Extern l = null ;
						  int qt = o.get(i)-m.getStock();//calculer la quantité rester et verifier si elle existe dans les autres lots
						  int stock = m.getStock();
						  
						  m.diminuerStock(o.get(i)-qt);
						  
						  l = lireMedicament_externe(medicament_externe, i);
						
						  if(l == null) {
								   
							  System.out.println("il existe que  "+stock+"  boites  de  "+m.getNom()+" Voulez vous les prendre ?[o/n]");
							  String a = scanstring();
							  if(a.equals("o")) {
								  m.diminuerStock(o.get(i)-qt);  
								  prixtot_extern = prixtot_extern + m.calculprix(stock);
							  }
							  else {
								  m.augmenterStock(o.get(i)-qt);
							  }
						  }
						  else {
							  
							  l.diminuerStock(qt);
							  prixtot_extern = prixtot_extern +l.calculprix(qt) + m.calculprix(stock);
						  }
						  
						  
					  }else
					  {
						  if(difj >= 0) System.out.println("Vous ne pouvez pas vendre "+i+"  il est perimé");
					  }
				  }
			  }else {
				  System.out.println("Le medecin ne peut acheter ce medicament l'ordonnance est exigée");
			  }
				  }
			  else {//si pas de medicament en externe on chercher dans interne
			
				  x=lireMedicament_interne(medicament_intern, i);
		
				  if(x!=null) {//si le medicament demander est un medicament interne
				
					  prixtot_interne = prixtot_interne + x.calculprix(o.get(i));
					  commande_interne.setProduit( i , o.get(i));
					  System.out.println(x.getNom()+" est ajouter a la liste des commandes internes");
					  var2 = true;
				  
				  }else {
					  
					  p = lire_parapharmaceutique(produits_parapharmaceutique, i);
					  
					  if(p!=null) {
						  
						  if((o.get(i) <= p.getQtt())) {
							  
						  if(p.getQtt()>seuil) {
							  
							  prixtot_extern = prixtot_extern + p.calculprix(o.get(i));
							  p.diminuerStock(o.get(i));//diminuer le stock
						  }
						  else {//si le stock <= seuil vendre + faire commande
							  
							  prixtot_extern = prixtot_extern + p.calculprix(o.get(i));
							  
							 p.diminuerStock(o.get(i));
							  
							  System.out.println("Le medicament "+p.getNom()+"  atteint son seuil, Voulez vous effectué une commande maintenant? [o/n]");
							  String s = scanstring();
							  if (s.equals("o")) {
								  faire_commande();
							  }
							  else{
								  System.out.println("veuillez effectuer la commande ultérieurement  ");
								  }
						  }
						  
						  }else {
							  if(o.get(i)>p.getQtt() ) { //commande
									
								  produit_paraphamaceutique l = null ;
								  int qt = o.get(i)-p.getQtt();//4-3 = 1
								  int stock = p.getQtt();
								  
								  p.diminuerStock(o.get(i)-qt);
								  
								  l = lire_parapharmaceutique(produits_parapharmaceutique, i);//verifier si le produit demandé est un produit parapharmaceutique
								
								  if(l == null) {//si produit n'est pas trouvé dans l'autre lot
										   
									  System.out.println("il existe que  "+stock+"  boites  de  "+i+" Voulez vous les prendre ?[o/n]");
									  String a = scanstring();
									  if(a.equals("o")) {
											  
										  prixtot_extern = prixtot_extern + p.calculprix(stock);
									  }
									  else {
										  p.augmenterStock(o.get(i)-qt);
									  }
								  }//si produit trouvé dans l'autre lot
								  else {
									  l.diminuerStock(qt);
									  prixtot_extern = prixtot_extern +l.calculprix(qt) + p.calculprix(stock);
								  }
								  
								  
							  }
							  
						  }
						  }else {	//medicament n'existe pas
						  
						  System.out.println("--  Le medicament "+i+" N'existe pas dans la pharmacie !--\n ");
						  extern.setProduit(i, o.get(i));
						  j++;
						  var1 = true;
					  }
				  }
			
				  }}
	
		  
	if(var1 == true){//si les les medicaments demandés n'existe pas
		
		 System.out.println("Le medecin veut -il effectuer une commande pour les medicament inexistants? [o/n]"); 
		 String d = scanstring();
		 if(d.equals("o")) {
			for (String j1 : extern.getProduit().keySet()) {
				commande_externe.setProduit(j1,  extern.getProduit().get(j1));
			}
			System.out.println("commande envoyé\n");
		 }
		 
	 }
	 
	 
	 if(var2==true) {//si les medicaments en interne ont etaient demandé
		 System.out.println("-- Les medicaments interne ont bien été ajoutés a la liste des commandes --\n ");
	 }
	 

	 double prixtot =prixtot_extern + prixtot_interne;//calcul prix total
	 System.out.println("Le prix totale est "+ prixtot+"\n");//afficher le prix totale
	 }
}
