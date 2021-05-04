public class Problem1{
  //sum of all multiples of 3 and 5 up until 1000
  public static void main (String[] args){
    int n=1000, sum=0;
    for(int i=0; i<n; i++){
      if(i%3==0 || i%5==0) sum+=i;
    }
    System.out.println("sum = "+sum);
  }
}
