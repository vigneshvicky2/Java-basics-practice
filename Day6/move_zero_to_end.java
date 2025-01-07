
import java.util.Arrays;

public class move_zero_to_end {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        int n =arr.length;
        int arr1[] = new int[n];
        
        int ind =0; 
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                arr1[ind] = arr[i];
                ind++;
                }
            }
            System.out.print(Arrays.toString(arr1));
        //swapping_method(arr);        
    }
    public static void swapping_method(int[] arr) {
        
        int len_arr = arr.length;
        int index=0;
        for(int i =0;i<len_arr;i++){
            if(arr[i]!=0){
            int temp_value =arr[i];
            arr[i]=arr[index];
            arr[index]=temp_value;
            index++;
            }
            
        }
        System.out.println(Arrays.toString(arr));
        
        }
        
    }
    

    