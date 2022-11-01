package histoire;


import Personnages.Commercant;
import Personnages.Humain;
import Personnages.Ronin;
import Personnages.Yakuza;

public class HistoireTP4{
	public static void main(String[] args){
		
		Humain prof = new Humain(" Prof", " kombucha", 54);
		prof.direBonjour();
		prof.acheter(" boison", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		Commercant marco=new Commercant("Marco","the",15);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakuza yakuza = new Yakuza("Yaku Le Noir","whisky", 30 ,"Warsong");
		yakuza.direBonjour();
		yakuza.extorquer(marco);
		
		Ronin roro= new Ronin("Roro","shochu",60,1);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yakuza);
		

		
		

		
		
		

}
}
