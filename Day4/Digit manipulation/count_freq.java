public class count_freq { 
    public static void main(String[] args) { 
      int num = 12432;
      
      for(int i =0 ; i<=9 ;i++){
        int n = num; 
        int count = 0;
        int rem = 0;
        while(n>0){
          rem = n%10;
          if(i==rem) count++;
          n /=10;
        }
        if(count!=0){
          System.out.println(i + " : " + count);
        }
        count =0;
      }

    } 
  }
  