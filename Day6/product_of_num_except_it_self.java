import java.util.*;
public class product_of_num_except_it_self {
    public static void main(String[] args) {
        int[] nums = {6,8,2,4};  //[-1,1,0,-3,3] hadles the zero as well
        int n = nums.length;
        int[] ans = new int[n];
        int pro = 1;
        int zeroCount = 0;

        // Calculate the product of all elements and count zeroes
        for (int num : nums) {
            if (num != 0) {
                pro *= num;
            } 
            else {
                zeroCount++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                ans[i] = 0; // More than one zero, all elements in arr2 should be 0
            } 
            else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    ans[i] = pro;
                } 
                else {
                    ans[i] = 0;
                }       // If exactly one zero then only its position gets the product
            } 
            else {
                ans[i] = pro / nums[i]; // No zeroes then divide the total product
            }
        }
        System.out.println(Arrays.toString(ans));
        

    }
}
