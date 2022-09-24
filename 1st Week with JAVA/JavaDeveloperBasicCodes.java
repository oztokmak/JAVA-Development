import java.util.Iterator;

//Java Developer 1st Week Codes...Basic Codes
public class JavaDeveloperBasicCodes {

	public static void main(String[] args) {
		
		//print to the screen 
		System.out.println("Hello World!");

		//variables
		int playList = 20;
		System.out.println(playList);
		
		//base data types
		int x = 13;
		double 	y = 13.13;
		char karakter = 'B';
		byte c = 26;
		
		//if & else & elseif
		int a = 13 ;
		int b = 26 ;
		String shape = "up.svs" ;	
		String shape1 = "down.svs" ;	
		String shape2 = "equal.svs" ;	
		
		if (a>b) {
			System.out.println(shape);
		} 
		else if (a<b) {
			System.out.println(shape1);
		}
			
		else { System.out.println(shape2);

		}
		
		//ReCap Demo
		int sayi1 = 13;
		int sayi2 = 26;
		int sayi3 = 8;
		
		if (sayi1>sayi2) {
			System.out.println("SAYI1 EN BÜYÜK SAYIDIR");
		} 
		else if (sayi2>sayi3) 	
		{
			System.out.println("SAYI2 EN BÜYÜK SAYIDIR");
		}
		
		else {System.out.println("SAYI3 EN BÜYÜK SAYIDIR");

		}
		
		//switch blocks
		char grade = 'A';
		
			switch (grade) {
			case 'A': 
				System.out.println("Mükemmel!");
				break;
			case 'B': 
				System.out.println("İyi!");
				break;
			case 'C': 
				System.out.println("Çalışması gerekiyor!");
				break;
			case 'D': 
				System.out.println("Kötü!");
				break;
			}
		
		//loops|for & arrays
		String[] metal = {"slipknot","rammstein","lambofgod"};
		
		for (int i = 0; i < metal.length; i++) {
			System.out.println(metal[i]);

		//loops|while
		int q = 1;
		while(q<10) {
			 System.out.println(q);
			 q++;
		}
		
		//ReCap Demo 2
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
			 System.out.println("Toplam = " + total);
			 System.out.println("En büyük sayı = " + max);
		 }
		 
		//Strings
		 String mesaj = "Book of heavy metal!";
		 System.out.println("Eleman sayısı : " +mesaj.length());
		 System.out.println("8. Eleman : " +mesaj.charAt(8));
		 System.out.println(mesaj.concat(" Give Me!"));
		 char[] music = new char[24];
		 mesaj.getChars(7, 19, music, 0);
		 System.out.println(music);
		 System.out.println(mesaj.indexOf('a'));
		 System.out.println(mesaj.lastIndexOf('a'));
		}
		//Example Project
		int number = 25;
		for (int i = 1; i < number; i++) {
			int remainder = number % i;
			if (remainder == 1 )
			{
				 System.out.println("Sayı Asaldır!");
			}
			else if(remainder == number)
			{
				System.out.println("Sayı Asaldır!");
			}
			else
			{
				System.out.println("Sayı Asal Değildir!");
			}
		
		
		
		}
	
		
		
		
		
	}	

}
