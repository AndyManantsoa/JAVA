//3) Write a class Book with title, author, and pageCount.
//   Include a constructor that takes all three arguments and another with just title and author (assuming page count can be a default value).

public class Book {
    String title;
    String author;
    static int pageCount;

    public Book(String title, String author, int pageCount){
        this.title= title;
        this.author= author;
        Book.pageCount=pageCount;
      }
      
      public Book(String title, String author){
        this.title= title;
        this.author= author;
      }
      
      public void display(){
            System.out.println("Title : "+this.title+"\n"+
                              "Author : "+this.author+"\n"+
                              "Page count : "+pageCount+"\n\n");
        }
    
        public static void main(String[] args){
            Book b1 = new Book("Manantsoa","Shake Spear", 8);
            b1.display();
            Book b2 = new Book("Claudino", "lolo");

            b2.display();
    
        }
}
