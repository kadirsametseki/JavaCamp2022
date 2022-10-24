package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Çok iyi");
			break;
		case 'B':
		case 'C':
			System.out.println("İyi");
			break;
		case 'D':
			System.out.println("Orta");
			break;
		case 'F':
			System.out.println("Kötü");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");

		}
	}
}
