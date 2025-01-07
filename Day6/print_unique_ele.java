
import java.util.ArrayList;

public class print_unique_ele {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,4,4,6,7,6};
        ArrayList<Integer> s = new ArrayList<>();

        int count = 0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                else if(!s.contains(arr[i])){
                    s.add(arr[i]);
                }
            }   
    }
    System.out.println(s);
    }
}
