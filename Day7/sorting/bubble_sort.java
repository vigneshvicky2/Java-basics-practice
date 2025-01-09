import java.util.Arrays;

public class bubble_sort{
    public void main(String[] args){
        int[] arr = {1,2,3,5,2};
        int n = arr.length;
         for(int i =0;i<n-1;i++){
            for(int j =0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}