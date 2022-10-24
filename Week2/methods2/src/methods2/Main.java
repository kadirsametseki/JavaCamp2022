package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj1 = mesaj.substring(0,2);
		System.out.println(yeniMesaj1);

		String yeniMesaj2 = sehirVer();
		System.out.println(yeniMesaj2);
		int sayi = topla(3,4);  //fonksiyonu çağırıp 3 ve 4 gönderdik.
		System.out.println(sayi);
		
		int sonuc = topla2(1,2,4,5,6,7,9);
		System.out.println(sonuc);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	//sayıyı buraya gönderdik. Bu fonksiyon integer türünde bir değer döndürür.
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam + sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
