package prototype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	private String shopname;
	List<Book> list = new ArrayList<>(); // create arraylist

	@Override
	protected BookShop clone() {
		BookShop shop = new BookShop();
		for (Book book : this.getList()) {
			shop.getList().add(book); // add book details to list
		}
		return shop; // return object
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}

//to add book id and book name
	public void loadData() {
		for (int i = 1; i < 5; i++) {
			Book book = new Book();
			book.setBookid(i); // assign book id
			book.setBookname("Book " + i);// assign book name
			getList().add(book);
		}
	}

	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", list=" + list + "]";
	}
}
