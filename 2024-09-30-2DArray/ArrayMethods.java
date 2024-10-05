//Vanna Lei; vlei60@stuy.edu and Harrison Lee; hlee60@stuy.edu
public class ArrayMethods {
  //1. Write both your names + emails at the top of the document as a comment.

//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
public static void main(String[] args){
  int[][] arr1 = {{1, -2, 3}, {4,-5,6}};
  int[][] arr2 = {{-7, 8, -9}, {0, -1}, {8}};
  int[][] arr3 = {{}};
  int[][] arr4 = {{1, 2, 3}, {4, 5, 6}};
  int[][] arr5 = {{1, 2}, {3, 4}, {5, 6}};
  System.out.println(arrToString(arr1));//test arrToString
  System.out.println(arrToString(arr2));
  System.out.println(arrToString(arr3));
  System.out.println(arr2DSum(arr1));//test arr2Dsum
  System.out.println(arr2DSum(arr2));
  System.out.println(arr2DSum(arr3));
  replaceNegative(arr1);//test replaceNegative
  replaceNegative(arr2);
  replaceNegative(arr3);
  System.out.println(arrToString(arr1));
  System.out.println(arrToString(arr2));
  System.out.println(arrToString(arr3));
  System.out.println(arrToString(swapRC(arr1)));//test swapRC
  System.out.println(arrToString(swapRC(arr4)));
  System.out.println(arrToString(swapRC(arr5)));
  int[][] copyarr1 = copyrow(arr1); //test copy 
  System.out.println(arrToString(arr1)); //og
  System.out.println(arrToString(copyarr1)); // copied
  arr1[0][0] = 2; //change
  System.out.println(arrToString(arr1)); //og should change
  System.out.println(arrToString(copyarr1)); //og should stay the same
  int[][] copyarr2 = copy(arr2);
  System.out.println(arrToString(arr2));
  System.out.println(arrToString(copyarr2));
  arr2[0][0] = 2;
  System.out.println(arrToString(arr2));
  System.out.println(arrToString(copyarr2));
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
    for (int idx = 0; idx < ary[i].length; idx++){
      if(idx==ary[i].length-1){
        newStr += ary[i][idx];
      }
      else{
        newStr = newStr + (ary[i][idx] + ", ");
      }
    }
    newStr += "]";
    if (i < ary.length - 1){
      newStr += ", ";
    }
  }
  newStr += "]";
  //this should use arrToString(int[])
  return newStr;
}


/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
  int sum = 0;
  for (int i = 0; i < nums.length; i++){
    for (int idx = 0; idx < nums[i].length; idx ++){
      sum += nums[i][idx];
    }
  }
  return sum;
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  int[][] newarr = new int[nums[0].length][nums.length];
  for(int i = 0; i<nums.length; i++){
    for(int idx = 0; idx<nums[0].length; idx++){
      newarr[idx][i] = nums[i][idx];
    }
  }
  return newarr;
}

//3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0

public static void replaceNegative(int[][] vals){
  for(int i = 0; i < vals.length; i++) {
    for(int idx = 0; idx < vals[i].length; idx++) {
      if (i == idx && vals[i][idx] < 0) {
        vals[i][idx] = 1;
      }
      else if (vals[i][idx]<0){
        vals[i][idx] = 0;
      }
    }
  }
}


//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
public static int[] copyinner(int[]nums){
  int[] copyrow = new int[nums.length];
  for (int i=0; i<nums.length; i++){
    copyrow[i] = nums[i];
  } 
  return copyrow;
} 

public static int[][] copy(int[][] nums){
  int[][] copy = new int[nums.length][];
  for (int i = 0; i<nums.length; i++){
    copy[i] = copyinner(nums[i]);
  }
  return copy;//placeholder so it compiles
}

}