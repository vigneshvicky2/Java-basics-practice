public class swap {
    public static void main(String[] args) {
        int a =3;
        int b =5;
        // a=a+b; //8
        // b=a-b; //3
        // a=a-b;
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println(a+" "+b);
    }
}
