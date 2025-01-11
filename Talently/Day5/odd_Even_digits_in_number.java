import java.util.Scanner;

public class odd_Even_digits_in_number{
    public static void main(String[] args) {
    //Q: Print all the odd and even digits in a given number
    Scanner  s = new Scanner(System.in);
    int num = s.nextInt();
    for(char c : String.valueOf(num).toCharArray()){
      int dig = Character.getNumericValue(c);
      if(dig%2==0){
        System.out.println(dig+"-"+"Even");}
      else{System.out.println(dig+"-"+"Odd");}  
    }
  }
}
    