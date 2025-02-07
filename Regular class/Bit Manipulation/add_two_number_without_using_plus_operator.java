public class add_two_number_without_using_plus_operator{
    public static void main(String[] args) {
        int a =5;
        int b = 3;
        while(b!=0){
            int carry = (a&b)<<1;
            a=a^b;
            b=carry;
        }
        
        System.out.println(a);
    }
}
