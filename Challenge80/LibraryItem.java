package Challenge80;

public class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    private int count=0;
    public LibraryItem(String title,String author,int itemId){
        this.title=title;
        this.author=author;
        this.itemId=itemId;
        count++;
    }

    public void checkOut(){
        // code here
        if(count > 0) {
            System.out.println(title + " is checkOut");
            count--;
        }else {
            System.out.println("Item not available");
        }
    }
    public void returnItem(){
        //code here
        System.out.println(title+" is returnItem");
        count++;

    }
    public void display(){
        System.out.println("title= "+title);
        System.out.println("Author= "+author);
        System.out.println("itemId= "+itemId);

    }
}
