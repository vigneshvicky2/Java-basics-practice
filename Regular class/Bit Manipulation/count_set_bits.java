public class count_set_bits {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(count_set_bit(n));
    }
    public static int count_set_bit(int num) {
        int count=0;
        while(num!=0){
            num = num&(num-1);
            count++;
        }
        return count;
    }
}
