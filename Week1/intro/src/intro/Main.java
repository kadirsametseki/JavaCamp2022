package intro;

public class Main {
//Main Kodun başladığı metottur.
	public static void main(String[] args) {
		System.out.println("Hello world!");

		// Değişken isimlendirmeleri camelCase yazılır.
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";

		System.out.println(ortaMetin);

		int vade = 12;

		double dolarDun = 18.25;
		double dolarBugun = 18.30;

		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) { // false
			okYonu = "down.svg";
			System.out.println(okYonu);

		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}

		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		String[] krediler = new String[] { "Hızlı kredi", "Maaşını halkbanktan alanlar", "Mutlu emekli" };

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		boolean sistemeGirisYapmisMi = false;
		if (sistemeGirisYapmisMi) {
			System.out.println("Kullanıcı ayarları butonu");
		} else {
			System.out.println("Giriş yap butonu");
		}

	}

}
