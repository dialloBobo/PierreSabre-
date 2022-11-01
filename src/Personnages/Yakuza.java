package Personnages;

public class Yakuza extends Humain {
	private String clan;
	int reputation=0;

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
	
	
	public int perdre() {
		int sous=getArgent();
		perdreArgent(super.getArgent());
		
		if (reputation>0){
			reputation-=1;	
		}
		System.out.println(prendreParole()+"J’ai perdu mon duel et mes"
				+ " "+ sous + " sous, snif... J'ai déshonoré le clan de "+ clan);
		return sous;

		
	}
	public int gagner(int argent){
		int sous=argent;
		super.gagnerArgent(sous);
		reputation+=1;
		System.out.println(prendreParole()+" Ce ronin pensait vraiment battre "+ getNom()+ " du clan de "+ clan + "?\r\n"
		+ "Je l'ai dépouillé de ses " + sous  + " sous.");
		return argent;
	}

	
	
	
	}


