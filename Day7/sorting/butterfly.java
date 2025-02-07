public class butterfly {
    public static void main(String[] args) {
        int n =5;
        for(int i = 0 ; i < n ; i++){
            System.out.println("* ".repeat(i)+"  ".repeat(2*(n-1-i))+"* ".repeat(i));
        }
        for(int i = n-2 ; i > 0 ;i--){
            System.out.println("* ".repeat(i)+"  ".repeat(2*(n-1-i))+"* ".repeat(i));
        }
    }
}
