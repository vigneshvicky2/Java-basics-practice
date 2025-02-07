public class modify_string {
    public static void main(String[] args) {
        String str = "HELLO";
        StringBuilder res = new StringBuilder();
        for(char ch :  str.toCharArray()){
            if(isvow(ch)){
                res.append("*");
            }
            else{
                res.append("#");
            }
        }
        System.out.println(res.toString());
        //System.out.println(simple("HELLO"));
    }
    public static String simple(String word) {
        for(char ch :  word.toCharArray()){
            if(isvow(ch)){
                word = word.replace(String.valueOf(ch),"*");
            }
            else{
                word = word.replace(String.valueOf(ch),"#");
            }
        }
        return word;
    }
    public static boolean  isvow(char c) {
        String vow = "AEIOUaeiou";
        if(vow.contains(String.valueOf(c))){
            return true;
        }
        return false;
    }
        
    
}
