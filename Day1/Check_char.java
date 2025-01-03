import java.util.*;
public class Check_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        String d = sc.nextLine();
        check_my_char(d);
    }
    public static void check_my_char(String c) {
        if(c.charAt(0)>='a' && c.charAt(0)<='z') System.out.println("lowerCase");
        else if(c.charAt(0)>='A' && c.charAt(0)<='Z') System.out.println("UpperCase");
        else if(c.charAt(0)>='0' && c.charAt(0)<='9') System.out.println("Number");
        else System.out.println("invalid input");
    }
}
