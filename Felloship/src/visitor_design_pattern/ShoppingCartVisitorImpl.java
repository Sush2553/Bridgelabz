package visitor_design_pattern;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
	@Override
	public int visit(Bookk book) {
		int cost = book.getPrice();
		System.out.println("Book  : " + book.getname() + "\tCost : " + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("Fruit : " + fruit.getName() + "\t\tCost : " + cost);
		return cost;
	}
}
