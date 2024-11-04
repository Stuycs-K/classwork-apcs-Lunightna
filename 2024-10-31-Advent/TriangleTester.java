import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
  }

  public static int countTrianglesA(String filename){
    File file = new File(filename);//1
    try {
      Scanner input = new Scanner(file);
      int count = 0;
      while(input.hasNext()){
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if((a+b>c)&&(a+c>b)&&(b+c>a)){
          count++;
        }
      }
      input.close();
      return count;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return 0;
    }
  }
}
