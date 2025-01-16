
import java.util.Arrays;

public class number_of_palindrome{
    public static void main(String[] args) {
        String s = "annabelle"; 
        int k = 2;
        if(canConstruct(s, k)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
        public static boolean canConstruct(String s, int k) {
            int odd = 0;
            int n = s.length();
            int[] arr = new int[26];
        
            //count number of odd chars
            for (char c : s.toCharArray()) {
                arr[c - 'a']++;
            }

            //System.out.println(Arrays.toString(arr));
            //count number of odd chars
        
            for (int i : arr) {
                if (i % 2 == 1) odd++;
            }
        
            return odd <= k && k <= n;
    }
}