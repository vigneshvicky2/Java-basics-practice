// Given the size of array and array values to function arr_reverse(),
// write a code to reverse the given array.
import java.util.*;
public class reverse_array_without_extra_array {
  static void array_reverse(int arr[], int size)
  {
    for(int i =0 ; i< size/2 ; i++){ // without using extra array
      int temp = arr[i];
      arr[i] = arr[ size - i -1];
      arr[size - i - 1] = temp;
    }
  }
  public static void main(String[] args)
  {
    int ind,size;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0;ind<size;ind++)
    {
      arr[ind]=sc.nextInt();
    }
    array_reverse(arr,size);
    for(ind=0;ind<size;ind++)
      System.out.print(arr[ind]+" ");
  }
}

