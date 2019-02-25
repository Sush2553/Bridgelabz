package proxy_design_pattern;

public class CommandExecutorProxy implements CommandExecutor {
	private CommandExecutor executor;
	private boolean isAdmin;

	public CommandExecutorProxy(String username, String password) {
		if ("Admin".equals(username) && "Sush@2553".equals(password)) // if username and password matches then execute
																		// cmd
			isAdmin = true;
		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) { // if user is admin then only run command
			executor.runCommand(cmd);
		} else { // non admin user can't run command
			if (cmd.trim().startsWith("rm"))
				throw new Exception("Delete cmd not allowed for non admin user ..!!");
			else
				executor.runCommand(cmd);
		}
	}
}
