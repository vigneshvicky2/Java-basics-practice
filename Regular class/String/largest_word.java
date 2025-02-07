public class largest_word {
   public static void main(String[] args) {
    String s = "i love leetcode";
    String[] arr = s.split(" ");
    int max_len = Integer.MIN_VALUE;
    String ans ="";
    for(int i =0; i<arr.length;i++){
        if(arr[i].length()>max_len){
            max_len=arr[i].length();
            ans =arr[i];
        }
    }
    
    System.out.println(ans);
   } 
}
