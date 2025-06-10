package CollectionAndGenerics;

class GenericClass <T,E>{
    private T first;
    private E second;
    public GenericClass(T first,E second){
        this.first = first;
        this.second=second;
    }
    public void show(){
        System.out.println("first = "+first+" Second = "+second);
    }
}
public class GenericClassTest{
    public static void main(String[] args){
        GenericClass<String,String>gc1=new GenericClass<>("sumit","maurya");
        GenericClass<Integer,String>gc2=new GenericClass<>(5,"Ram");
        gc1.show();
        gc2.show();
    }
}

