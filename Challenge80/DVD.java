package Challenge80;

public class DVD extends LibraryItem{
    private float duration;
    public DVD(String title,String author,int itemId,float duration){
        super(title,author,itemId);
        this.duration=duration;
    }
    public void display(){
        super.display();
        System.out.println("Duration = "+duration);
    }
}
