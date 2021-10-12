import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Book book = new Book();
		LinkedList<String> linkedList = new LinkedList <String>();
		linkedList.add("Adem Anýl");
		linkedList.add("Taran Ban");
		linkedList.add("Onur baba");
		book.authors = linkedList;
		displayAuthors(book);

	}
	
	public static void displayAuthors(Book book) {
		
		System.out.println("Authors for book: " + book.title);

		Iterator<String> iterator = book.authors.iterator();
		int i = 1;
		
		while (iterator.hasNext()) {
			System.out.println("Author " + i + ": " + iterator.next());
		}
	}

}
