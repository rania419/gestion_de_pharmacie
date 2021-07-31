package pharmacie;

class client {
	protected String nom,prenom;
	protected int age;
	
	public client(String nom,String prenom,int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
		
	public int getAge() {
		return age;
	}
}
