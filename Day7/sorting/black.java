public class black {
    public static int minimumSteps(String s) {
        int n = 0 ;
        int black=0;
        for(char c : s.toCharArray()){
            if(c=='1'){
                black++;
            }
            else{
                n+=black;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(minimumSteps("101"));
    }

}