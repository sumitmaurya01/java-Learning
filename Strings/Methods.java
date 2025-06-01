package Strings;

public class Methods {
    public static void main(String[] args){
        String s1 = "Sumit";
        String s2 = " SuMIt ";
        System.out.println("s1 ="+s1+"\ns2 ="+s2);
        System.out.println("Length : \ns1 ="+s1.length()+"\ns2 ="+s2.length());
        s2=s2.trim();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("After trim");
        System.out.println("s1 ="+s1+"\ns2 ="+s2);
        System.out.println("Length : \ns1 ="+s1.length()+"\ns2 ="+s2.length());
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        String str = "        "; // string with spaces are not an empty string
        System.out.println("before trim length = "+str.length()+ " is Empty = "+str.isEmpty());
        str=str.trim();
        System.out.println(" after trim lenght = "+str.length() +" is empty = "+str.isEmpty() );
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
        System.out.println("Equals ");
        s1 = "RaN"; s2="Raz";
        System.out.println("is s1 == s2 "+s1.equals(s2));
        System.out.println("is s1 euqals s2 ignore case  ="+s1.equalsIgnoreCase(s2));
        System.out.println("compare s1 and s2 "+s1.compareTo(s2));
        System.out.println("compare s1 and s2 ignore case  "+s1.compareToIgnoreCase(s2));
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        //System.out.println("sumit"+10-5);
        System.out.println("sumit"+10*5);
        s1="sumit";s2=" Maurya"; String s3 = "Sum";

        System.out.println(s1.concat(s2));
        System.out.println(String.join("_ADIT_",s1,s2,s3));
// subSequence and substring
        s1="this is demo string";
        System.out.println(s1);
        System.out.println("Subsequence-> "+s1.subSequence(3,10));
        System.out.println("subString with beginning idx ->"+s1.substring(3));
        System.out.println("subString with beginning and end idx ->"+s1.substring(3,10));
        CharSequence ch = "charSequence";
        String str1="String";
        System.out.println(ch);
        System.out.println(str1);

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        // replace  , replace first , replaceAll
        // replace -> replace all the words or character with the given(new word/char)
        // replaceFirst -> replaces the first occurrence of the given word
        // replaceAll -> replaces all the occurrence of the given word and it takes regex ((.) , (.*))
        str = "this is demp";
        System.out.println("STRING -> "+str);
        System.out.println("replace-> "+str.replace("is","WAS"));
        System.out.println("replace first->"+str.replaceFirst("is","WAS"));
        System.out.println("replace all-> "+str.replaceAll("is","WAS"));//replace all without regex
        System.out.println("replace all -> "+str.replaceAll("is(.)","WAS"));//replace all with regex
        System.out.println("Replace all -> "+str.replaceAll("is(.*)","WAS"));//replace all with regex


    }
}
