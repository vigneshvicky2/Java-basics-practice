public class recur_fact {
    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }
    public static int fact(int n) {
        if(n<=1){
            return 1;
        }
        else{
          return n*fact(n-1);
        }
    }
}
