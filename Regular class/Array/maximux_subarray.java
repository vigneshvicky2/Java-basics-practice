import java.util.*;
public class maximux_subarray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,-2,5};
        int sum =0;
        int res = Integer.MIN_VALUE;
        int fin =0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i =0; i<arr.length;i++){
            sum+=arr[i];
            if(res<sum){
                res = sum;
            }
            if(sum<0){
                sum =0;
            }  
        }

        for (int i = 0; i < arr.length; i++) {
            fin =0;
            // int start =i;
         for(int j =i;j<arr.length;j++){
                fin+=arr[j];
                // int end = j;
                if(fin == res){
                    for(int k=i;k<=j;k++){
                        list.add(arr[k]);
                    }
                    break;
                }
         }   
        }
        System.out.println("Maximux sum : " +res);
        System.out.println("Subarray is : "+ list);
    }
}
