public class length_string {
    public static void main(String[] args) {
        String s = "hello";
        int count =0;
        for(char t : s.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
