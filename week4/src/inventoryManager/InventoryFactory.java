package inventoryManager;

/**
 * @author Sushant Patwari
 * @since 10/02/2019
 * @aim pojo class for inventory
 */
public class InventoryFactory {
	private String productname;
	private int totalStock;
	private int stockValue;

	public void setproductname(String productname) {
		this.productname = productname;
	}

	public void settotalStock(int totalStock) {
		this.totalStock = totalStock;
	}

	public void setstockValue(int stockValue) {
		this.stockValue = stockValue;
	}

	public String getproductname() {
		return this.productname;
	}

	public int gettotalStock() {
		return this.totalStock;
	}

	public int getstockValue() {
		return this.stockValue;
	}

}
