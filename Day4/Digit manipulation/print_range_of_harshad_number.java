public class print_range_of_harshad_number {
    public static void main(String[] args) {
        for(int i =1;i<=100;i++){
            if(check_harshad(i)){
                System.out.println(i);
            }
        }
            //check_harshad(36);
    }

    public static boolean  check_harshad(int n) {
        int num = n;
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num /=10;
        }
        if (n%sum==0) {
            //System.out.println("Yes harshad number"); 
            return true;
        }
            
        else{
            //System.out.println("No Harshad number");
             return false;
        }
    }
}
