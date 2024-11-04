import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class TriangleTester {
  public static void main(String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }

  public static int countTrianglesA(String filename){
    File file = new File(filename);
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

  public static boolean checkTriangle(int a, int b, int c){
    return ((a+b>c)&&(a+c>b)&&(a+c>b));
  }

  public static int countTrianglesB(String filename){
    File file = new File(filename);
    try {
      Scanner input = new Scanner(file);
      int count = 0;
      int num = 0;
      ArrayList<Integer> arr1 = new ArrayList<>();
      ArrayList<Integer> arr2 = new ArrayList<>();
      ArrayList<Integer> arr3 = new ArrayList<>();
      while(input.hasNext()){
        arr1.add(input.nextInt());
        arr2.add(input.nextInt());
        arr3.add(input.nextInt());
        num++;
        if(num%3==0){
          if(checkTriangle(arr1.get(num-1), arr1.get(num-2), arr1.get(num-3))){
            count++;
          }
          if(checkTriangle(arr2.get(num-1), arr2.get(num-2), arr2.get(num-3))){
            count++;
          }
          if(checkTriangle(arr3.get(num-1), arr3.get(num-2), arr3.get(num-3))){
            count++;
          }
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
