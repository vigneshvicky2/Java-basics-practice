public class reverse_a_string {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(reverse(s));
    }
    public static String reverse(String s) {
        String res ="";

        for(int i =s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }

}
