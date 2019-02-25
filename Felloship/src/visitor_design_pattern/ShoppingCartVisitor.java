package visitor_design_pattern;

public interface ShoppingCartVisitor {
	int visit(Bookk book);

	int visit(Fruit fruit);
}
