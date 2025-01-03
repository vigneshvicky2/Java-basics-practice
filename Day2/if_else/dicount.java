import java.util.Scanner;

public class dicount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the price: ");
        int price = s.nextInt();
        double ans;
        double dis;
        System.out.println("Enter a (yes) if you are member otherwise enter (no)");
        String choice = s.nextLine();
        boolean ismember;
        if (choice=="yes"){
            ismember=true;
        }
        else{
            ismember=false;
        }
        
        if (price>500){
            if(ismember){
                dis = price*0.5;
                ans =  price - dis;
                System.out.println(ans);
            }
            else{
                dis = price*0.2;
                ans =  price - dis;
                System.out.println(ans);
            }

        }
    }
}
