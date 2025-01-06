public class fib{
  public static void main(String[] args) {
    //System.out.println(fibseq(46)); //46 is largest under 10 secs and largest n that fits in an int
    makeNoDoubleLetterWords(3, "", "123");
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
    if(remainingLetters==0){
      System.out.println(result);
    }
    else{
      for(int i = 0; i<alphabet.length();i++){
        String letter = String.valueOf(alphabet.charAt(i));
        makeWords(remainingLetters-1, result +letter, alphabet);
      }
    }
  }

  public static void makeNoDoubleLetterWords(int remainingLetters, String result, String alphabet){
    if(remainingLetters==0){
      System.out.println(result);
    }
    else{
      for(int i=0; i<alphabet.length();i++){
        String letter = String.valueOf(alphabet.charAt(i));
        if(result.isEmpty() || !result.endsWith(letter)){
          makeNoDoubleLetterWords(remainingLetters-1, result +letter, alphabet);
        }
      }
    }
  }
}
