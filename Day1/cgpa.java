import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        int sum = 0;
        Scanner obj1 = new Scanner(System.in);
        
        for (int i =0;i<5 ; i++){
            System.out.print("Enter subject "+ (i+1) + " mark : ");
            sum+=obj1.nextInt();
        }
        double cgpa = (sum/5)/10;
        System.out.println("CGPA : "+cgpa);
    }
}
