package proxy_design_pattern;

public class CommandExecutorImpl implements CommandExecutor {
	@Override
	public void runCommand(String cmd) throws Exception {
		Runtime.getRuntime().exec(cmd); // execute command
		System.out.println(" " + cmd + " command executed ");
	}

}
