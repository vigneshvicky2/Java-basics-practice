public class find_pairs {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        int n = arr.length;
        int count_odd=0;
        int count_even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count_even++;
            }
            else{
                count_odd++;
            }
        }
        System.out.println("Even: "+count_even+" Odd count: " +count_odd);
    }
}
