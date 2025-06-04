package ThrowsKeyword;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

 class FileException {
   static  void FileReader() throws FileNotFoundException,IOException{

           BufferedReader b1 = new BufferedReader(new FileReader("/Users/sumit/Desktop/TestFileHandling/Student.txt"));

           String line;
           while((line = b1.readLine()) != null){
               System.out.println(line);
           }
   }
   public static void main(String[] args){
       FileException f1 = new FileException();
      // f1.FileReader(); // if we uses it outside the try it may throw exception so we have to use it
       // inside the try
      try {
          f1.FileReader();
      }
      catch(FileNotFoundException e){
          System.out.println(e);
      }
      catch(IOException e){
          System.out.println(e);
      }

   }
}
