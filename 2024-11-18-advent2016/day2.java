import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class day2{
  public static void main(String[] args) {
    bathroomA("bathroom.txt");
    }

  public static String bathroomA(String filename){
    File file = new File(filename);
    try{
      Scanner input = new Scanner(file);
      while(input.hasNextLine()){
        String a = input.next();
        System.out.println(a);
      }
    }
    catch(FileNotFoundException ex){
      System.out.println("File not found");
      return null;
    }
    return null;
  }
}
