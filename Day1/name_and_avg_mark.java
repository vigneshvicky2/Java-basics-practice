import java.util.Scanner;

public class name_and_avg_mark {
    public static void main(String[] args) {
        String name;
        int sum =0;
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = obj1.nextLine();
        for (int i =0;i<5 ; i++){
            System.out.print("Enter subject "+ (i+1) + " mark : ");
            sum+=obj1.nextInt();
        }
        System.out.print("User name : " + name + " Average mark is: " + sum/5);
    }
}
