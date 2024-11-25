import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class day1{
  public static void main(String[] args) {
    System.out.println(taxicabA("taxicab.txt"));
    System.out.println(taxicabB("taxicab.txt"));
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
  public static Integer taxicabB(String filename){
    File file = new File(filename);
    try {
      Scanner input = new Scanner(file);
      input.useDelimiter(",\\s*");
      int cordx = 0;
      int cordy = 0;
      int direction = 0;
      ArrayList<String> passed = new ArrayList<String>();
      passed.add(cordx + "," + cordy);
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
        for(int i = 0; i < unit; i++){
          if(direction==0){
            cordy ++;
            if(passed.contains(cordx +","+ cordy)){
              return Math.abs(cordx) + Math.abs(cordy);
            }
            else{
              passed.add(cordx +","+ cordy);
            }
            }
          if(direction==1){
            cordx ++;
            if(passed.contains(cordx +","+ cordy)){
              return Math.abs(cordx) + Math.abs(cordy);
            }
            else{
              passed.add(cordx +","+ cordy);
            }
          }
          if(direction==2){
            cordy --;
            if(passed.contains("" + cordx +","+ cordy)){
              return Math.abs(cordx) + Math.abs(cordy);
            }
            else{
              passed.add("" + cordx +","+ cordy);
            }
          }
          if(direction==3){
            cordx --;
            if(passed.contains("" + cordx +","+ cordy)){
              return Math.abs(cordx) + Math.abs(cordy);
            }
            else{
              passed.add("" + cordx +","+ cordy);
            }
          }
        }
      }
      return Math.abs(cordx) + Math.abs(cordy);
    }
    catch(FileNotFoundException ex){
      System.out.println("File not found");
      return 0;
    }
  }
}
