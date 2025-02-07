public class find_the_first_repeating_element_in_an_array {
    public static void main(String[] args) {
        int[] arr ={1,2,2,3,3}; // only works for single unique element
        int res=0;
        for(int i : arr){
            res ^=i;
        }
        System.out.println(res);
    }
}
