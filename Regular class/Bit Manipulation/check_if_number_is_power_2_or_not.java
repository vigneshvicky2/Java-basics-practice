public class check_if_number_is_power_2_or_not {
    public static void main(String[] args) {
        int num =16;
        if((num&(num-1))==0){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }
    }
}
