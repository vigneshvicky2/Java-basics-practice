import java.util.Scanner;

public class reverse_array {
    public class input_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<=n-1;i++){
            arr[i] = s.nextInt();
        }
        for(int i =0;i<=n-1;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i] + " " ); 
            }
            
        }
        //System.out.println(Arrays.toString(arr));
    }
}
}
