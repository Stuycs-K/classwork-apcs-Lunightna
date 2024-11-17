import java.util.ArrayList;

public class Driver{
  public static void main(String[] args) {
    ArrayList<String> arr = ArrayListPractice.createRandomArray(10);
    System.out.println("arr random array: " + arr);
    ArrayListPractice.replaceEmpty(arr);
    System.out.println("Replace empty in arr: " + arr);
    System.out.println("Reveresed arr: " + ArrayListPractice.makeReversedList(arr));
    ArrayList<String> arr1 = ArrayListPractice.createRandomArray(10);
    ArrayList<String> arr2 = ArrayListPractice.createRandomArray(5);
    ArrayList<String> arr3 = ArrayListPractice.createRandomArray(12);
    System.out.println("arr1: " + arr1);
    System.out.println("arr2: " + arr2);
    System.out.println("arr3: " + arr3);
    System.out.println("Testing mixlist(arr, arr1): " + ArrayListPractice.mixLists(arr, arr1));
    System.out.println("Testing mixlist(arr1, arr2): " + ArrayListPractice.mixLists(arr1, arr2));
    System.out.println("Testing mixlist(arr3, arr3): " + ArrayListPractice.mixLists(arr2, arr3));
  }
}
