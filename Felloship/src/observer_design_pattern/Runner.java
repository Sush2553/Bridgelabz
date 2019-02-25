package observer_design_pattern;
/**
 * @author Sushant Patwari
 * @since 18/02/2019
 * @aim To implement Observer design pattern
 */
public class Runner {
	public static void main(String a[]) {
	Subscriber subscriber1 = new Subscriber(); // object of Subscriber class
	subscriber1.setCustomername("Sushant");// sset customer name
	Subscriber subscriber2 = new Subscriber();
	subscriber2.setCustomername("sandy");

	MyTopic topic = new MyTopic(); // object of MyTopic class
	topic.setProductname("Redmi note 5");// set product name
	topic.setAvailable(false);

	topic.registeredObserver(subscriber1);
	topic.registeredObserver(subscriber2);
	topic.setAvailable(true);
}
}
