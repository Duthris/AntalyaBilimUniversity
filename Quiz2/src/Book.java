import java.util.LinkedList;

public class Book implements Comparable <Book>{

     public String title;
     public LinkedList<String> authors;
     public double price;

     public Book(){
    	 
         this.title = "Not Available";
         this.authors = new LinkedList<String>();
         this.price = 0;
         
     }

     @Override
     public int compareTo(Book book){
    	 
         return ((int)(this.price-book.price));
         
     }

     public String toString (){
    	 
         return String.format ("[%s, %s, %.2f]", title, authors, price);
         
     }
}