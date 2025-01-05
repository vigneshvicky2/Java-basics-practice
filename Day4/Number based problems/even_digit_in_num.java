public class even_digit_in_num{
    public static void main(String[] args) {
        int num = 123;
        int rem;
        int even_sum =0;
        int odd_sum = 0;
        while(num>0){
            rem = num%10;
            if(rem%2==0){
                even_sum +=rem;
            }
            else{
                odd_sum += rem;
            }
            num /=10;
        }
        System.out.println("even sum :" + even_sum + " odd sum: " + odd_sum);
    }
}