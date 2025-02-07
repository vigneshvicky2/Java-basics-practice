public class find_odd_occuring_element_in_array {
    public static void main(String[] args) {
        int[] arr ={4,3,6,2,6,4,2,3,4,3,3};
        int xor=0;
        for(int a:arr){
            xor ^=a;
        }
        System.out.println(xor);
    }
}
