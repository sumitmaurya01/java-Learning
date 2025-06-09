package FileHandling;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
public class FileReaderAndWrite {
    static void readFile(String path){
        // BufferedReader reads line by line
        // FileReader reads char by char


        try(BufferedReader r1 = new BufferedReader(new FileReader(path))){
//            System.out.println("it reads line by line");
            String line;
            while((line = r1.readLine()) != null) {
                System.out.println(line);
            }
        r1.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found...");
        }
        catch(IOException e){
            System.out.println(e);
        }


        // read char by char
//
//        try(FileReader f1 = new FileReader(path)){
//            //System.out.println("It reads char by char ");
//            int ch;
//            while ((ch = f1.read()) != -1) {
//                System.out.print((char)ch);
//            }
//            f1.close();
//        }
//        catch(IOException e){
//            System.out.println(e);
//        }
    }
    static void writeFile(String path,Scanner sc){
        try(FileWriter f1 = new FileWriter(path,true)){
            String content;
            System.out.println("Enter content to write in the file..");
            content = sc.nextLine();
            f1.write(content+"\n");
            f1.flush();
            System.out.println("Successfully written in the file...");
            f1.close();
        }
        catch(IOException e){
            System.out.println("An error occurred...");
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("-- WELCOME TO FILE READER AND WRITER PROGRAM --");
        System.out.println("Enter the name of the file ...");
        String fileName=sc.nextLine()+".txt";
        String path = "/Users/sumit/Desktop/TestFileHandling/" + fileName;
        System.out.println("\t\t\t-----Enter your choice----\n\n");
        System.out.println("\t\t   1 -> Write");
        System.out.println("\t\t   2 -> Read ");
        String choice = sc.nextLine();
        switch(choice){
            case "1": {
                writeFile(path,sc);
                break;
            }
            case "2": {
                readFile(path);
                break;
            }
            default:{
                System.out.println("Invalid choice...");
            }
        }
    }
}
