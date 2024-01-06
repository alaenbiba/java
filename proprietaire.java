package ilef;

public class proprietaire {
	private String nom, cin,identifiant;
	private locataire locataire ;
	public proprietaire(String identifiant, String cin, String nom , locataire locataire) {
		this.nom=nom;
		this.cin = cin;
		this.identifiant=identifiant;
		this.locataire=locataire;
}
	public void afficher() {
		System.out.println("le proprietaire  " + nom  + " de cin " + cin + " et de l'identifiant " + identifiant );
	}
	public String consulterlocataire() {
		System.out.println ( locataire.afficher());
	} 
	
	
}