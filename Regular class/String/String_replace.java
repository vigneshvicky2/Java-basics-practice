public class String_replace {
    public static void main(String[] args) {
        String a ="the ant is a animal";
        String res =" ";
        for(int i = 0;i<a.length();i++){
            a = a.replaceAll("the", "").replaceAll("an", "").replaceAll("a", "");
        }
        System.out.println(a); 
    }
}
