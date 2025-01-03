
import java.util.Scanner;

public class verify_age {
    public static void main(String[] args) {
        int age;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter you age: ");
        age = obj.nextInt();
        if(age>=18){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
