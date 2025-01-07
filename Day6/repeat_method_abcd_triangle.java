public class repeat_method_abcd_triangle {
    public static void main(String[] args) {
        int n =5;
        char c = 'A';
        for(int i =1;i<=n;i++){
            System.out.println(String.valueOf(c).repeat(i));
            c++;
        }
    }
}
