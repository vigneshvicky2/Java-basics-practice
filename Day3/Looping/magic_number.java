import java.util.Scanner;

public class magic_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int magic_num = 100;
        boolean flag = true;
        while(flag){
            System.out.println("Enter a number: ");
            int user_num = s.nextInt();
            if(user_num>magic_num){
                System.out.println("too high");
                // continue; no need 
            }
            else if (user_num<magic_num) {
                System.out.println("too low");
                // continue; no need
            }
            else{
                System.out.println("You got a magic number: "+user_num);
                flag = !flag;
            }
        }
    }
}
