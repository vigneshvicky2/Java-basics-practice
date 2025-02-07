import java.util.*;
public class String_comperssion{
    public static void main(String[] agr){
        Scanner scan = new Scanner(System.in); 
        String s = scan.nextLine();
        if(s.length()==1) System.out.println(s);
        int count = 1 ;
        for(int i = 0 ; i < s.length()-1 ; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else if(s.charAt(i)!=s.charAt(i+1)){
                    System.out.print(s.charAt(i)+String.valueOf(count));
                    count=1;
            }
        }
            System.out.print(s.charAt(s.length()-1)+""+count);
    }
}