public class panagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        char let =' ';
        String ans1 ="";
        s= s.toLowerCase();
        
        for(int i =0;i<s.length();i++){
            let =s.charAt(i);
            if(let>='a' && let<='z'){
                if(!ans1.contains(String.valueOf(let))){
                    ans1+=let;
                } 
            }
        }
        if(ans1.length()==26){
            System.out.println("panagram");
        }
        else{
            System.out.println("not panagram");
        }
    }
    
}
