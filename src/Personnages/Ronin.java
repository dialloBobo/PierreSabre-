package Personnages;

public class Ronin extends Humain{

	private int honneur =1;

	public Ronin(String nom, String boissonFav, int argent,int honneur) {
		super(nom, boissonFav, argent);
		this.honneur = honneur;

	}

	public int getHonneur() {
		return honneur;
	}
	
	public void donner(Commercant beneficiaire){
		int argent= ((super.getArgent()*10)/100);
		System.out.println(prendreParole()+" Marco prend ces "+ argent+ "sous");
		beneficiaire.recevoir(argent);
		
	}


	

}
