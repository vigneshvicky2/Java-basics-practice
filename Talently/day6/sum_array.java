// Write a program to  which receives number of elements and array,  
//do replace every element in the array with the sum of  its left side elements and return the same array. 
// Note:Dont use extra arrays

import java.util.Scanner;

public class sum_array {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in); // Eg i/p n =5 1,2,3,4,5 o/p 0,1,3,6,10
    int n = s.nextInt();
    int temp;
    int[] arr = new int[n+1];
    arr[0] =0;
    for(int i =1 ; i<=n;i++){
      arr[i] = s.nextInt();
    }
    int sum = arr[0] + arr[1];
    for(int i =1;i<n;i++){
      arr[i] +=arr[i-1];
    }
    for(int i =0; i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
    
}
