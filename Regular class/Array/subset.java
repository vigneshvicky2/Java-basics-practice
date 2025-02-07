public class subset {
   public static void main(String[] args) {
    int[] arr1 ={2,4,5,6,7};
    int[] arr2 = {4,7,2,6};
    int count =0;
    for(int i =0;i<arr1.length;i++){
        for(int j =0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
                count++; 
            }
        }
    }
    if(count==arr2.length){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
   } 
}
