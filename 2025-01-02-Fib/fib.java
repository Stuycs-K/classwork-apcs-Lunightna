public class fib{
  public static void main(String[] args) {
    System.out.println(fibseq(46)); //46 is largest under 10 secs and largest n that fits in an int
  }

  public static int fibseq(int n){
    if(n<2){
      return n;
    }
    else{
      return fibseq(n-1) + fibseq(n-2);
    }
  }

  public static void makeWords(int remainingLetters, String result, String alphabet){
    int number = remainingLetters;
    if(remainingLetters==0){
      idx = 0;
      makeWords(number, "", alphabet.subtring(1));
    }
    else{
      for(int i = 0; i<alphabet.length();i++){
        String letter = alphabet.charAt(i);
      }
      System.out.println(result + letter));
      remainingLetters--;
    }
  }
}
