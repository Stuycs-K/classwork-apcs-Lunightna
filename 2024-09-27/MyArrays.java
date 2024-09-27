public class MyArrays{
  public static void main(String[] args) {
    int[] ary = {1, 2, 3};
    System.out.println(arrayToString(ary));
  }
  public static String arrayToString(int[]ary){
    String newstr = "[";
      for (int i=0; i<ary.length;i++){
        if (i == ary.length-1){
            newstr += ary[i];
        }
        else{
          newstr = newstr + (ary[i] + ", ");
        }
      }
    return newstr + "]";
}
  public static int[] returnCopy(int[]ary){
    return null;
  }
}
