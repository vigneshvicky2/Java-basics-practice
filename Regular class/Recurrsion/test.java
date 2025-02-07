public class test {
    public static void main(String[] args) {
        int n =3;
        haed(n);
        tail(n);
    }
    public static void haed(int n) {
        if(n==0) return;
        haed(n-1); 
        System.out.println(n);
        
    }
    public static void tail(int n) {
        if(n==0) return;
        System.out.println(n);
        tail(n-1); 
    }
}
