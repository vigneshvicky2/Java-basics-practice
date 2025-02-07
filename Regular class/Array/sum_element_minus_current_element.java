import java.util.*;
public class sum_element_minus_current_element {
    public static void main(String[] args) {
        int[] arr ={7,6,2,3};
        int[] res = new int[arr.length];
        int sum =0;
        for(int i =0; i<arr.length;i++){
            sum+=arr[i];
        }                                        
        for(int i =0; i<arr.length;i++){
            res[i] = sum-arr[i];
        }
        System.out.println(Arrays.toString(res));
        
    }
}
