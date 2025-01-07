import java.util.ArrayList;

public class remove_duplicate_ele {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        ArrayList<Integer> arr1 = new ArrayList<>();
        int n = arr.length;
        for(int i =0 ;i<n;i++){
            if(!arr1.contains(arr[i])){
                arr1.add(arr[i]);
            }
        }
        System.out.println(arr1);
    }
}
