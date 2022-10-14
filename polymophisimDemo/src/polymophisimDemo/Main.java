package polymophisimDemo;

public class Main {
	public static void main(String[] args) {
		//BaseLogger[] loggers =new BaseLogger[] { new FileLogger(), new EmailLogger(), new Databaselogger()};
		//for (BaseLogger logger:loggers) {
		//	logger.Log("log mesajı");
		//	
		CustomerManager customerManager = new CustomerManager(new Databaselogger());
		customerManager.add();
	
	}
}

		