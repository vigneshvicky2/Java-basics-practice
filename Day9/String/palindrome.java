public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev ="";
        for(int i =0;i<str.length();i++){
            rev =str.charAt(i) +rev ;
        }
        //System.out.println(rev);
        if(rev.equals(str)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
