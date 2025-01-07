public class unique_element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,4,4,6,6,7};
        int count = 0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
    }
    System.out.println(n-count);
}
}
