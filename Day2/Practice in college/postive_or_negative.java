import java.util.*;
public class postive_or_negative{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else if (num==0){
            System.out.println("equal to zero");
        }
        else{
            System.out.println("Negative");
        }
    }
}