public class find_the_missing_number {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1};
        int xor=0;
        for(int a :arr ){
            xor ^=a;
        }
        // for(int i =arr[0]; i<=arr[arr.length-1];i++){  // it will work fot this type of input {7,5,4,}
        //     xor ^=i;
        // }
        for(int i =1; i<=arr.length+1;i++){
            xor ^=i;
        } 
        System.out.println(xor);   
    }
}
