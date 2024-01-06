package ilef;

public class logement {
	private String adresse, type,nom;
	private int tarif ;
	public logement(int tarif, String adresse, String type, String nom) {
		this.adresse=adresse;
		this.tarif = tarif;
		this.type = type;
		this.nom =nom;
	}
	public void afficher() {
		System.out.println("le logement " + nom + " d'adresse  " + adresse + " de type " + type + " de prix " + tarif);
	}

}
