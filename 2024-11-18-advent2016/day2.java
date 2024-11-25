import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class day2{
  public static void main(String[] args) {
    System.out.println(bathroomA("bathroom.txt"));
    System.out.println(bathroomB("bathroom.txt"));
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
    public static String bathroomB(String filename){
    File file = new File(filename);
    try{
      Scanner input = new Scanner(file);
      int x = 0;
      int y = 3;
      String code = "";
      char[][] keypad = {
      {' ', ' ', '1', ' ', ' '},
      {' ', '2', '3', '4', ' '},
      {'5', '6', '7', '8', '9'},
      {' ', 'A', 'B', 'C', ' '},
      {' ', ' ', 'D', ' ', ' '}};
      while(input.hasNextLine()){
        String a = input.nextLine();
        for(int i = 0; i<a.length();i++){
          if(a.charAt(i)=='R'){
            x++;
            if(((y==0 || y==4) && x>2) ||((y==1 || y==3) && x>3) || (y==2 && x>4)){
              x--;
            }
          }
          if(a.charAt(i)=='L'){
            x--;
            if(((y==0 || y==4) && x<2) ||((y==1 || y==3) && x<1) || (y==2 && x<0)){
              x++;
            }
          }
          if(a.charAt(i)=='U'){
            y--;
            if(((x==0 || x==4) && y<2) ||((x==1 || x==3) && y<1) || (x==2 && y<0)){
              y++;
            }
          }
          if(a.charAt(i)=='D'){
            y++;
            if(((x==0 || x==4) && y>2) ||((x==1 || x==3) && y>3) || (x==2 && y>4)){
              y--;
            }
          }
        }
        code = code + "" + keypad[y][x];
      }
      return code;
    }
    catch(FileNotFoundException ex){
      System.out.println("File not found");
    }
    return null;
  }
}
