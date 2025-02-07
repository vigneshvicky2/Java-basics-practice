import java.util.*;
public class unique_element {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
            if(en.getValue()==1){
                System.out.print(en.getKey()+" ");
            }
        }
        

    }
}
