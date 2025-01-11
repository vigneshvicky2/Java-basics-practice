import java.util.*;
public class number_divide_by_number {
  public static void main(String[] args){
    // Given a number,  check whether the digit from a given number divides the number completely or not. 
    //If any digit divides the given number then print the digit and stop the process if not print -1.
    //NOTE: The digit order starts from left to right.
    Scanner s = new Scanner(System.in);
    Long num = s.nextLong();
    boolean flag = false;
    for(char c : String.valueOf(num).toCharArray()){
      int digit = Character.getNumericValue(c);
      if(digit==0){
        continue;}
      if(num%digit==0){
        System.out.println(digit); 
        flag = true;
        break;}  
    }
    if(!flag){
      System.out.println("-1");
    }
  }
  
}

