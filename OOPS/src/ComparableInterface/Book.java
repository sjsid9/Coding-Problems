package ComparableInterface;

public class Book implements Comparable<Book> {

	private int ff;

	public static void main(String[] args) {

		Book specifiedBook = new Book();
		specifiedBook.author = "Hello";
		specifiedBook.title = "Physics";
		specifiedBook.numOfPages = 110;
		specifiedBook.ff = 55;
		Book book = new Book();
		System.out.println(book.compareTo(specifiedBook));

	}

//	public Book(int numOfPages, String title, String author) {
//		super();
//		this.numOfPages = numOfPages;
//		this.title = title;
//		this.author = author;
//	}

	int numOfPages = 110;;
	String title = "Physics";
	String author = "Hello";

	@Override
	public int compareTo(Book specifiedBook) {

		if (this.numOfPages != specifiedBook.numOfPages) {
			return this.numOfPages - specifiedBook.numOfPages;
		}

		if (!this.title.equals(specifiedBook.title)) {
			return this.title.compareTo(specifiedBook.title);
		}

		return this.author.compareTo(specifiedBook.author);
	}

}
