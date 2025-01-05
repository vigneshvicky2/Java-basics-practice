public class sum_digit {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        // String sum = Integer.toString(n); //simpler apporoach
        // System.out.println(sum.length());
        while(n>0){
            sum+=n%10;
            n /=10;
        }
        System.out.println(sum);
    }
}
