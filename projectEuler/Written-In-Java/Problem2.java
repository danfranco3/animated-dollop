public class Problem2{
  //sum of all even numbers of fibonacci sequence up until 4M
  public static void main (String[] args){
    final int n = 4000000;
    int sum = 0, fib=1, i=1; //fib = current number of the sequence, i is the past one.
    while(fib<n){
      if(fib%2==0) sum+=fib;
      int aux = fib;
      fib+=i;
      i = aux;
    }
    System.out.println("Sum = " + sum);
  }
}
