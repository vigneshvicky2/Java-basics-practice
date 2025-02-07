import java.util.*;
public class merge{
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3}; // o/p {1,1,1,2,3,3,5,10}   
        int[] arr2 = {1,1,3,5,10};
        int[] arr3 = new int[arr1.length+arr2.length];
        for(int i =0;i<arr1.length;i++){
            arr3[i] = arr1[i];           
        }
        for(int i =0;i<arr2.length;i++){
            arr3[arr1.length+i] = arr2[i];
        }
        for(int i =0 ; i<arr3.length;i++){
            for(int j =0; j<arr3.length;j++){
                if(arr3[i]<arr3[j]){
                    int temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j]=temp;
                }
            }
            
        }
        System.out.println(Arrays.toString(arr3));
    }
}