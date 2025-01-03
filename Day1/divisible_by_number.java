import java.util.*;
public class divisible_by_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("both");
        }
        else if(n%3==0 ){
            System.out.println("only 3");
        }
        else if(n%5==0){
            System.out.println("only 5");
        }
        else{
            System.out.println("not both");
        }
    }
}
