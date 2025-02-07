import java.util.*;
public class move_zero_ {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0};
        int ind=0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]!=0){
                int temp= arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
                ind++; 
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
