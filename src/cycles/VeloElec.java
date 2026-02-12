package cycles;

public class VeloElec extends Velo{
	private static double DEFAUT_FACTEUR_PUISSANCE = 15d;
	private double facteurPuissanceMoteur;
	public VeloElec(double braquet,double diamRoue,double facteurPuissance) {
		super(braquet,diamRoue);
		this.facteurPuissanceMoteur=facteurPuissance;
	}
	public VeloElec(double diamRoue,double facteurPuissance) {
		super();
		super.setDiamRoue(diamRoue);
		this.facteurPuissanceMoteur=facteurPuissance;
	}
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur=DEFAUT_FACTEUR_PUISSANCE;
	}
	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE;
	}
	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double dEFAUT_FACTEUR_PUISSANCE) {
		DEFAUT_FACTEUR_PUISSANCE=dEFAUT_FACTEUR_PUISSANCE;
	}
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur=facteurPuissanceMoteur;
	}
	public String toString() {
		return "veloElec[facteurPuissanceMoteur="+facteurPuissanceMoteur+"]";
	}
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale)*facteurPuissanceMoteur;
	}
	public static void main(String[] args) {
		
		VeloElec v2 = new VeloElec();
		System.out.println(v2.getBraquet());
		System.out.println(v2.getPuissance(10.0));
		System.out.println(v2.getDiamRoue());
		System.out.println(v2);
	}
}
