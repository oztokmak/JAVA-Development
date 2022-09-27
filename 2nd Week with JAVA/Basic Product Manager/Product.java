package classesWithAttiributes;

public class Product {
	public Product() {
		System.out.println("Yapıcı Blok Çalıştı!");
	}
	//Attiribute | Value | Encapsulation
	 private String name;
	 private String description;
	 private Double price;
	 private int stockAmount;
	 int id;
	 private String renk;
	 private String Kod;
	
	 
	 
	 public String getkod() {
			return this.name.substring(0,1) + id;		
		}
	 
	public int getId()
	{
		return id;	
	}
	
	public void setId(int id)
	{
		this.id = id; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	

	

}
