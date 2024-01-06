package ilef;

public class locataire {
	private String nom,prenom,cin,numtel;
	public locataire( String numtel, String cin,String prenom, String nom ) {
		this.numtel=numtel;
		this.nom = nom;
		this.prenom =prenom;
	}
	public void afficher() {
		System.out.println("le client " + cin + " " + nom + " "+ prenom +"de num tel  "+ numtel + "a aouer des apartements") ;
	}
	

}
