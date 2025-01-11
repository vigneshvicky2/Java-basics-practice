import java.util.*;
public class prime_digits_in_number{
  public static void main(String[] args){
    //Q: Print all the prime digits in a given number
    Scanner s = new Scanner(System.in);
    String num = s.nextLine();
    for(int j=0;j<num.length();j++){
      char dig_char = num.charAt(j);
      int dig = Character.getNumericValue(dig_char);
      if(isprime(dig)){
       System.out.print(dig + " "); 
    }
  }
}
public static boolean isprime(int n){
  if(n<=1) return false;
  for(int i =2 ;i<=Math.sqrt(n);i++){
    if(n%i==0){
      return false;
    }
  }
  return true;
}
}