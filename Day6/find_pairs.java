public class find_pairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int target = 6;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" + "+arr[j]+" = " +target);
                    //System.out.println(" true");
                    //return;
                    
                }
            }
        }
        //System.out.println("false");
    }
}
