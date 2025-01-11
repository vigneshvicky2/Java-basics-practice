public class trapping_rain_water {
    public static  int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int lmax = Integer.MIN_VALUE;
        int rmax = Integer.MIN_VALUE;
        int ans =0;
        while(left<right){
            lmax = Math.max(lmax,height[left]);
            rmax =Math.max(rmax,height[right]);
            if(lmax<rmax){
                ans +=lmax-height[left++];
            } 
            else{
                ans +=rmax-height[right--];
            }
        }
        return ans;    
    }
    public static void main(String[] args) {
        int[] water = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(water));
    }
}