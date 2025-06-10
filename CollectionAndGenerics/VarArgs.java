package CollectionAndGenerics;

public class VarArgs {
    static int sum(int... nums){
        int s = 0;
        for(int num : nums){
            s+=num;
        }
        return s;
    }
    //this is used when we want that there should be atleast some num of arguments --- >
    static int add(int a,int b,int... nums){
        int sum = a+b;
        for(int num : nums){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("Welcome to variable parameter program");
        System.out.println("sum = "+sum(1,2));
        System.out.println("sum = "+sum(1,2,3,4,5));
        System.out.println("sum = "+sum(1));
        System.out.println("this is used when we want that there should be atleast some num of arguments --- >");
        //System.out.println("sum = "+add(1); // error cz we are providing 1 argu. and it requires atleast 2
        System.out.println("Sum = "+add(1,2,4,5));
    }
}
