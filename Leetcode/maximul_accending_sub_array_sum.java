public class maximul_accending_sub_array_sum{
    public static void main(String[] args) {
        int[] nums = {10,20,30,5,10,50};
        System.out.println(maxAscendingSum(nums));
    }
    public static int maxAscendingSum(int[] nums) {
        int left =1;
        int right=nums.length;
        int sum =nums[0];
        int max = nums[0];
        while(left<right){
            if(nums[left]>nums[left-1]){
                sum+=nums[left];
                max = Math.max(max,sum);
            }
            else{
                sum =nums[left];
            }
            left++;
        }
        return max;
    }
}