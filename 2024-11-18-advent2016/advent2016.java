import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class advent2016{
  public static void main(String[] args) {
    System.out.println(taxicabA("taxicab.txt"));
    }
  public static Integer taxicabA(String filename){
    File file = new File(filename);
    try {
      Scanner input = new Scanner(file);
      input.useDelimiter(",\\s*");
      int cordx = 0;
      int cordy = 0;
      int direction = 0;
      while(input.hasNext()){
        String a = input.next();
        if(a.charAt(0)==('R')){
          direction++;
        }
        if(a.charAt(0)==('L')){
          direction--;
        }
        direction = (direction + 4) % 4;
        int unit = Integer.parseInt(a.substring(1));
        if(direction==0){
          cordy += unit;
        }
        if(direction==1){
          cordx += unit;
        }
        if(direction==2){
          cordy -= unit;
        }
        if(direction==3){
          cordx -= unit;
        }
      }
      return Math.abs(cordx) + Math.abs(cordy);
    }
    catch(FileNotFoundException ex){
      System.out.println("File not found");
      return 0;
    }
  }

  public static String bathroomA(String filename){
    File file = new File(filename);
    try{
      Scanner input = new Scanner(file);
      while(input.hasNextLine()){
        String a = input.next();
        a.split();
        return a;
      }
    }
    catch(FileNotFoundException ex){
      System.out.println("File not found");
      return "";
    }
  }
}
