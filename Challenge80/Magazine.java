package Challenge80;

public class Magazine extends LibraryItem{
    private int issueNo;
    public Magazine(String title,String author,int itemId,int issueNo){
        super(title,author,itemId);
        this.issueNo=issueNo;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("issueNo = "+issueNo);
    }
}
