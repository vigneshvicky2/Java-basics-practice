import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i =2 ; i < n ; i++){
            if(check(i)){
                primes.add(i);
            }
        }
        System.out.println(primes);
    }
    public static boolean check(int n) {
        boolean check=true;
        for (int i =2 ; i < n ; i++){
            if(n%i==0) {
                check=!check;
                break;
            }
        }
        return check;
    }
}
