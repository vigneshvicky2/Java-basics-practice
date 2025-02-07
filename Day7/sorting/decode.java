import java.util.Stack;

public class decode {
    public static void main(String[] args) {
        String s = "3[a2[ab]]";
        Stack<String> str = new Stack<>();
        // Stack<Integer> num = new Stack<>();
        int n = s.length();

        for(int i = n-1 ; i>0 ;i-- ){
            String s1="";
            if(s.charAt(i)=='['){
                String s2 = str.pop();
                while(s2!="]"){
                    s1+=s2;
                    s2 =str.pop();
                }
                str.push(s1.repeat(s.charAt(i-1)-'0'));
                i--; 
            }
        }
        System.out.println(str.pop());

    }


}
