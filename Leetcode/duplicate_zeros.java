import java.util.*;
public class duplicate_zeros {
    public static void main(String[] args) {
        // Input: arr = [1,0,2,3,0,4,5,0]
        // Output: [1,0,0,2,3,0,0,4]
        int[] arr = {1,0,2,3,0,4,5,0};
        for(int i =1;i<arr.length;i++){
            if(arr[i-1]==0){
                move_next(i, arr);
                i++;
            }
        }
         
        System.out.println(Arrays.toString(arr));   
    }
    public static void move_next(int start,int[] arr) {
        for(int i = arr.length-1;i>start;i--){
            arr[i]=arr[i-1];
        }
        arr[start]=0; 
    }
}
