
import java.util.Scanner;

public class blood_donation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Required Boold Group: ");
        String str1 = s.nextLine();
        System.out.print("Enter Your Boold Group: ");
        String str2 = s.nextLine();
        if(str1.equals(str2)) {
            System.out.print("Enter Your Age: ");
            int age = s.nextInt();
            System.out.print("Enter Your Weight: ");
            int weight = s.nextInt();
            if(age>=18 && weight >=45){
                System.out.println("You can donate blood");
            }
            else{
                System.out.println("you can't donate blood");
            }
        }
        else{
            System.out.println("you can't donate blood");
        }

        // if(age>=18 && weight >=45 && str1.equals(str2)) System.out.println("You can donate blood"); (one line solution)
        // else System.out.println("you can't donate blood");
    }
}
