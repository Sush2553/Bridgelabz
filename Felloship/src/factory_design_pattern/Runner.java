package factory_design_pattern;
/**
 * @author Sushant Patwari
 * @since 20/02/2019
 * @aim To implement factory design pattern
 */
public class Runner {
	public static void main(String[] args) {
		Computer computer1 = FactoryObject.getInstance("Server"); // store object of Server class in computer1
		computer1.display();
		Computer computer2 = FactoryObject.getInstance("Computer Factory");// store object of ComputerFactory class in
																			// computer1
		computer2.display();
		Computer computer = FactoryObject.getInstance(" ");// store object of PC class in computer1
		computer.display();
	}
}
