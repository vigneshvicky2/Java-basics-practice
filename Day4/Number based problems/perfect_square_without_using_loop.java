public class perfect_square_without_using_loop {
    public static void main(String[] args) {
        int n = 62;
        int sqrt = (int)Math.sqrt(n);
        if(sqrt*sqrt==n){
            System.out.println("Perfect square");
        }
        else{
            System.out.println("not perfect square");
        }
    }
}
