public class fib{
  public static int fibseq(int n){
    if(n<2){
      return n;
    }
    else{
      return fibseq(n-1) + fibseq(n-2);
    }
  }
  public static void main(String[] args) {
    System.out.println(fibseq(46)); //46 is largest under 10 secs and largest n that fits in an int
  }
}
