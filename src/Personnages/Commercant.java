package Personnages;

public class Commercant extends Humain{


	public Commercant(String nom, String boissonFav, int argent) {
		super(nom,"thé",argent);
	}


	public int seFaireExtorquer() {
		int eco=getArgent();

		perdreArgent(super.getArgent());
		System.out.println(super.prendreParole() + " J’ai tout perdu! Le monde est trop injuste..");
		return eco;
	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		System.out.println(super.prendreParole() + argent + " sous ! Je te remercie généreux donateur!");
	}

}
