public class element_search {
    public static void main(String[] args) {
        int[] arr = {1,1,0,3};
        int ele = 5;
        if(search(arr,ele)==1){
            System.out.println("Element is present in array");
        }
        else{
            System.out.println("Element is not present in array");
        }
        

    }
    static int search(int[] n,int ele){
        int n1 = n.length;
        for(int i =0;i<n1;i++){
            if(ele==n[i]){
                return 1;
            }
        }
        return 0;
    }
}
