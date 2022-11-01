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
		int argentdes=((super.getArgent()*10)/100);
		System.out.println(prendreParole()+ beneficiaire.getNom() + " prend ces " + argentdes+ " sous ");
		beneficiaire.recevoir(argentdes);
		argent-=argentdes;
		
		
	}

	public void provoquer(Yakuza adversaire){
		int force = 2*honneur;
		int argent=getArgent();
		if (force>= adversaire.reputation) {
			System.out.println(prendreParole()+ " Je t'ai retrouvé vermine," 
					+ "tu vas payer pour ce que tu as fait à ce pauvre\r\n" + "marchand!");
	
			System.out.println(prendreParole()+  "Je t’ai eu petit yakusa!");
			gagnerArgent(adversaire.perdre());
		}
		else {
			System.out.println(prendreParole()+" J'ai perdu contre ce yakuza,"
					+ " mon honneur et ma bourse ont en pris un coup");
			perdreArgent(adversaire.gagner(argent));
			argent=0;
				
		}
	}
	
	

}
