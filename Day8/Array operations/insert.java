import java.util.*;
public class insert{
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5};
        int[]  arr2 = new int[arr.length+1]; 
        int ind =0;
        for(int i = 0; i < arr.length; i++){
            if(i==2){
                arr2[ind++] = 6;
                arr2[ind++] = arr[i];
            }
            else{
                arr2[ind++] = arr[i];
            }
            
        }
        System.out.println(Arrays.toString(arr2));
    }
}