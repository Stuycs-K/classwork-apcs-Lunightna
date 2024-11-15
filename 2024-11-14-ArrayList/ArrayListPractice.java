import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String>createRandomArray (int size){
    ArrayList<String> arr = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      arr.add("" + (int)(Math.random() * 10));
      if (arr.get(i).equals("0")) {
        arr.set(i, "");
      }
    }
    return arr;
  }
}
