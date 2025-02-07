public class merging_string {
    public static void main(String[] args) {
        String a1="ab";
        String b1="ccde";
        String res="";
        int max= Math.max(a1.length(), b1.length());  //using for loop
        for(int i=0; i<max;i++){
            if(i<a1.length()){
                res +=a1.charAt(i);
            }
            if(i<b1.length()){
                res +=b1.charAt(i);
            }
        }
        System.out.println(res);
    }
}
