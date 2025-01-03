import java.util.Scanner;

public class Bank_application {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Deposite \n2.Withdraw \n3.Check balance");
        int choice = s.nextInt();
        int amount;
        int balance  = 5000;
        switch(choice){
            case 1:
                System.out.print("Enter amount to deposit: ");
                amount = s.nextInt();
                balance +=amount;
                System.out.println("Amount added sucessfully");
                System.out.println("The current balance is: "+balance);
                break;  
            case 2:
            System.out.print("Enter amount to withdraw: ");
            amount = s.nextInt();
            balance -= amount;
            System.out.println("Amount withdraw sucessfull");
            System.out.println("The current balance is: "+balance);
            break;
            case 3:
                System.out.println("Your account balance is: "+ balance);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
