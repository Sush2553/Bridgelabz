package adapter_design_pattern;


public class VoltForAdapterPattern {
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
	
	
	// method for class type adapter
		public static void testClassAdapter() {
			SocketAdapter sockAdapter = new SocketClassAdapterImpl();
			VoltForAdapterPattern v3 = getVolt(sockAdapter, 3);
			VoltForAdapterPattern v12 = getVolt(sockAdapter, 12);
			VoltForAdapterPattern v120 = getVolt(sockAdapter, 120);
			System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
			System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
			System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
		}

		// method for object type adapter
		public static void testObjectAdapter() {
			SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
			VoltForAdapterPattern v3 = getVolt(sockAdapter, 3);
			VoltForAdapterPattern v12 = getVolt(sockAdapter, 12);
			VoltForAdapterPattern v120 = getVolt(sockAdapter, 120);
			System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
			System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
			System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
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

