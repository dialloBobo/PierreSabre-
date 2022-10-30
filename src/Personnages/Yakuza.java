package Personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=1;

	public Yakuza(String nom, String boissonFav, int argent,String clan){
		super(nom, boissonFav, argent);
		this.clan=clan;
		
	}
	public String getClan(){
		return clan;
	}
	
	
	public void extorquer(Commercant victime){
		System.out.println( super.prendreParole()+"Tiens, tiens,"
				+ "ne serait-ce pas un faible marchand"+ " qui passe par là ?");
		System.out.println(prendreParole()+victime.getNom()+" si tu tiens à la vie "
				+ "donne moi ta bourse !");
	
		int argentvolé=victime.seFaireExtorquer();
		int argent=super.gagnerArgent(argentvolé);
		reputation+=1;

		System.out.println(prendreParole()+" j’ai piqué les 15 sous de Marco,"
				+ " ce qui me fait "+ argent+ " sous dans ma poche. Hi ! Hi !");
	}
	
	
	
	}


