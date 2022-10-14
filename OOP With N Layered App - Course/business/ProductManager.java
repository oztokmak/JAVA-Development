package oopWithNLayeredApp.business;




import oopWithNLayeredApp.core.logging.Logger;

import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao ;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}



	public void add(Product product) throws Exception {
		
		if(product.getKategoriUcret()<0) {
			throw new Exception("Bu kursun fiyatı 0'dan küçük olamaz!");
		}
	}
	public void add1(Product product) throws Exception {
			
		if(product.getKursAdı()==product.getKursAdı()) {
			throw new Exception("Bu isimle kayıtlı bir kurs mevcut, lütfen kurs ismini değiştirin!");
		}
	}
	public void add3(Product product) throws Exception {
				
		if(product.getKategoriAdı()==product.getKategoriAdı()) {
			throw new Exception("Bu isimle kayıtlı bir kategori mevcut, lütfen kategori ismini değiştirin!");
		}
		productDao.add(product);
		for (Logger logger : loggers) {
			logger.log(product.getKursAdı());
		}
	}
	
}
	
