public class odd_or_even{
    public static void main(String[] args) {
        int n =6;
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
        if((n&1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        System.out.println(6&2);
    }
}