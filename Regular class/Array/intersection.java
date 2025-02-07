
import java.util.*;

public class intersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 ={2,3,4};
        int[] arr3 = {3,4};
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        for( i =0; i<arr1.length;i++){
            for(j =0; j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    for(k =0; k<arr3.length;k++){
                        if(arr1[i]==arr3[k]){
                            list.add(arr1[i]);
                        }
                    }
                }
            }
        }
        System.out.print(list);
    }
}
