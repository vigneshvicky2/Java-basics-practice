public class uniqelement {
        public static void main(String[] args) {
            int[] arr = {1,2,3,5,5,4,4,6,9,6,7,8,7,8};
            //int[] arrnew = new int[arr.length];
            int count = 0;
            int n = arr.length;
            for(int i =0;i<n;i++){
                for(int j =i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
        }
        System.out.println(n-count);
    }
    }
    
