public class automorphic {
    public static void main(String[] args) {
        int n = 5;
        int squ = n*n;
        int squ_first = squ%10;
        if(squ_first==n){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not Automorphic"); 
        }
    }
    
}
