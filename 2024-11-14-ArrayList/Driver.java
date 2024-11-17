import java.util.ArrayList;

public class Driver{
  public static void main(String[] args) {
    ArrayList<String> arr = ArrayListPractice.createRandomArray(10);
    System.out.println(arr);
    ArrayListPractice.replaceEmpty(arr);
    System.out.println(arr);
    System.out.println(ArrayListPractice.makeReversedList(arr));
    ArrayList<String> arr1 = ArrayListPractice.createRandomArray(10);
    System.out.println(arr1);
    System.out.println(ArrayListPractice.mixLists(arr, arr1));
  }
}
