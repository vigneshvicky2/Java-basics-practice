
import java.util.Scanner;

class Leap_year{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = obj.nextInt();
        // if(year%100==0){
        //  if(year%400==0){
        //     System.out.println("Leap Year");
        //  }
        //  else{
        //     System.out.println("Not a Leap Year");
        //  }
        // }
        // else{
        //     if(year%4==0){
        //         System.out.println("Leap Year");
        //     }
        //     else{
        //         System.out.println("Not a Leap Year"); 
        //     }
        // }
        if ((year%4==0 && year%100!=0)|| year%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap Year");
        }

    }
}