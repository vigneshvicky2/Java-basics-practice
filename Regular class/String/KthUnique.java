import java.util.*;

public class KthUnique {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.next();
        }
        int k = s.nextInt();
        HashMap<String, Integer> map = new LinkedHashMap<>();

        for(String a: arr){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        ArrayList<String> arr1 = new ArrayList<>();
        for(HashMap.Entry<String,Integer> m : map.entrySet()){
            if(m.getValue()==1){
                arr1.add(m.getKey());
            }
        }
        if(arr1.size()>=k){
            System.out.println(arr1.get(k-1));
        }
        else{
            System.out.println("-1");
        }
    }
}
