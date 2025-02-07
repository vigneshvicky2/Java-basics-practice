public class print_until_lower_case {
    public static void main(String[] args) {
        String s = "String";
        System.out.println(check(s));
    }
    public static String check(String a) {
        String res ="";
        for(int i =0; i<a.charAt(i);i++) {
            char temp = a.charAt(i);
            if(temp>='A' &&temp<='Z'){
                res +=temp;
            }
            // else if(temp>='0' &&temp<='9') {
            //     res +=temp;
            // }
            else{
                break;
            }
        }
        return res;
        
    }

}
