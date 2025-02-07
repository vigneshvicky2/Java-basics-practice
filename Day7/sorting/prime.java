import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> primes = new ArrayList<>();
        System.out.println(primes);
        int count =0;
        for(int i=2;i<n;i++){
            if(check_prime(i)){
                primes.add(i);
            }
        }
        for(int p:primes){
            if(p>2&&is_con(p,primes)){
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static boolean check_prime(int n) {
        boolean check=true;
        for (int i =2 ; i < Math.sqrt(n) ; i++){
            if(n%i==0) {
                check=!check;
                break;
            }
        }
        return check;
    }
    public static boolean  is_con(int n,List<Integer> primes){
        System.out.println("it is n : "+n);
        int sum =0;
        int srt = primes.indexOf(2);
        for(int i =srt ; i<primes.size();i++){
            sum +=primes.get(i);
            System.out.println("sum :"+sum);
            if(sum ==n){
                return true;
            }
            if(sum >n){
                return false;
            }
        }
        return false;
    }
    
}