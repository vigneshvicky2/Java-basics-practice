import java.util.Scanner;

public class pass_or_fail {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter mark: ");
        int n = s.nextInt();
        String pass="Pass";
        String fail ="Fail";
        String ans = (n>=60) ? pass : fail; 
        System.out.println(ans);
        // if(n>100) System.out.println("invalid input");
        // if(n>=90 && n<=100) System.out.println("O");
        // else if(n>=80 && n<90) System.out.println("A");
        // else if(n>=70 && n<80) System.out.println("B");
        // else if(n>=60 && n<70) System.out.println("C");
        // else System.out.println("Fail");
    }
}
