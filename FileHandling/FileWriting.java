package FileHandling;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
public class FileWriting {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {
        FileWriter f1 = new FileWriter("/Users/sumit/Desktop/TestFileHandling/secondTest.txt",true);
        System.out.println("Enter the content to write in the file");
        String str = scan.nextLine();
        f1.write(str+"\n");
        f1.flush();
        System.out.println("Successfully written...");
        f1.close();
        }catch(IOException e){
            System.out.println(e);
        }
        // file reader
        try(BufferedReader br = new BufferedReader(new FileReader("/Users/sumit/Desktop/TestFileHandling/secondTest.txt"))){
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
