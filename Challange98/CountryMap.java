package Challange98;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class CountryMap {
    public static Map store(){
        Map<String,String> mpp =new HashMap<>();
        mpp.put("India","New Delhi");
        mpp.put("China","Beijing");
        mpp.put("Pakistan","Islamabad");
        mpp.put("America","Washington DC");
        mpp.put("France","Paris");
        return mpp;
    }
    public static void main(String[] args){
        Map<String,String> mpp = store();
        Scanner sc = new Scanner(System.in);
        System.out.println(mpp);
        System.out.println("Enter the country to find the capital: ");
        String country = sc.nextLine();
        country = country.substring(0,1).toUpperCase()+country.substring(1).toLowerCase();
        if( mpp.get(country) != null){
            System.out.printf("Capital of %s : %s",country,mpp.get(country));
        }
        else{
            System.out.println("Not found");
        }
    }
}
