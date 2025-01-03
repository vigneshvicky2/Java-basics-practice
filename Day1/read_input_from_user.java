import java.util.*;

public class read_input_from_user {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = obj1.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = obj1.nextInt();
        System.out.println("Sum of 2 numbers : " + (num1+num2));
    }
}
