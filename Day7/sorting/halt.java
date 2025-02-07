import java.util.ArrayList;

public class halt {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(is_prime(i)){
                
                if(counter(i,list)){
                    count++;
                    System.out.println(i);
                }
                list.add(i);
            }
        }
        System.out.println(count);

    }

    static boolean is_prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean counter(int n , ArrayList<Integer> list ){
        int count = 0;
        for(int i = 2 ; i< list.size() ; i++){
            count+=list.get(i);
            if(count==n){
                return true;
            }
            else if(count > n){
                return false;
            }
        }
        return false;
    }
}
