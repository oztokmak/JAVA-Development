package oopWithNLayeredApp.entities;

public class Product {

		private String KursAdı;
		private String KategoriAdı;
		private double KategoriUcret;
		
		public Product() {
		}

		public Product(String kursAdı, String kategoriAdı, double kategoriUcret) {
			super();
			KursAdı = kursAdı;
			KategoriAdı = kategoriAdı;
			KategoriUcret = kategoriUcret;
		}

		public String getKursAdı() {
			return KursAdı;
		}

		public void setKursAdı(String kursAdı) {
			KursAdı = kursAdı;
		}

		public String getKategoriAdı() {
			return KategoriAdı;
		}

		public void setKategoriAdı(String kategoriAdı) {
			KategoriAdı = kategoriAdı;
		}

		public double getKategoriUcret() {
			return KategoriUcret;
		}

		public void setKategoriUcret(double kategoriUcret) {
			KategoriUcret = kategoriUcret;
		}

}
