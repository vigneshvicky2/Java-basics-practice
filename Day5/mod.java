import java.util.Scanner;

public class mod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int up = n*2-1;
        int copy=1;
        for(int i = 1; i <=up; i++){
            for(int j = 1; j <= up; j++){
               if(copy>j){
                System.out.print("- ");
               }
               else if(copy+j>n*2){
                System.out.print("- ");
               }
               else{
                System.out.print("* ");
               }
            }
            if(i<n){
                copy++;
               }
               else{
                copy--;
               }
            System.out.println();
        }
        
    }
}
