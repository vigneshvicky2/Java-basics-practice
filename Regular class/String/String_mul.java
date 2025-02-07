
import java.util.HashMap;

public class String_mul {
    public static void main(String[] args) {
        String s1 ="123";
        String s2 ="2";
        String nums ="123456789";
        int ans1=0;
        int ans2=0; 
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i =0;i<nums.length();i++){
            map.put(nums.charAt(i),i+1);
        }
        map.put('0',0);
        for(int i =0;i<s1.length();i++){
            int temp = map.get(s1.charAt(i));
            ans1 = ans1*10+temp;

        }
        for(int i =0;i<s2.length();i++){
            int temp = map.get(s2.charAt(i));
            ans2 = ans2*10+temp;

        }
        int res = ans1*ans2;
        String fin ="";
        while(res>0){
            int rem = res%10;
            for(HashMap.Entry<Character , Integer> entry : map.entrySet()){
                if(entry.getValue()==rem){
                    fin = entry.getKey()+fin;
                }
            }
            res = res/10;    
        }
        System.out.println(fin);
        
        // int res = Integer.parseInt(s1)*Integer.parseInt(s2);
        // System.out.println(res);
    }
}
