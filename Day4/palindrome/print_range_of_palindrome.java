import java.util.*;
public class print_range_of_palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range to print palindrome (starts from 11): ");
        int n = s.nextInt();
        System.out.println();
        for(int i=11;i<=n;i++){{
            if(check(i)){
                System.out.println(i);
            }
        }
        
    }
}
    public static boolean check(int n) {
        int temp = n;
        int rev =0;    
        int rem; 
        while(n>0){
            rem=n%10;
            rev = rev*10 + rem; 
            n /=10;
        }
        if(temp==rev){
            return true;
        }
        else{
            return false;
        }
    }
}
