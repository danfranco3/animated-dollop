public class Problem7{

  public static boolean isPrime (int n){
    for(int i=2; i<=Math.sqrt(n); i++){
      if(n%i==0) return false;
    }
    return true;
  }

  public static void main (String[] args){
    int primes=0, number=0;
    for(int i=2; primes<=10001; i++){
      if(isPrime(i)){
        number=i;.
        primes++;
      }
    }
    System.out.println("primo 10001 = " + number);
  }
}
