public class count_1_to_5{
    public static void main(String[] args) {
        count(1);
    }
    public static void count(int n ) {
        if(n>5){
        return;
      }
      System.out.println(n);
      count(n+1);
        
    }
    
}
