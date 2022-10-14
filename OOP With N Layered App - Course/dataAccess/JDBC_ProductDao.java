package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JDBC_ProductDao implements ProductDao {

	public void add(Product product) {
		System.out.println("JDBC ile veritabanına eklendi!");
		
	}
}
