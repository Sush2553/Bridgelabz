package designPattern_programs;

public class ProxyPattern {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Admin", "Sush@2553");
		try {
			executor.runCommand("ls -l");
			executor.runCommand("rm -rf searchInt (copy).txt");
		} catch (Exception e) {
			System.out.println("Excetion " + e.getMessage());
		}
	}
}

interface CommandExecutor {
	public void runCommand(String cmd) throws Exception;
}

class CommandExecutorImpl implements CommandExecutor {
	@Override
	public void runCommand(String cmd) throws Exception {
		Runtime.getRuntime().exec(cmd);
		System.out.println(" " + cmd + " command executed ");
	}

}


class CommandExecutorProxy implements CommandExecutor {
	private CommandExecutor executor;
	private boolean isAdmin;

	public CommandExecutorProxy(String username, String password) {
		if ("Admin".equals(username) && "Sush@2553".equals(password))
			isAdmin = true;
		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm"))
				throw new Exception("Delete cmd not allowed for non admin user ..!!");
			else
				executor.runCommand(cmd);
		}
	}
}
