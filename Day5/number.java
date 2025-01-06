import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int up = n*2-1;
        int copy=1;
        for(int i = 1; i <=up; i++){
            int num =n;
            for(int j = 1; j <= up; j++){
               if(copy>j){
                System.out.print(num-- + " ");
               }
               else if(copy+j>n*2){
                System.out.print(++num + " ");
               }
               else{
                System.out.print(num+ " ");
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
