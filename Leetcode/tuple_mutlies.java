import java.util.HashMap;

public class tuple_mutlies{
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,10};
        // int n = arr.length;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i =0; i<n-1;i++){
        //     for(int j =i+1; j<n;j++){
        //         int pro = arr[i]*arr[j];
        //         map.put(pro,map.getOrDefault(pro, 0)+1);
        //     }
        // }
        // System.out.println(map);
        // int count =0;
        // for(int num : map.values()){
        //     count+= 8*comb(num);
        // }
        // System.out.println(count);
        faster_apporoach(arr);
    }
    public static int comb(int n ) {
        int a = (n*(n-1))/2;
        return a;
    }
    public static void faster_apporoach(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int product = nums[i]*nums[j];
                System.out.println("product: "+product);
                System.out.println("before: "+map);
                count+=(map.getOrDefault(product,0)*8);
                System.out.println("count: "+count);
                System.out.println("After1: "+map);
                map.merge(product,1,Integer::sum);
                System.out.println("After2: "+map);
                System.out.println("_________");
            }
        } 
        System.out.println(count);      
    }
}