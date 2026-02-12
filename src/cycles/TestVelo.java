package cycles;

public class TestVelo {
	public static void main(String[] args) {
		
		Velo v2 = new Velo(12.5);
		System.out.println(v2.getBraquet());
		System.out.println(v2.getPuissance(10.0));
		System.out.println(v2.getDiamRoue());
		System.out.println(v2.getGenAlea());
	}
}
