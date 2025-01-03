import java.util.Scanner;

public class Grade_converter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>100) System.out.println("invalid input");
        if(n>=90 && n<=100) System.out.println("O");
        else if(n>=80 && n<90) System.out.println("A");
        else if(n>=70 && n<80) System.out.println("B");
        else if(n>=60 && n<70) System.out.println("C");
        else System.out.println("Fail");
    }
}
