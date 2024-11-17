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

public static void replaceEmpty(ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for(int i = 0; i<original.size(); i++){
    if(original.get(i).equals("")){
      original.set(i, "Empty");
    }
  }
}

public static ArrayList<String> makeReversedList(ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
  ArrayList<String> arr = new ArrayList<String>(original.size());
  for (int i = original.size()-1; i>-1; i--){
    arr.add(original.get(i));
  }
  return arr;
} 

}
