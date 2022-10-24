package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(6500);
		product1.setUnitsInStock(10);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(10);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(6500);
		product3.setUnitsInStock(10);
		product3.setImageUrl("image3.jpg");

		System.out.println("<ul>");
		Product[] products = new Product[] { product1, product2, product3 };
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05555555555");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Kadir");
		individualCustomer.setLastName("Seki");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("111111111111");
		corporateCustomer.setCustomerNumber("54321");

		Customer[] customers = new Customer[] { individualCustomer, corporateCustomer };

		for (Customer customer : customers) {
			System.out.println(customer.getId());
		}

	}
}
