package designPattern_programs;

import java.io.Serializable;

@SuppressWarnings({ "unused" })
public class SingletonPattern {

	public static void main(String[] args) throws Exception {
		StaticBlockSingleton staticinstance = StaticBlockSingleton.getInstance();
		EagerInitialization eager = EagerInitialization.getInstance();
		LazyInitialization lazy = LazyInitialization.getInstance();
		LazyInitialization lazy2 = LazyInitialization.getInstance();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				ThreadSafeSingleton threadsafeinstance = ThreadSafeSingleton.getInstance();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				ThreadSafeSingleton threadsafeinstance = ThreadSafeSingleton.getInstance();
			}
		});
		t1.start();
		t2.start();
		BillPughSingleton billpugh = BillPughSingleton.getInstance();

		EnumSingletone enumsingletone = EnumSingletone.INSTANCE;
		enumsingletone.i = 2;
		enumsingletone.display();
		SerializedSingleton serializable = SerializedSingleton.getInstance();
		serializable.serialVersionUID = 5;
		System.out.println("Value of version ID = " + serializable.serialVersionUID);
	}
}

class EagerInitialization {
	static EagerInitialization eager = new EagerInitialization();

	private EagerInitialization() {
		System.out.println("EagerInitialization instance created");
	}

	public static EagerInitialization getInstance() {
		return eager;
	}
}

//static block singleton provides exception handling
class StaticBlockSingleton {
	private static StaticBlockSingleton staticinstance;

	private StaticBlockSingleton() {
		System.out.println("Static block initialization");
	}

// static block initialization for exception handling
	static {
		try {
			staticinstance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return staticinstance;
	}
}

class LazyInitialization {
	static LazyInitialization lazy; // lazy

	private LazyInitialization() {
		System.out.println("LazyInitialization Instatnce created");
	}

	public static LazyInitialization getInstance() {
		if (lazy == null) {
			lazy = new LazyInitialization();
		}
		return lazy;
	}
}

class ThreadSafeSingleton {
	private static ThreadSafeSingleton threadsafeinstance;

	private ThreadSafeSingleton() {
		System.out.println("Thread Safe instance created ");
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (threadsafeinstance == null) {
			threadsafeinstance = new ThreadSafeSingleton();
		}
		return threadsafeinstance;
	}
}

//uses inner static class
class BillPughSingleton {

	private BillPughSingleton() {
		System.out.println("Bill pugh instance");
	}

	private static class SingletonInner {
		private static final BillPughSingleton billbughinstance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonInner.billbughinstance;
	}
}

enum EnumSingletone {
	INSTANCE;
	int i;

	public void display() {
		System.out.println("i = " + i);
	}
}

@SuppressWarnings("serial")
class SerializedSingleton implements Serializable {
	int serialVersionUID;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton serializable = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.serializable;
	}
}
