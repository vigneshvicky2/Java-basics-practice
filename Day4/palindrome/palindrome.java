public class palindrome{
    
        public static void main(String[] args) {
            int n =555;
            int temp = n;
            int rev =0;    
            int rem; 
            while(n>0){
                rem=n%10;
                rev = rev*10 + rem; 
                n /=10;
            }
            if(temp==rev){
                System.out.println("Palindrome number");
            }
            else{
                System.out.println("Not a palindrome");
            }
        }
    }
