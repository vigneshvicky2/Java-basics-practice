
import java.util.Scanner;

public class daytime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        if(hour>0 && hour<12){
            System.out.println("morning");
        }
        else if(hour>=12 && hour<16){
            System.out.println("Afternoon");
        }
        else if (hour>24) {
            System.out.println("invaild input");
        }
        else{
            System.out.println("evening");
        }

    }
}
