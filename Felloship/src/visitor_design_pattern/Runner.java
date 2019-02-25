package visitor_design_pattern;
/**
 * @author Sushant Patwari
 * @since 19/02/2019
 * @aim To implement visitor design pattern
 */
public class Runner {
	public static int calculate(VisitorItemElement[] itemList) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (VisitorItemElement item : itemList) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
	public static void main(String[] args) {
		VisitorItemElement[] itemList = new VisitorItemElement[] { new Bookk(50, "Agnipankh"),
				new Bookk(10, "Mahatma Gandhi"), new Fruit(11, 20, "Apple"), new Fruit(40, 30, "banana") };
		int total = calculate(itemList);
		System.out.println("\n\tTotal Cost is : " + total);
	}
}
