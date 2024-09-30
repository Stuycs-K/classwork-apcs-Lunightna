public class MyArrays{
  public static void main(String[] args) {
    int[] ary = {1, 2, 3}; //test arrayToString
    int [] ary1a = {};
    int [] ary2a = {1};
    int [] ary3a = {1, 2};
    System.out.println(arrayToString(ary));
    System.out.println(arrayToString(returnCopy(ary1a)));
    System.out.println(arrayToString(returnCopy(ary2a)));
    System.out.println(arrayToString(returnCopy(ary3a)));
    System.out.println(arrayToString(concatArray(ary3a,ary2a)));
    System.out.println(arrayToString(concatArray(ary1a,ary2a)));
    System.out.println(arrayToString(concatArray(ary,ary3a)));
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
    int[] newarr = new int [ary1.length+ary2.length];
    int count = 0;
    for(int i=0; i<ary1.length;i++){
      newarr[count]=ary1[i];
      count++;
    }
    for(int i=0; i<ary2.length;i++){
      newarr[count]=ary2[i];
      count++;
    }
  return newarr;
}
}
