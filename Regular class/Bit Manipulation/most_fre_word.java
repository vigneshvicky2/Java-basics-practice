import java.util.HashMap;

public class most_fre_word{
    public static void main(String[] args) {
        String a ="i am vignesh vignesh";
        String[] arr = a.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String str :arr){
            map.put(str, map.getOrDefault(str,0)+1);
        }
        int max=0;
        String ans ="";
        for(HashMap.Entry<String,Integer> e : map.entrySet()){
            if(max<e.getValue()){
                max=e.getValue();
                ans =e.getKey();
            }
        }
        System.out.println(ans);
    }
}