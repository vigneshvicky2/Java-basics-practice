// Complete the function rotate(), which receives the number of elements , 
//array and number of rotations. Do Rotate the given array to its left for number of rotation times.
// EXAMPLE:
// 8  -> size
// 1 2 3 4 5 6 7 8 -> array elements
// 6 -> number of roations
// o/p
// 7 8 1 2 3 4 5 6
import java.util.*;
public class rotate_array {

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int length = s.nextInt();
    int[] arr = new int[length];
    for(int i =0;i<length;i++){
      arr[i] = s.nextInt();
    }
    int n = s.nextInt();
    rotate(n,arr,length);
    for(int i =0 ; i<length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void rotate(int n , int[] arr, int length){
     n = n% length;
    if(n<0){
      n +=length;
    }
    int[] result = new int[length];
    for(int i =0 ; i< length ; i++){
      result[i] = arr[(i+n)%length];
    }
    System.arraycopy(result,0,arr,0,length);
  }
}

