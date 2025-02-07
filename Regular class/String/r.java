public class r{
    public static void main(String[] args) {
        String s1 ="hello";
        String s2 ="lohel";
        s2 = s2.concat(s2);
        if(s2.contains(s1)) System.out.println("true");
        else System.out.println("false");
    }
}