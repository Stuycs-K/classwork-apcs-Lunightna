//Vanna Lei; vlei60@stuy.edu and Harrison Lee; hlee60@stuy.edu
public class ArrayMethods {
  //1. Write both your names + emails at the top of the document as a comment.

//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
public static void main(String[] args){
  arr1 = {{1, 2, 3}, {4,5,6}}
  arr2 = {{7, 8, 9}, {0, 1}, {8}}
  arr3 = {{}};
  System.out.printlnarrToString(arr1));
  System.out.println(arrToString(arr2));
  System.out.println(arrToString(arr3));
}
public static String arrToString(int[]ary){
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

//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  String newStr = "[";
  for (int i = 0; i < ary.length; i++) {
    newStr += "[";
    for (int idx = 0; idx < ary[i]; i++){

    }
    newStr += "]";
  }
  }
  //this should use arrToString(int[])
  return "";
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}
}
