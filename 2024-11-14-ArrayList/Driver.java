import java.util.ArrayList;

public class Driver{
  public static void main(String[] args) {
    System.out.println(ArrayListPractice.createRandomArray(10));
    ArrayList<String> arr = new ArrayList<>(10);
    arr.add("1");
    System.out.println(arr);
  }
}
