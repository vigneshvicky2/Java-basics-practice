import java.util.Scanner;
public class add_2_number {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter mark 1 ");
        num1 = obj1.nextInt();
        System.out.print("Enter mark 2 ");
        num2 = obj1.nextInt();
        int sum=num1+num2;
        // if((num1+num2)%num1 == 0) ? System.out.println("yes") : System.out.println("no"); 
        if( (sum % num1)==0) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
