import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class BookTest {

    public static void main(String[] args) {
    	
        Book book = new Book();
        LinkedList<String> linkedList = new LinkedList<String>();
        
        linkedList.add("Basit Qurashi");
        linkedList.add("Omar Ghalem");
        
        book.authors = linkedList;
        book.title = "Java Programming I";
        book.price = 150;
        
        Book book2 = new Book();
        LinkedList<String> linkedList2 = new LinkedList<String>();
        
        linkedList2.add("Anis Koubaa");
        
        book2.authors = linkedList2;
        book2.title = "Java Programming II";
        book2.price = 120;
        
        Set<Book> bookSet = new TreeSet<Book>();
        
        bookSet.add(book);
        bookSet.add(book2);
        
        for (Book b : bookSet)
             System.out.printf( "%s \n", b  );
        
        displayAuthors(book);
        displayAuthors(book2);
        
    }

    public static void displayAuthors(Book book) {
    	
        System.out.println("Authors for book: "+ book.title);
        
        Iterator<String> iterator = book.authors.iterator();
        int i = 1;
        
        while(iterator.hasNext()) {
        	
              System.out.println("Author "+ i + ": " + iterator.next());
              i++;
              
        }
    }
}