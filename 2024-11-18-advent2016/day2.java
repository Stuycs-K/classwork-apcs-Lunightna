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
      int x = 1;
      int y = 1;
      String code = "";
      int[][] keypad = {{1, 4, 7}, {2, 5, 8}, {3,6,9}};
      while(input.hasNextLine()){
        String a = input.next();
        for(int i = 0; i<a.length();i++){
          if(a.charAt(i)=='R'){
            x++;
            if(x>2){
              x--;
            }
          }
          if(a.charAt(i)=='L'){
            x--;
            if(x<0){
              x++;
            }
          }
          if(a.charAt(i)=='U'){
            y--;
            if(y<0){
              y++;
            }
          }
          if(a.charAt(i)=='D'){
            y++;
            if(y>2){
              y--;
            }
          }
        }
        code = code + "" + keypad[x][y];
      }
      return code;
    }
    catch(FileNotFoundException ex){
      System.out.println("File not found");
    }
    return null;
  }
}
