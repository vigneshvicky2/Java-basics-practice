public class non_repeating {
    public static void main(String[] args) {
        // long st = System.currentTimeMillis();
        String s = "hhello";
        char[] ch = s.toCharArray();
        for(int i =0;i<ch.length;i++){
            int count = 0;
            for(int j = 0; j<ch.length;j++){
                if(s.charAt(i)==ch[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s.charAt(i));
                break;
            }
    }
    // long et = System.currentTimeMillis();
    // System.out.println((et-st) + " ms");

}
public static void simple(String a) {
    // for(int i =0;i<a.length();i++){
    //     int s =  a.indexOf(a.charAt(i))
    // }
    
}
}