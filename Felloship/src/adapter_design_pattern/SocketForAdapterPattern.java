package adapter_design_pattern;


public class SocketForAdapterPattern {
	public VoltForAdapterPattern getVolt() {
		return new VoltForAdapterPattern(120);
	}
}
