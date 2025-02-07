import java.util.ArrayList;
import java.util.Collections;

public class random_string {
    public static void main(String[] args) {
        String s = "i love leetcode";
        String[] arr = s.split(" ");
        ArrayList<String> arr1 = new ArrayList<>();
        for(String a : arr){
            arr1.add(a);
        }
        Collections.shuffle(arr1);
        System.out.println(arr1);

    }
}
