public class count_occurence_char {
    public static void main(String[] args) {
        String s = "hello";
        
        check(s);
    }
    public static void check(String a) {
        int left=0;
        int right = Integer.MAX_VALUE;
        try {
            while(left<right){
                a.charAt(left);
                left++;
            }
        } catch (Exception IndexOutOfBouException) {
            System.out.println(left);
        }
        
    }
    public static void simple(String a) {
        int count =0;
        char target ='l';
        for(char t : a.toCharArray()){
            if(t==target){
                count++;
            }
        }
        System.out.println(count);
    }
}
