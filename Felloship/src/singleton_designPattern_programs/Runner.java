package singleton_designPattern_programs;

/**
 * @author Sushant Patwari
 * @since 15/02/2019
 * @aim To implement singleton design pattern(Creational)
 */
@SuppressWarnings({ "unused" })
public class Runner {

	public static void main(String[] args) throws Exception {
		StaticBlockSingleton staticinstance = StaticBlockSingleton.getInstance(); // object for StaticBlockSingleton
																					// class
		EagerInitialization eager = EagerInitialization.getInstance(); // object for EagerInitialization class
		LazyInitialization lazy = LazyInitialization.getInstance(); // object for LazyInitialization class
		LazyInitialization lazy2 = LazyInitialization.getInstance();// object for LazyInitialization class
		// create 2 threads
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				ThreadSafeSingleton threadsafeinstance = ThreadSafeSingleton.getInstance();// object for
																							// ThreadSafeSingleton class
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				ThreadSafeSingleton threadsafeinstance = ThreadSafeSingleton.getInstance();// object for
																							// ThreadSafeSingleton class
			}
		});
		t1.start();
		t2.start();
		BillPughSingleton billpugh = BillPughSingleton.getInstance();// object for BillPughSingleton class

		EnumSingletone enumsingletone = EnumSingletone.INSTANCE;
		enumsingletone.i = 2; // set value for i
		enumsingletone.display();
		SerializedSingleton serializable = SerializedSingleton.getInstance();
		serializable.serialVersionUID = 5; // set derisl version id
		System.out.println("Value of version ID = " + serializable.serialVersionUID);
	}
}
