import java.util.*;

public class gift {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int m = s.nextInt();
       int n = s.nextInt();
       int[][] arr = new int[n][2];
       for(int i =0; i<n;i++){
        for(int j =0;j<2;j++){
            arr[i][j]= s.nextInt();
        }
       }
       ArrayList<Integer> ans = new ArrayList<>();
       HashMap<Integer,Integer> map = new LinkedHashMap<>();
       for(int i =0; i<n;i++){
            map.put(arr[i][1],map.getOrDefault(arr[i][1],0)+1);
       }
       for(int i =0; i<n;i++){
        ans.add(arr[i][0]);
        }
       
       int max = 0;
       for(HashMap.Entry<Integer,Integer> a: map.entrySet()){
        if(a.getValue()>max){
            max = a.getKey();}
       }
       int count =0;
       for(int i =0; i<ans.size();i++){
        if(ans.get(i)==max){
            count++;
        }
        
       }
       if(count==0){
        
       }
       System.out.println(max);
       
       
       }
    }

