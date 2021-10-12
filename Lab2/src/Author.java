// Adem Anil Yalimdemir - 180201017 - CS201 Lab02 - Task 1 Author class

public class Author    
{ 
   private String name;
   private String email;
   private char gender;
  
   
   
   public Author(String name, String email, char gender)
   {
       this.name = name;
       this.email = email;
       this.gender = gender;
   }
  
   
   
   public String getEmail()
   {
       return email;
   }
  
   
   
   public String getName()
   {
       return name;
   }
  
  
   
   public char getGender()
   {
       return gender;
   }
  
   
   
   public void setEmail(String email)
   {
       this.email = email;
   }
  
   
   
   public String toString()
   {
       return "Author [name="+name+", email="+email+",gender="+gender+"]";
   }

}



