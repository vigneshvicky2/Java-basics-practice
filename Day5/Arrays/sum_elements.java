public class sum_elements {
    public static void main(String[] args) {
        int[] arr = {1,1,0,3};
        int n = arr.length;
        int sum=0;
        for(int i =0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
