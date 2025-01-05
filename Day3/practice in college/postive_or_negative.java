import java.util.Scanner;

public class postive_or_negative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count_pos =0;
        int count_neg =0;
        int count_zero=0;
        int num;
        while(true){
            System.out.println("Enter a number: ");
            num = s.nextInt();
            if(num>0){
                count_pos++;
            }
            else if (num<0){
                count_neg++;
            }
            else {
                count_zero++;
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
        System.out.println("No of positve: "+count_pos + "\nNo of negative: "+count_neg + "\nNo of zero: "+count_zero);
    }
}
