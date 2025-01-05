public class check_all_digits_are_same {
    public static void main(String[] args) {
        int n =155;
        int rem =0;
        int firstnum =n%10;;
        boolean ans = true;
        
        while(n>0){
            rem = n%10;
            if(rem!=firstnum){
                ans = !ans;
                break;
            }
            n /=10;
        }
        if(ans){
            System.err.println("same");
        }
        else{
            System.err.println("not same");
        }
        

    }
    
}
