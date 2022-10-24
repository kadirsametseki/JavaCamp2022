package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	//camelCase
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 4, 7, 8, 10 };
		int aranacak = 10;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
			}
		}
		
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayı mevcuttur: " + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayı mevcut değildir: " + aranacak);
		}
	}
	
	//mesajı buraya gönderdik. Bu fonksiyon String türünde bir değer döndürür.
	public static void mesajVer(String mesaj) { 
		System.out.println(mesaj);
	}

}
