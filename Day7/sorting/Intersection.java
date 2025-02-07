import java.util.ArrayList;

public class Intersection {

     public static void main(String[] args) {
         int[] array1 = {1, 2, 3, 4,4};
         int[] array2 = {3, 4, 5, 6};
        ArrayList<Integer> arr = new ArrayList<>();
         for(int i =0; i<array1.length;i++){
            for(int j =0; j<array2.length;j++){
                if(array1[i]==array2[j] && !arr.contains(array1[i])){
                    arr.add(array1[i]);
                }
            }
         }
         System.out.println(arr);
     }
}
