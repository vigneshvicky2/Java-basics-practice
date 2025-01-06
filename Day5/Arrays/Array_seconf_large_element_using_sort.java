
import java.util.*;

public class Array_seconf_large_element_using_sort {
        public static void main(String[] args) {
            int[] arr = {5,6,8,6};
            int n = arr.length;
            Arrays.sort(arr);
            System.out.println("2nd largest number: " +arr[n-2]);
    }
}
