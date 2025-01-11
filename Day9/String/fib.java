public class fib{
    public static void main(String[] args) {
        int n = 5;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for(int  i = 0 ; i <= n ; i++){
            if(i==0){
                sum1 = 1;
                System.out.println(1);
            }
            else if(i==1){
                sum2=1;
                System.out.println(1);
            }
            else{
                sum3 = sum1+sum2;
                sum1 = sum2;
                sum2 = sum3;
                

                 System.out.println(sum3);
                // sum+=i;
            }

        }
    }
}