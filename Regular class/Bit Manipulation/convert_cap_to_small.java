public class convert_cap_to_small {
    public static void main(String[] args) {
        char a ='a';
        System.out.println(with_one_bit_operation(a));
        System.out.println(with_two_bit_operation(a));
    }
    public static char with_one_bit_operation(char a) {
        return (char) (a^32);
    }
    public static char with_two_bit_operation(char a) {
        char res=' ';
        if(a>='a'&&a<='z'){
            res =(char)(a&~32);// for small to capital
        }
        else if(a>='A'&&a<='A'){
            res =(char)(a|32);// for capital to small
        }
        return res;
        
    }
}
