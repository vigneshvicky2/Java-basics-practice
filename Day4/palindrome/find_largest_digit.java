public class find_largest_digit {
    public static void main(String[] args) {
        int n =1239978;
        int max =Integer.MIN_VALUE;    
        int rem; 
        while(n>0){
            rem=n%10;
            if(rem>max){
                max=rem;
            } 
            n /=10;
        }
        System.out.println("max value: "+max);
    } 
}
