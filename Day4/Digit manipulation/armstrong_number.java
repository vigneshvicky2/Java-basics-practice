public class armstrong_number {
    public static void main(String[] args) {
        int n = 153;
        int org = n;
        int temp;
        int temp_count = n;
        int count = 0;
        int sum =0;
        while(temp_count>0){
            temp_count /=10;
            count++;
        }
        while(n>0){
            temp = n%10;
            sum +=Math.pow(temp, count);
            n /=10;
        }
        if (sum==org){
            System.out.println("Amrstong");
        }
        else{
            System.out.println("not armstorng");
        }

    }
    
}
