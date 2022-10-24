package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'l';

		switch (harf) {
		case 'a':
		case 'ı':
		case 'u':
		case 'o':
			System.out.println("Kalın sesli harf");
			break;
		case 'e':
		case 'i':
		case 'ü':
		case 'ö':
			System.out.println("İnce sesli harf");
			break;
		default:
			System.out.println("Sessiz harf");
		}
	}
}