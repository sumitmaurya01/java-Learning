package StreamDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Stream1 {
    public static void main(String[] args){
        List<Integer>list1=List.of(1,2,3,4,5,6,7,8,9,10,11);
        //get the even number from list1
        List<Integer>ans=new ArrayList<>();
        for(int i=0; i<list1.size(); i++){
            if(list1.get(i) %2==0){
                ans.add(list1.get(i));
            }
        }

       System.out.println("without any operations: "+list1);
       System.out.println(ans);
        // now using stream
      Stream<Integer>stream=list1.stream();
      List<Integer>ans1=stream.filter(i->i>=10).collect(Collectors.toList());
      System.out.println(ans1);
      // using stream on Strings
      List<String>strings=List.of("Sumit","Sun","Sundeep","Amar","Ajay","akashay","Zeshan");
      List<String>res=strings.stream().filter(s->s.startsWith("A") && s.endsWith("y")).collect(Collectors.toList());
      System.out.println(res);
      List<String>upperCase=strings.stream().
              filter(s->s.startsWith("S")).
              map(String::toUpperCase).
              collect(Collectors.toList());
        System.out.println("Find the String starting with s and convert it to upperCase: "+upperCase);

//using map method to square each number
        List<Integer>num=List.of(1,6,5,3,2,57,8,5,3);
        List<Integer>square=num.stream().map(e->{return e*e;}).collect(Collectors.toList());
        System.out.println("Square of each element of list "+num+"\nis: "+square);
        System.out.println(num);
        num.stream().sorted((a,b)->{return b-a;}).forEach(System.out::println);
    }
}
