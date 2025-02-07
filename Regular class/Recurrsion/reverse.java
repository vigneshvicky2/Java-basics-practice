public class reverse {
    public static void main(String[] args) {
        rev_count(5);
    }
    public static void rev_count(int n ) {
        if(n<=0){
        System.out.println("Blastoff!");
        return;
      }
      System.out.println(n);
      rev_count(n-1);
        
    }
}
