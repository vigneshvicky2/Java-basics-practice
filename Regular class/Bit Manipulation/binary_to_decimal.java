public class binary_to_decimal {
    public static void main(String[] args) {
        String num ="011"; //3
        int n =0b011;
        System.out.println(n); // direct conversion
        String_to_dec(num);
    }
    public static void String_to_dec(String num) {
        int ans =0;
        int p =0;
        for(int i =num.length()-1; i>=0;i--){
            if(num.charAt(i)=='1'){
                ans+=Math.pow(2,p);
            }
            p++;
        }
        System.out.println(ans);
    }


}
