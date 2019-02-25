package singleton_designPattern_programs;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SerializedSingleton implements Serializable {
	public int serialVersionUID;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton serializable = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.serializable;
	}
}