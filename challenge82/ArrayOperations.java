package challenge82;
/*  static nested class implementation**/
public class ArrayOperations {
// if this nested class will be non-static then first we have to create the object of the outer class
    // then after that we will create the object of the nested class
    // using outerClassName . innerClassName objectName = objectOfOuterClass.new innerClass;
    public static class Statistics{
        private int[]arr;
        int sum;
        int size;
        public Statistics(int[] nums)
        {
            size = nums.length;
            sum = 0;
            arr = new int[size];
            // to initialise the array
            for(int i=0;i<size; i++){
                arr[i]=nums[i];
                sum+=arr[i];
            }
        }
        public double mean(){
            System.out.println(this);
            return (double)sum/size;
        }

        public double median(){
            // to be code here
            // first we have to sort the array

            for(int i=0; i<size; i++){
                for(int j=0; j<size-i-1; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            if(size % 2 != 0){
                return (double)arr[size/2];
            }
            else {
                return (double)(arr[size / 2] + arr[size / 2 - 1])/2;
            }
        }
    }
}
