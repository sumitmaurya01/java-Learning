package challenge82;

public class Test {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,5,6,7,8,9};
        //int[] arr1 = new int[];

        ArrayOperations.Statistics o1 = new ArrayOperations.Statistics(new int[]{1, 2, 4, 5, 5,});
        System.out.println("the mean of the given array is: "+o1.mean());
        ArrayOperations.Statistics o2 = new ArrayOperations.Statistics(arr);
        System.out.println("the mean of the given array is: "+o2.mean());
        System.out.println("the median of the given array is: "+o1.median());
        System.out.println("the median of the given array is: "+o2.median());
    }
}
