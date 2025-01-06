public class second_largest_element {
    public static void main(String[] args) {
        int[] arr = {0,1,1,2,3};
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>max ){
                int temp = arr[i];
                min = max;
                max=temp;
            }
            else if(arr[i]>min){
                min =arr[i];
            }
    
        }
        System.out.println("2nd Max element: "+min);
    }
    }

