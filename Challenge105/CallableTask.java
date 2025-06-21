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
    public Integer call(){
        int ans=1;
        if(num==0) return 0;
        for(int i=1; i<=num; i++){
            ans*=i;
        }
        return ans;
    }
}
