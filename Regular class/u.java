public class u{
    public static void main(String[] args) {
        int a = 56;

        // using bitwise and
        if((a&1)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }

        // using xor
        if ((a ^ 1) == a + 1) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}