import java.util.ArrayList;
import java.util.Arrays;

public class susequnce {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,1};
        int total_sum =0;
        int sum =0;
        ArrayList<Integer> ans1 =new ArrayList<>();
        ArrayList<Integer> ans2 =new ArrayList<>();
        int mid;
        Arrays.sort(arr);
        if(arr.length%2!=0){
            mid= (arr.length/2)+1;
        }
        else{
            mid= arr.length/2;
        }
        for(int i=0;i<mid;i++){
            ans1.add(arr[i]);
        }
        for(int i=mid;i<arr.length;i++){
            ans2.add(arr[i]);
        }
        System.out.println(ans1);
        System.out.println(ans2);

    }
}
