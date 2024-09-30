public class MyArrays{
  public static void main(String[] args) {
    int[] ary = {1, 2, 3}; //test arrayToString
    int [] ary1a = {};
    int [] ary2a = {1};
    int [] ary3a = {1, 2};
    System.out.println(arrayToString(ary));
    System.out.println(returnCopy(ary));

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
    int[] newarr = new int[ary.length];
    for(int i=0; i<ary.length;i++){
      newarr[i] = ary[i];
    }
    return newarr;
  }

  public static int[] concatArray(int[]ary1,int[]ary2){
    return null;
  }
}
