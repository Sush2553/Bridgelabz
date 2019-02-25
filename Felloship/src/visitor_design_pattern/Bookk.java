package visitor_design_pattern;

public class Bookk implements VisitorItemElement {
	private int price;
	private String name;

//consructor
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
