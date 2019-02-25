package prototype_design_pattern;

/**
 * @author Sushant Patwari
 * @since 15/02/2019
 * @aim To implement Prototype design pattern
 */
public class Runner {
	public static void main(String[] args) throws Exception {
		BookShop book = new BookShop(); // object for BookShop class
		book.setShopname("Saraswati"); // set bookshop name
		book.loadData();

		BookShop book1 = (BookShop) book.clone(); // create duplicate object of object book
		book1.setShopname("BookLover"); // set bookshop name
		book.getList().remove(2);

		System.out.println(book); // print data
		System.out.println(book1);
	}
}
