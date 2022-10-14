package methodOverloading;

public class Main {
	public static void main (String[] args)
	{
		Calculator calculator = new Calculator();
		System.out.println(calculator.topla(8, 5));
		calculator.topla(8, 5, 10);
	}
}


