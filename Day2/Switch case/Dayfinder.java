
import java.util.Scanner;

public class Dayfinder{
    public static void main(String[] args) {
        System.out.print("Enter the Day number(1-7): ");
        Scanner s = new Scanner(System.in);
        int day = s.nextInt();
        switch(day){ //rule switch used for without writing break Statement
            case 1 -> System.out.println("Monday"); 
            case 2 -> System.out.println("Tuesday"); 
            case 3 -> System.out.println("Wednesday"); 
            case 4 -> System.out.println("Thursday"); 
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday"); 
            default->System.out.println("Invalid Input");
                  }
    }
}