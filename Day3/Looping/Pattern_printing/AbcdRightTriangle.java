import java.util.*;
public class AbcdRightTriangle {
    public static void main(String[] args) {
        char ch = 'A'; 
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(String.valueOf(ch).repeat(i));  //String.valueOf is used to convert char to string
            ch++; 
        }
    }
}
