public class Problem5{

  public static boolean evenlyDivisible(int n){
    for(int i=1; i<=20; i++){
      if(n%i!=0){
        return false;
      }
    }
    return true;
  }

  public static void main (String[] args){
    int n=1;
    while (n!=0) {
      if(evenlyDivisible(n)){
        System.out.println(n);
        System.exit(0);
      }
      n++;
    }
  }
}
