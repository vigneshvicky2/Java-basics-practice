public class x {
    public static void main(String[] args) {
        int n =4;
        if(n%2==0){
            for(int i =0;i<=n;i++){
                for(int j =0;j<=n;j++){
                    if (j==i||j==(n-i)){
                        System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println( );
    }
        }
        else{
            for(int i =1;i<=n;i++){
                for(int j =1;j<=n;j++){
                    if (j==i||j==(n-i+1)){
                        System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println( );
    }
        }
        
}
}
