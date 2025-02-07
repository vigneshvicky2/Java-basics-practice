import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};  //6 5 2 1 4 3
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i<a.length;i++){
            if(i%2==0){
                even.add(a[i]);
            }
            else{
                odd.add(a[i]);
            }
        } 
        int left =0;
        int right = odd.size();
        while(left<right){
            ans.add(odd.get(right-1));
            ans.add(even.get(right-1));
            ans.add(odd.get(left));
            ans.add(even.get(left));
            left++;
            right--;
        }
        ans.remove(ans.size()-1);
        ans.remove(ans.size()-1);
        System.out.println(ans);
    }
}
