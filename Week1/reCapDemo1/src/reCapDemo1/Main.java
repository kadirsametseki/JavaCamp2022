package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 36;
		int sayi2 = 44;
		int sayi3 = 55;
		int enBuyuk = sayi1;
		
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En büyük sayı : " + enBuyuk);
			
		
	}
}