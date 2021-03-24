package bookstore;

public class Book {
	Person author;
	String title;
	
	public Book(Person author, String title) {
		this.author = author;
		this.title = title;
	}

	public Person getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
}
