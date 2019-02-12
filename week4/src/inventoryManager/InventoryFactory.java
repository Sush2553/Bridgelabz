package inventoryManager;

public class InventoryFactory {
	private int Id;
	private String productname;
	private int totalStock;
	private int stockValue;

	public InventoryFactory(int Id,String productname, int totalStock, int stockValue) {
		this.Id=Id;
		this.productname = productname;
		this.totalStock = totalStock;
		this.stockValue = stockValue;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

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
