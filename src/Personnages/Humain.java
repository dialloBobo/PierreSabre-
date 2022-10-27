package Personnages;

public class Humain{
	private String nom;
	private String boissonFav;
	private int argent;
	
	



	public Humain(String nom, String boissonFav, int argent) {
		super();
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}



	public String getNom(){
		return nom;
	}



	public String getBoissonFav() {
		return boissonFav;
	}

	public int getArgent() {
		return argent;
	}
	
	
	
	public void gagnerArgent(int gain){
		gain+=gain;
	}
	

	public void perdreArgent(int perte){
		perte-=1;
	
}
	public void direBonjour(){
		System.out.println("Bonjour! je m'appelle " + nom +"  et j'aime boire du" + boissonFav );
	}
	public void Boire(){
		System.out.println("Mmmm, un bon verre de "+ boissonFav + "!GLOUPS!");	
	}

	public void acheter(String bien, int prix){
		if(prix < argent) {
			System.out.println(prendreParole() +"j'ai " + argent +  
					" sous en poche.Je vais pouvoir m'offrir un " + bien + " à " + prix +" sous ");
		
			argent=argent-prix;
		}
		else{
			System.out.println(prendreParole() + "Je n'ai plus que" + argent +
					" sous en poche. Je ne peux même pas m'offrir un " + bien + " à " +" sous " );
		}
	}


	private String prendreParole() {
		return "(" + nom + ")- ";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + " << " + texte + " >> ");
	}

}