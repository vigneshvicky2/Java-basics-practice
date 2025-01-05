import java.util.*;
public class strong_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = s.nextLine();
        int ans=0;
        for(char let:num.toCharArray()){
            ans += fact(let -'0');
        } 
        System.out.println("The ans is " +ans);
    }
    
    public static int fact(int n) {
        if(n<=1){
            return 1;
        }
        else{
          return n*fact(n-1);
       
}
}
}