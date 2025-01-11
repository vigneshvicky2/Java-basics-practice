public class main {
    public static void main(String[] args) {
        String a = "qwer";
        String b = "";
        for(int i = 0 ; i < a.length(); i++){
            int c = a.charAt(i) - 'a';
            int d = 65 + c;
            b += (char)d;
        }
        System.out.println(b);
    }
}
