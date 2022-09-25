package Homework;

public class JavaCodesSTP2 {
	public static void main(String[] args) {
		sayi();
		int toplam = topla(2,3,4,5);
		System.out.println(toplam);
	}

	public static void sayi() {
			double[] myList = {1.3 , 2.3 , 3.3 , 4.3};
			double total = 0;
			double max = myList[0];
			for (double number:myList) {
				total = total + number;
				System.out.println(number);
}	
			for(double number:myList) {
				if (max<number) {
					max = number;
	 }
			}
				System.out.println("Toplam = " + total);
				System.out.println("En büyük sayı = " + max);
	}
		
		public static int topla(int... sayilar) {
			int toplam =0;
			for (int sayi:sayilar) {
				toplam += sayi;
			}
			return toplam;
		}
	}