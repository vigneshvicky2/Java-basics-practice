
import java.util.ArrayList;

public class intersection_of_arr {
    public static void main(String[] args) {
        int[] num1={3,1,2,6,7,8};
        int[] num2 = {15,16,54,2,6,7,8};
        ArrayList<Integer> fin_arr= new ArrayList<>();
        for(int i =0;i<num1.length;i++){
            for(int j =0;j<num2.length;j++){
                if(num1[i]==num2[j] && !fin_arr.contains(num1[i])){
                    fin_arr.add(num1[i]);
                }
        }
    }
    System.out.println(fin_arr);
}
}
