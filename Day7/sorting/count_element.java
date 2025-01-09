public class count_element {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,-1,-2};
        int count;
        int n = arr.length;
        for(int i =0;i<n;i++){
            count=1;
            if(arr[i]== Integer.MIN_VALUE) {
                continue;
            }
            for(int j=i+1; j<n;j++){
                if(arr[i]==arr[j] ){
                    count++;
                    arr[j]=Integer.MIN_VALUE;
                }
            }
            System.out.println(arr[i]+" -> "+ count);
            
        }
    }
}
