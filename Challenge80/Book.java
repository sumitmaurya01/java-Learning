package Challenge80;

public class Book extends LibraryItem{
    private int isbn;
    public Book(String title,String author,int itemId,int isbn){
        super(title,author,itemId);
        this.isbn=isbn;
    }
    @Override
    public void  display(){
      super.display();
      System.out.println("Isbn = "+isbn);
    }
}
