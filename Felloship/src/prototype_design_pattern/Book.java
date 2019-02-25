package prototype_design_pattern;

public class Book {
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
