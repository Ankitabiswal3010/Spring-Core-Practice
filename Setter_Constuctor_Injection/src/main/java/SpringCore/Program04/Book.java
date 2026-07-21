package SpringCore.Program04;

public class Book 
{
	private int bookId;
	private String bookName;
	private String authorName;
	private double price;
	 public Book() {
	        System.out.println("Default Constructor Called");
	    }
	public Book(int bookId, String bookName, String authorName, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display()
	{
		IO.println("Book id is : "+bookId);
		IO.println("Book name is : "+bookName);
		IO.println("Author Name is : "+authorName);
		IO.println("Price is :"+price);
	}

}
