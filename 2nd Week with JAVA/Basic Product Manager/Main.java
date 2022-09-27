package classesWithAttiributes;

public class Main {

	public static void main (String[] args) {
		
		Product product = new Product();
		product.setName("Laptop");
		product.setId(13);
		product.setDescription("HP Notebook");
		product.setPrice(800.00);
		product.setStockAmount(8);
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println("Kod : " +product.getkod());
	}	
}
