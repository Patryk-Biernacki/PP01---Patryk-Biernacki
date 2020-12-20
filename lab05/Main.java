import java.util.ArrayList;

final class Library {

	protected ArrayList<Book> books = new ArrayList<>();

	public Library addNovel(Novel novel) {
		this.books.add(novel);
		return this;
	}

	public Library addComic(Comic comic) {
		this.books.add(comic);
		return this;
	}

	public Library addlearnbook(learnBook learnbook) {
		this.books.add(learnbook);
		return this;
	}

	public ArrayList<Book> getBooks() {
		return this.books;
	}

}

abstract class Book {

	protected String title;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	abstract public String getType();

}

class Novel extends Book {

	public Novel(String title) {
		super(title);
	}

	public String getType() {
		return "novel";
	}

}

class Comic extends Book {

	public Comic(String title) {
		super(title);
	}

	public String getType() {
		return "Comic";
	}

}

class learnBook extends Book {

	public learnBook(String title) {
		super(title);
	}

	public String getType() {
		return "learnBook";
	}

}

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		library.addNovel(new Novel("The Vector Prime"));
		library.addNovel(new Novel("Star by Star"));
		library.addNovel(new Novel("The Unifying Force"));

		for(Book book : library.getBooks()) {
			System.out.println(book.getType() + " || " + book.getTitle());
		}
	}

}
