import java.util.*;
public class Solution {
    public static void main(String[] args) {
        String[] words1 ={"leetcode","google","chat"};
        String[] words2 = {"o","l"};
        ArrayList<String> ans = new ArrayList<> ();
        for(int i =0; i<words1.length;i++){
            int count =0;
            String word = words1[i];
            for(int j = 0; j<words2.length;j++){
                if(check(word,words2[j].charAt(0))){
                    count++;
                }
            }
            if(count==words2.length){
                ans.add(word);
            }
        }
        System.out.print(ans);
    }
    public static boolean check(String word , char c){
        for(int i =0; i<word.length();i++){
            char ch = word.charAt(i);
            if(ch == c){
                return true;
            }
        }
        return false;
    }
}