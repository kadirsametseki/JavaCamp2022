package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus", 6500, 3, "Siyah");
		/*Product product = new Product();
		product.setId(1);
		product.setName("Laptop"); 
		product.setDescription("Asus");
		product.setPrice(6500);
		product.setStockAmount(3);
		product.setColor("Siyah");*/
		
		System.out.println(product.getColor());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
	}

}
