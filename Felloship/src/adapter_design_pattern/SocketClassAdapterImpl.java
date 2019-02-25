package adapter_design_pattern;


public class SocketClassAdapterImpl extends SocketForAdapterPattern implements SocketAdapter {
	@Override
	public VoltForAdapterPattern get120volt() {
		return getVolt();
	}

	@Override
	public VoltForAdapterPattern get12Volt() {
		VoltForAdapterPattern v = getVolt();
		return convertVolt(v, 10);
	}

	private VoltForAdapterPattern convertVolt(VoltForAdapterPattern v, int i) {
		return new VoltForAdapterPattern(v.getVolts() / i);
	}

	@Override
	public VoltForAdapterPattern get3Volt() {
		VoltForAdapterPattern v = getVolt();
		return convertVolt(v, 40);
	}
}
