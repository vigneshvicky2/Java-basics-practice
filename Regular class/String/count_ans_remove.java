public class count_ans_remove {
    public static void main(String[] args) {
        String s ="hello";
        System.out.println(remove(s));
        System.out.println(count_vow(s));
    }
    public static String remove(String s) {
        String res ="";
        for(int i =0 ; i<s.length();i++){ 
            if(!isvowel(s.charAt(i))){
                res +=s.charAt(i);
            }
        }
        return res;
        }
        public static boolean  isvowel(char c) {
         c = (c>='A' && c<='Z')? (char) (c+32) : c;
         return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
        }
        public static int count_vow(String s) {
            int count =0;
            for(int i =0 ; i<s.length();i++){ 
                if(isvowel(s.charAt(i))){
                    count++;
                }
            }
            return count;
            }

    } 
