public class multiply_divide {
    public static void main(String[] args) {
        int num =16;
        int mul =16<<1;
        int div = 16>>1;
        decima_to_binary(mul);
        decima_to_binary(div);

    }
    public static void decima_to_binary(int b) {
        StringBuilder a = new StringBuilder(); 
        int rem=0;
        while(b!=0){
            rem = b%2;
            a.append(rem);
            b/=2;
        }
     System.out.println(a.reverse().toString());
        
    }
}
