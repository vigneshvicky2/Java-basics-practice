public class perfect_square {
    public static void main(String[] args) {
        int num =6;
        if(check_square(num)){
            System.out.println("Perfect square");

        }
        else{
            System.out.println("Not a Perfect square");
        }
    }
    public static boolean check_square(int n) {
        for(int i =1;i<=n;i++){
            int sq = i*i;
            if(sq==n){
                return true;
            }
            else if(sq>n){
                return false;
            }
        }
        return false;
    }
}
