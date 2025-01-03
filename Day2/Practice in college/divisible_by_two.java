import java.util.Scanner;

public class divisible_by_two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = s.nextInt();
        if(num%2==0){
            if(num%3==0){
                System.out.println("It is divisible by both 2 and 3");
            }
            else{
                System.out.println("It is divisible by 2 only");
            }
        }
        else{
            System.out.println("It not divisible by both 2 and 3");
        }
    }
}
