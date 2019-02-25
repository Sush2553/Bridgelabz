package visitor_design_pattern;

public interface VisitorItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
