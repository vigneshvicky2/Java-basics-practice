
import java.util.LinkedList;
import java.util.Queue;
public class queue{
    public static void main(String[] args) {
         Queue<Integer> st = new LinkedList<>();

        //  String s = "3+2*2";
         st.offer(1);
         st.offer(2);
         System.out.println(st.peek());
         System.out.println(st.isEmpty());
    }
}