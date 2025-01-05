import java.util.*;
public class show_largest_smallest_num{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        int min =Integer.MAX_VALUE;
        int max =-1;
        int num;
        while(true){
            System.out.println("Enter a number: ");
            num = s.nextInt();
            if(num>max){
                max = num;
            }
            if (num<min){
                min = num;
            }
            System.out.println("Do you want to continue? (y/n)");
            char ch = s.next().charAt(0);
            if (ch =='n'){
                break;
            }
            else if(ch =='y'){
                
            }
            else{
                System.out.println("invalid input");
                System.exit(0);
            }
        }
        System.out.println("Max: "+max + "\nMin: "+min);
    }
}