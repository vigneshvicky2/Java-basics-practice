public class largest_ele {
    public static void main(String[] args) {
        int[] arr = {1,1,0,3};
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max element: "+max);
    }
}