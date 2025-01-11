public class anagram {
    public static void main(String[] args) {
        String s ="hello";
        String s1 ="ohlle";
        int sum1 =0;
        int sum2 = 0;
        if(s.length()!=s1.length()){
            System.out.println("not anagram");
            System.exit(1);}

        for(int i =0; i<s.length();i++){
            sum1 += s.charAt(i);
            sum2 += s1.charAt(i); 
        }

        if(sum1==sum2){
            System.out.println("anagram");
        }
        
        else{
            System.out.println("not anagram");
        }
        }

    }
