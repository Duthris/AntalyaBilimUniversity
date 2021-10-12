// Adem Anil Yalimdemir - 180201017 - CS201 Lab02 - Task 1 TestBook class


public class TestBook {
  
   public static void main(String[] args) {

       Author author = new Author("Aissa HOUDJEDJ","aissa.au@_g_m_a_i_l.com",'m'); 
       
       Book book1 = new Book("Book1",author, 25.75);
       Book book2 = new Book("Book2",author, 10.75, 20);
      
       System.out.println(book1);
       System.out.println("Book 2 Name: "+book2.getName());
       System.out.println("Book 2 Author Name: "+book2.getAuthor().getName());
       System.out.println("Book 2 Author Email: "+book2.getAuthor().getEmail());
       System.out.println("Book 2 Author Gender: "+book2.getAuthor().getGender());
       System.out.println("Book 2 Price: "+book2.getPrice());
       System.out.println("Book 2 Qty: "+book2.getQty());
      
       book1.setPrice(12.50);
       book1.setQty(15);
       
       System.out.println(book1);
       System.out.println("Book 2 Author Name: "+book1.getAuthorName());
       System.out.println("Book 2 Author Email: "+book1.getAuthorEmail());
      
   }

}