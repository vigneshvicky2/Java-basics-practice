// 917. Reverse Only Letters
// Easy
// Topics
// Companies
// Hint
// Given a string s, reverse the string according to the following rules:

// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.
// Return s after reversing it.

 

// Example 1:

// Input: s = "ab-cd"
// Output: "dc-ba"
// Example 2:

// Input: s = "a-bC-dEf-ghIj"
// Output: "j-Ih-gfE-dCba"
// Example 3:

// Input: s = "Test1ng-Leet=code-Q!"
// Output: "Qedo1ct-eeLg=ntse-T!"

import java.util.ArrayList;

public class ap {
    public static void main(String[] args) {
        String a = "ab-cd";
        String ans ="";
        String temp="";
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0; i<a.length();i++){
            if(!Character.isAlphabetic(a.charAt(i))){
                arr.add(i);
            }
        }
        for(int i =a.length()-1; i>=0;i--){
            if(Character.isAlphabetic(a.charAt(i))){
                temp +=a.charAt(i);
            }
        }
        int ind =0;
        int ind_tem=0;
        for(int i =a.length()-1; i>=0;i--){
            if(i==(a.length()-arr.get(ind))-1){
                ans +=a.charAt(arr.get(ind));
                if(ind!=arr.size()-1){
                ind++;
            }
            }
            else{
                ans+=temp.charAt(ind_tem++);
            }    
        }
        System.out.println(ans);
    }
}
