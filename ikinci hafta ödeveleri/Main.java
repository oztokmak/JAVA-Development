import java.awt.print.Book;

public class Main {

	public static void main(String[] args) {
	System.out.println("Hello World!");
	String ortaMetin = "İlginizi Çekebilir";
	String altMetin = "Vade Süresi";
	System.out.println(ortaMetin);
	
	int vade = 12;
	
	double dolarDun = 18.20;
			
	double dolarBugun = 18.20;
	
	boolean dolarGuncel = true;
	
	String okYonu = "down.svg" ;
	String okYonu2 = "up.svg" ;
	String okYonu3 = "equal.svg" ;
	if (dolarBugun > dolarDun) {
		
		System.out.println(okYonu);
	} 
	else if (dolarBugun < dolarDun) {
	System.out.println(okYonu2);
	}
	else {
		System.out.println(okYonu3);
	}
	
	
	}

}
