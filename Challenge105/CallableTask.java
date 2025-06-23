package Challenge105;

import java.util.concurrent.Callable;
public class CallableTask implements Callable<Integer> {
    private final Integer num;
    public CallableTask(Integer n){
        num = n;
    }
    int getNum(){
        return num;
    }
    public Integer call()throws InterruptedException{
        Thread.sleep(3000);
        int ans=1;
        if(num<=1) return 1;
        for(int i=1; i<=num; i++){
            ans*=i;
        }
        return ans;
    }
}
