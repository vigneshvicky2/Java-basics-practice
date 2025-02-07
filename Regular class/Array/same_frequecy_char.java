public class same_frequecy_char {
    public static void main(String[] args) {
        String str = "abacbcdd";
        String res = "";
		int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int cur_count = 0;
            if (!res.contains(String.valueOf(str.charAt(i)))) {
                res += str.charAt(i);
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        cur_count++;
                    }
                }
                if (i == 0) {
                    count = cur_count;
                }
                if (count != cur_count) {
                    
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");
    }
}
