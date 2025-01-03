
import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter temp: ");
        int temp = obj.nextInt();
        if(temp>30){
            System.out.println("hot");
        } 
        else if(temp>=20 && temp<=30){
            System.out.println("warm");
        }
        else{
            System.out.println("cold");
        }
    }
}
