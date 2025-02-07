import java.util.*;
class Chess_board {

    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        String se = "a2";
        // HashMap<Character,Integer> map = new HashMap<>();
        // char a='a';
        // for(int i =1; i<=8;i++){
        //     map.put(a,i);
        //     a++;
        // }
      
            if((se.charAt(0)-'a'+1)%2!=0){
                if(Character.getNumericValue(se.charAt(1))%2!=0){
                    System.out.println("Black"); }
                    else{
                        System.out.println("White");   
                }
                }
                else{
                    if(Character.getNumericValue(se.charAt(1))%2!=0){
                        System.out.println("White"); }
                        else{
                            System.out.println("Black");   
                    }
                }

}}