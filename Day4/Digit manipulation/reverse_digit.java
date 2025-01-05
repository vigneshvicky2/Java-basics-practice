public class reverse_digit {
    public static void main(String[] args) {
        int n =123;
        int sum =0;
        

        // String s = Integer.toString(n);
        // StringBuilder res = new StringBuilder(s);
        // String ans ="";
        // //System.out.println(res.reverse()); // using string builder


        // for(int i =0;i<s.length();i++){ // using for loop
        //     char ch = s.charAt(i);
        //     ans = ch + ans;
        // }
        // System.out.println(ans);


        int rem; // normal approach
        while(n>0){
            rem=n%10;
            sum = sum*10 + rem; 
            n /=10;
        }
        System.out.println(sum);
    }
}
