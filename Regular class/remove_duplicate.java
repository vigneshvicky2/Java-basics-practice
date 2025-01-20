
public class remove_duplicate{
    public static void main(String[] args) {
        String s = "Hello";
        String res = "";
    for (int i =0; i <s.length() ; i++) {
        String new1 = String.valueOf(s.charAt(i));
        if(!res.contains(new1)){
            res +=s.charAt(i);
        }
    }
    System.out.println(res);
    //System.out.println(simple_apporach("hello"));
    }
    static String simple_apporach(String word) {
        StringBuilder res = new StringBuilder();
        for(char ch : word.toCharArray()){
            if(res.indexOf(String.valueOf(ch))==-1){
                res.append(ch);
            }
        }
        return res.toString();
        
    }
}