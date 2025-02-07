
public class find_xor_tiil_1ton {
    public static void main(String[] args) {
        /// find xor tll n without using xor(^)
        int n =16;
        int rem = n%4; 
        if(rem==0){
            System.out.println(n);
        }
        else if(rem==1){
            System.out.println(1);
        }
        else if(rem==2){
            System.out.println(n+1);
        }
        else{
            System.out.println(0);
        } 
    }
}
