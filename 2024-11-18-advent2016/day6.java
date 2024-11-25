import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class day6{
  public static void main(String[] args) {
    System.out.println(message("message.txt"));
    }

  public static String message(String filename){
    File file = new File(filename);
    try{
      Scanner input = new Scanner(file);
      String message = "";
      while(input.hasNextLine){
        String a = input.nextLine();
        int columns = a.length();
        ArrayList<Integer>[] arr = new ArrayList[columns];
        for(int amt = 0; amt<columns; amt++){
            arr[amt] = new ArrayList<>();
        }
        for(int i = 0; i<columns; i++){
            arr[i].add((int) a.charAt(i));
        }
      }
          
        message = message + "";
        input.close();
        return message;
      }
    catch(FileNotFoundException ex){
      System.out.println("File not found");
    }
    return null;
  }
}
