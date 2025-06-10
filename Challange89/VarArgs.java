package Challange89;

public class VarArgs {
    public static String concate(String... str){
        String ans = "";
        for(String s : str){
            ans+=s;
        }
        return ans;
    }
}
