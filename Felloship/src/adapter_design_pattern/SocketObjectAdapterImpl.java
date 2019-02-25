package adapter_design_pattern;

public class  SocketObjectAdapterImpl implements SocketAdapter {

	private SocketForAdapterPattern sock = new SocketForAdapterPattern();

	@Override
	public VoltForAdapterPattern get12Volt() {
		VoltForAdapterPattern v = sock.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public VoltForAdapterPattern get3Volt() {
		VoltForAdapterPattern v = sock.getVolt();
		return convertVolt(v, 40);
	}

	private VoltForAdapterPattern convertVolt(VoltForAdapterPattern v, int i) {
		return new VoltForAdapterPattern(v.getVolts() / i);
	}

	@Override
	public VoltForAdapterPattern get120volt() {
		return sock.getVolt();
	}
}
