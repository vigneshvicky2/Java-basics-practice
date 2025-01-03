
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = obj.nextInt();
        System.out.print("Enter B : ");
        int b = obj.nextInt();
        
        int temp = b;
        b =a;
        a=temp;
        System.out.println("A : "+ a +" "+"B : " + b);
    }
}
