package designPattern_programs;

import java.util.ArrayList;
import java.util.List;

public class PrototypePattern {
	public static void main(String[] args) throws Exception
	{
		BookShop book = new BookShop();
		book.setShopname("Saraswati");
		book.loadData();
		
		BookShop book1 = (BookShop)book.clone();
		book1.setShopname("BookLover");
		book.getList().remove(2);

		System.out.println(book);
		System.out.println(book1);
	}
}
class BookShop implements Cloneable
{
	private String shopname;
	List<Book> list = new ArrayList<>();
	@Override
	protected BookShop clone()
	{
		BookShop shop = new BookShop();
		for(Book book : this.getList())
		{
			shop.getList().add(book);
		}
		return shop;
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
	public void loadData()
	{
		for(int i=1;i<5;i++)
		{
			Book book = new Book();
			book.setBookid(i);
			book.setBookname("Book "+i);
			getList().add(book);
		}
	}
	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", list=" + list + "]";
	}
}

class Book 
{
	private int bookid;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	private String bookname;
	@Override
	public String toString() {
		return "Book[bookid=" + bookid + ", bookname=" + bookname + "]";
	}
}
