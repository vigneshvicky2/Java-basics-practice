import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean check=true;
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for (int i =2 ; i < n ; i++){
            if(n%i==0) {
                check=!check;
                System.out.println("Not prime");
                break;
            }
        }
        if(check) System.out.println("Prime");
    }
}
