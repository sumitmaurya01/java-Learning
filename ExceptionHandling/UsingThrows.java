package ExceptionHandling;
import java.io.File;
import java.io.*;
/***
 * in throws first we make a method which could throw exception
 * and then if we use that method then it will remind us to handle
 * that exception through catch
 **/
public class UsingThrows{
    static class ReadAndWrite {
        public void readFile() throws FileNotFoundException {
            FileInputStream fis = new FileInputStream("abcd.txt");
            // additional reading logic here
        }

        public void writeFile() throws FileNotFoundException {
            FileOutputStream fos = new FileOutputStream("abcd.txt");
            // additional writing logic here
        }
    }
public static void main(String[] args){
        ReadAndWrite rw = new ReadAndWrite();
        try {
            rw.readFile();

        }catch(FileNotFoundException e){
            System.out.println("File Not Found to read ");
            e.printStackTrace();
        }

        //write
    try{
        rw.writeFile();
    }
    catch(FileNotFoundException e){
        System.out.println("File not found to write ..");
        System.out.println(e);
    }
}
}
