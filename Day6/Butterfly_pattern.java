public class Butterfly_pattern {
    public static void main(String[] args) {
      int n = 5;
    
      for(int i = 0 ; i < n-1 ; i++){
        for(int j = 0 ; j <= i ; j++){
            System.out.print("* ");
        }
        for(int j = 0 ; j < 2*(n-1-i) ; j++){
            System.out.print("  ");
        }
        for(int j = 0 ; j <= i ; j++){
            System.out.print("* ");
        }
        System.out.println();
      } 

      for(int i = n-1 ; i >=0 ; i--){
        for(int j = 0 ; j <= i ; j++){
            System.out.print("* ");
        }
        for(int j = 0 ; j < 2*(n-1-i) ; j++){
            System.out.print("  ");
        }
        for(int j = 0 ; j <= i ; j++){
            System.out.print("* ");
        }
        System.out.println();
      } 
    }
}