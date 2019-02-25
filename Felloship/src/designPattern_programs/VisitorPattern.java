package designPattern_programs;

public class VisitorPattern {
	public static void main(String[] args) {
		VisitorItemElement[] itemList = new VisitorItemElement[] { new Bookk(50, "Agnipankh"), new Bookk(10, "Gandhi"),
				new Fruit(11, 20, "Apple"), new Fruit(40, 30, "banana") };
		int total = calculate(itemList);
		System.out.println("Total Cost is : " + total);
	}

	static int calculate(VisitorItemElement[] itemList) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (VisitorItemElement item : itemList) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}

interface VisitorItemElement {
	public int accept(ShoppingCartVisitor visitor);
}

interface ShoppingCartVisitor {
	int visit(Bookk book);

	int visit(Fruit fruit);
}

class Bookk implements VisitorItemElement {
	private int price;
	private String name;

	public Bookk(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public String getname() {
		return name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}

class Fruit implements VisitorItemElement {
	private int pricePerKg;
	private int weight;
	private String name;

	public Fruit(int pricePerKg, int weight, String name) {
		super();
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}

class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Bookk book) {
		int cost = 0;
		if (book.getPrice() > 0) {
			cost = book.getPrice() - 5;
		} else
			cost = book.getPrice();
		System.out.println("Book  : " + book.getname() + " \tCost : " + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("Fruit : " + fruit.getName() + "\t\tCost is : " + cost);
		return cost;
	}

}
