import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String>createRandomArray (int size){
    ArrayList<String> arr = new ArrayList<>(size);
    for(int i = 0; i < size; i++) {
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
  for(int i = original.size()-1; i>-1; i--){
    arr.add(original.get(i));
  }
  return arr;
} 
public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  ArrayList<String> arr = new ArrayList<String>(a.size()+b.size());
  int min = Math.min(a.size(), b.size());
  for(int i = 0; i<min; i++){
    arr.add(a.get(i));
    arr.add(b.get(i));
    }
  for(int i = min; i < a.size(); i++){
    arr.add(a.get(i));
  } 
  for(int i = min; i < b.size(); i++){
    arr.add(b.get(i));
  } 
  return arr;
  }
}

/*
Original/ less simplifed version
  if(a.size()>b.size()){
    for(int i = 0; i<b.size(); i++){
      arr.add(a.get(i));
      arr.add(b.get(i));
      }
    for(int idx = b.size(); idx<a.size(); idx++){
      arr.add(a.get(idx));
    }
    return arr;
  }
  if(b.size()>a.size()){
    for(int i = 0; i<a.size(); i++){
      arr.add(a.get(i));
      arr.add(b.get(i));
      }
    for(int idx = a.size(); idx<b.size(); idx++){
      arr.add(a.get(idx));
    }
    return arr;
  }
  else{
    for(int i = 0; i<a.size(); i++){
      arr.add(a.get(i));
      arr.add(b.get(i));
      }
    return arr;
  }
  */