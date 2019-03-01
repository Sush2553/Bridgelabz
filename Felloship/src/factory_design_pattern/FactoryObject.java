package factory_design_pattern;

public class FactoryObject {
	public static Computer getInstance(String str) {
		// retunrns object of class according to user input
		if (str.equals("Computer Factory"))
			return new ComputerFactory();
		else if (str.equals("Server"))
			return new Server();
		else
			return new PC();
	}
}