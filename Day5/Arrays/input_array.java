import java.util.Arrays;
import java.util.Scanner;

public class input_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<=n-1;i++){
            arr[i] = s.nextInt();
        }
        for(int i =0;i<=n-1;i++){
            System.out.println(arr[i] ); 
        }
        System.out.println(Arrays.toString(arr));
    }
}
