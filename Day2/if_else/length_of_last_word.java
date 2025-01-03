
import java.util.Arrays;

public class length_of_last_word {
    public static void main(String[] args) {
        String s = "I am good boy  u";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Size: " + arr[arr.length-1].length());
    }
}
