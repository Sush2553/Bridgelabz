package designPattern_programs;

public class AdapterPattern {
	public static void main(String[] args) {
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		VoltForAdapterPattern v3 = getVolt(sockAdapter, 3);
		VoltForAdapterPattern v12 = getVolt(sockAdapter, 12);
		VoltForAdapterPattern v120 = getVolt(sockAdapter, 120);
		System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		VoltForAdapterPattern v3 = getVolt(sockAdapter, 3);
		VoltForAdapterPattern v12 = getVolt(sockAdapter, 12);
		VoltForAdapterPattern v120 = getVolt(sockAdapter, 120);
		System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
	}

	private static VoltForAdapterPattern getVolt(SocketAdapter sockAdapter, int i) {
		switch (i) {
		case 3:
			return sockAdapter.get3Volt();
		case 12:
			return sockAdapter.get12Volt();
		case 120:
			return sockAdapter.get120volt();
		default:
			return sockAdapter.get120volt();
		}
	}
}

//interface
interface SocketAdapter {
	public VoltForAdapterPattern get120volt();

	public VoltForAdapterPattern get12Volt();

	public VoltForAdapterPattern get3Volt();

}

class SocketForAdapterPattern {
	public VoltForAdapterPattern getVolt() {
		return new VoltForAdapterPattern(120);
	}
}

class SocketClassAdapterImpl extends SocketForAdapterPattern implements SocketAdapter {

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

//pojo class
class VoltForAdapterPattern {
	private int volts;

	public VoltForAdapterPattern(int volts) {
		super();
		this.volts = volts;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}
}

class SocketObjectAdapterImpl implements SocketAdapter {

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
