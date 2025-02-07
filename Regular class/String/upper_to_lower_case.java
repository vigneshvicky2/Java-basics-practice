public class upper_to_lower_case{
    public static void main(String[] args) {
        String s ="Hello123";
        System.out.println(convert(s));
    }
    public static String convert(String s) {
       String res ="";
       for(int i =0; i<s.length();i++){
            char temp = s.charAt(i);
            if(temp>='A' &&temp<='Z'){
                res += (char)(temp+32);
            }
            else if(temp>='a' &&temp<='z'){
                res += (char)(temp-32);
            }
            else{
                res+=temp;
            }
       }
        return res;
    }


}