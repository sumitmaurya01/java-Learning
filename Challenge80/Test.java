package Challenge80;

public class Test {
    public static void main(String[] args){
        Book b1=new Book("atomic habit","john clear",121,101010);
        Magazine m1=new Magazine("M01","National Geography",123,001);
        DVD d1= new DVD("marvel","unknown",91,90.56f);
         b1.display();
         b1.checkOut();
         b1.returnItem();
System.out.println("\n");
        System.out.println("\n");
         m1.display();
         m1.checkOut();
         m1.returnItem();
        System.out.println("\n");System.out.println("\n");
         d1.display();
         d1.checkOut();
         d1.checkOut();
         d1.returnItem();
        System.out.println("\n");System.out.println("\n");
    }
}
