public class sum_of_even_and_odd {
    public static void main(String[] args) {
        int start =1;
        int end = 50;
        int even =0;
        int odd=0;
        do { 
            if(start%2==0){
                even +=start;
            }
            else{
                odd += start;
            }
            start++;
        } while (start<=end);
        System.out.println("Even sum is: " +even + "\nOdd sum is: "+odd);
    }
}
