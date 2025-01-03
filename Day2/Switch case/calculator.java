import java.util.*;
public class switch_case {
    public static void main(String[] args) {
        //input for calculator
        Scanner s = new Scanner(System.in);
        System.out.println("Enter which operation do you want (+,-,/,*): ");
        Character c = s.next().charAt(0);
        System.out.print("Enter num1: ");
        double num1 = s.nextDouble();
        System.out.print("Enter num2: ");
        double num2 = s.nextDouble();

        switch(c){
            case '+'-> System.out.print("Answer 0f Adition is: " + (num1+num2));
            case '/'-> System.out.print("Answer 0f Division is: " + (num1/num2));
            case '*'-> System.out.print("Answer 0f Multiplication is: " + (num1*num2));
            case '-'-> System.out.print("Answer 0f Subraction is: " + (num1-num2));
            default -> System.out.println("invaild input");
        }


    }
    
}


