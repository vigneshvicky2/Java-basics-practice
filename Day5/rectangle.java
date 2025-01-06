import java.util.*;
public class rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int up = n*2-1;
        for(int i = 1; i <=up; i++){
            for(int j = 1; j <= up; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
