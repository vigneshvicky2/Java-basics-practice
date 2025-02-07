
import java.util.Arrays;

public class swap{
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5};
        int ind1 = 2;
        int ind2 =3;
        int temp =0;
        if(ind1>arr.length-1||ind1>arr.length-1){
            System.out.println("Invalid input");
            return;
        }
        for(int i=0; i<arr.length;i++){
            temp = arr[ind1];
            arr[ind1]= arr[ind2];
            arr[ind2]=temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}