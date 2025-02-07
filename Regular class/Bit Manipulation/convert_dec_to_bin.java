public class convert_dec_to_bin{
     public static void main(String[] args) {
        int a =20;
    //     String b ="";  
    //     int rem=0;
    //     while(a!=0){
    //         rem = a%2;
    //         b+=rem;
    //         a/=2;
    //     }
    //   String ans ="";
    //   for(int i =b.length()-1;i>=0;i--){
    //     ans+=b.charAt(i);
    //   }
    //  System.out.println(ans);
     using_Stringbuilder(a);
    }
    public static void using_Stringbuilder(int b) {
        StringBuilder a = new StringBuilder(); 
        int rem=0;
        while(b!=0){
            rem = b%2;
            a.append(rem);
            b/=2;
        }
     System.out.println(a.reverse().toString());
        
    }
}
