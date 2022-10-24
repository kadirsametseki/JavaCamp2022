package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortislem = new DortIslem();

		int sonucToplama = dortislem.Topla(2, 3);
		System.out.println(sonucToplama);

		int sonucCikarma = dortislem.Cikar(14, 15);
		System.out.println(sonucCikarma);

		int sonucCarpma = dortislem.Carp(6, 10);
		System.out.println(sonucCarpma);

		int sonucBolme = dortislem.Bol(4, 1);
		System.out.println(sonucBolme);

	}

}
