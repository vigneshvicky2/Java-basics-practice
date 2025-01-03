import java.util.*;
class bye{
    public static void main(String[] args) {
        String name = "sathiyapriyan";
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0 ; i<name.length();i++){
            map.put(name.charAt(i),map.getOrDefault(name.charAt(i),0)+1);
        }
        
    
        for (Map.Entry<Character,Integer> en : map.entrySet()) {
            Object key = en.getKey();
            Object val = en.getValue();
            System.out.println("letter: " +key + " count : " +val);
        
        }
    }
}
