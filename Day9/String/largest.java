public class largest {
    public static void main(String[] args) {
        String n = "hell0";
        int max = 0;
        for(int i =0;i<n.length();i++){
            char c = n.charAt(i);
            if(c>max){
                max = c;
            }
        }
        System.out.println((char)max);
    }
}
