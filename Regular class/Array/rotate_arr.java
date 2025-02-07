import java.util.ArrayList;
import java.util.Arrays;

public class rotate_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        ArrayList<Integer> res = new ArrayList<>();
        for(int l =k+1;l<arr.length;l++){
            if(l<=arr.length-1)
                res.add(arr[l]);
            }
        for(int j =0; j<=k;j++){
                res.add(arr[j]);    
            }   
                //System.out.println(res); 
               int[] fin_arr= using_array(arr,k);
               System.out.println(Arrays.toString(fin_arr));
                
            }
        public static int[] using_array(int[] arr,int k){
            int[] res = new int[arr.length];
            int ind =0;
            for(int l =k+1;l<arr.length;l++){
                if(l<=arr.length-1)
                    res[ind++] = arr[l];
                }
            for(int j =0; j<=k;j++){
                res[ind++] = arr[j];   
                }  
                return res;  
            
        }    
            }
    