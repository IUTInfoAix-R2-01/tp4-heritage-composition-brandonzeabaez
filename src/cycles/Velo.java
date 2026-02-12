package cycles;
import java.util.Random;
public class Velo {
	private static double DEFAUT_BRAQUET = 12.0d;
	private double	diamRoue;
	private Random genAlea;
	private double braquet;
	public static double getDefautBraquet() {
		return DEFAUT_BRAQUET;
	}
	public static void setDefautBraquet(double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET=dEFAUT_BRAQUET;
	}
	public Velo(double braquet,double diamRoue) {
		this.braquet=braquet;
		this.diamRoue=diamRoue;
		this.genAlea = new Random();
	}
	public Velo(double braquet) {
		this.braquet=braquet;
		this.diamRoue=1.0;
		this.genAlea = new Random();
	}
	public Velo() {
		this.braquet=DEFAUT_BRAQUET;
		this.diamRoue=1.0;
		this.genAlea = new Random();
	}
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random genAlea) {
		this.genAlea=genAlea;
	}
	public double getBraquet() {
		return braquet;
	}
	public void setBraquet(double braquet) {
		this.braquet=braquet;
	}
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue) {
		this.diamRoue=diamRoue;
	}
	public String toString() {
		return "velo[braquet="+braquet+",diamRoue="+diamRoue+"]";
	}
	public double getPuissance(double FrequenceCoupDePedale) {
		return FrequenceCoupDePedale*this.braquet*this.diamRoue*genAlea.nextDouble();
	}
}
