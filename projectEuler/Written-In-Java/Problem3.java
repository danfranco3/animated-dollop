import java.lang.Math;

public class Problem3{
  //Checking if a number is Prime
  public static boolean isPrime (long n){
    for(long i=2; i<=Math.sqrt(n); i++){
      if(n%i==0) return false;
    }
    return true;
  }
  //finding greatest prime factor:
  public static void main (String[] args){
    long n = 600851475143L;
    long greatestPrime=0;
    for(long i=1; i<=n; i++){
      if(isPrime(i) && n%i==0){
        n/=i;
        greatestPrime=i;
      }
    }
    System.out.println("greatestPrime = " + greatestPrime);
  }
}
