package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterLoopBased {
    public static void main(String args[]){
        try(FileWriter f1 = new FileWriter("/Users/sumit/Desktop/TestFileHandling/Hey.txt")){
            for(int i=1 ; i<=1000; i++){
                String str = (i + " . HELLO BROTHER....\n");
                f1.write(str);
            }
            System.out.println("Successfully written ");
        }catch(IOException e){
            e.getMessage();
        }
    }
}
