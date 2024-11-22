import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class day3{
  public static void main(String[] args) {
    System.out.println(room("rooms.txt"));
    }

  public static String room(String filename){
    File file = new File(filename);
    try{
      Scanner input = new Scanner(file);
    }
    catch(FileNotFoundException ex){
      System.out.println("File not found");
      return "";
    }
  }
}