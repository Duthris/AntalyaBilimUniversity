// Adem Anil Yalimdemir - 180201017 - CS201 Lab02 - Task 1 Book class


public class Book
{
   private String name;
   private Author author;
   private double price;
   private int qty;
  
   
   
   public Book(String name, Author author, double price)
   {
       this(name, author, price, 0);
   }

   
   
   public Book(String name, Author author, double price, int qty)
   {
       this.name = name;
       this.author = author;
       this.price = price;
       this.qty = qty;
   }
  
   
   
   public String getName()
   {
       return name;
   }
  
   
   
   public Author getAuthor()
   {
       return author;
   }
  
   
   
   public double getPrice()
   {
       return price;
   }
  
   
   
   public void setPrice(double price)
   {
       this.price = price;
   }
  
   
   
   public int getQty()
   {
       return qty;
   }
  
   
   
   public void setQty(int qty)
   {
       this.qty = qty;
   }
  
  
   
   public String getAuthorName()
   {
       return author.getName();
   }
  

   
   public String getAuthorEmail()
   {
       return author.getEmail();
   }
  
   
  
   public String toString()
   {
       return "Book [name="+name+", "+author+", price="+price+", qty="+qty+"]";
   }
  
   
}