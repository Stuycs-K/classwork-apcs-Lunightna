import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class advent2016{
  public static void main(String[] args) {
    System.out.println(taxicab("inputTri.txt"));
  }
public static String taxicab(String filename){
  File file = new File(filename);
  try {
    Scanner input = new Scanner(file);
    int cordx = 0;
    int cordy = 0;
    int direction = 0;
    while(input.hasNext()){
      String a = input.next();
      if(a[0]=="R"){
        direction++;
      }
      if(a[0]=="L"){
        direction--;
      }
      direction %= 4;
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

  }
  catch(FileNotFoundException ex){
    System.out.println("File not found");
    return "";
  }
  return "";
  }
}
