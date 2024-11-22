import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class day4{
  public static void main(String[] args) {
    System.out.println(room("rooms.txt"));
    }

  public static int room(String filename){
    File file = new File(filename);
    try{
      Scanner input = new Scanner(file);
      int sum = 0;
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      while(input.hasNextLine()){
        ArrayList<String> arr = new ArrayList<String>();
        String a = input.next();
        for(int i = 0; i<a.length();i++){
          if(a.charAt(i))
        }
        sum++;
      }
      return sum;
    }
    catch(FileNotFoundException ex){
      System.out.println("File not found");
      return 0;
    }
  }
}
