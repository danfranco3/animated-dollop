public class Problem4{
  public static boolean isPalindrome(int n){
    String number = String.valueOf(n);
    int length = number.length();
    char[] reverse = new char[length];
    for(int i=0, j=length-1; i<length; i++, j--){
      reverse[i]=number.charAt(j);
    }
    String reverseNumber = String.valueOf(reverse);
    if(reverseNumber.equals(number)) return true;
    else return false;
  }

  public static void main (String[] args){
    int maxPalindrome=0;
    for(int outer = 999; outer>=100; outer--){
      for(int inner = 999; inner>=100; inner--){
        if(isPalindrome(outer*inner) && outer*inner > maxPalindrome){
          maxPalindrome=outer*inner;
        }
      }
    }
    System.out.println("maxPalindrome = " + maxPalindrome);
  }
}
