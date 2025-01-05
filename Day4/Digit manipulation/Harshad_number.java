public class Harshad_number {
    public static void main(String[] args) {
            check_harshad(36);
    }
    public static void check_harshad(int n) {
        int num = n;
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num /=10;
        }
        if (n%sum==0) System.out.println("Yes harshad number");
            
        else System.out.println("No Harshad number");
    }
}
