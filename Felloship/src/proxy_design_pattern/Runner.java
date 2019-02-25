package proxy_design_pattern;
/**
 * @author Sushant Patwari
 * @since 21/02/2019
 * @aim To implement proxy design pattern
 */
public class Runner {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Admin", "Sush@2553"); // object
		try {
			executor.runCommand("ls -l"); // to list files
			executor.runCommand("rm -rf searchInt (copy).txt");
		} catch (Exception e) {
			System.out.println("Excetion " + e.getMessage());
		}
	}
}
