public class num_to_integer {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int n = 531;
        for(char a : String.valueOf(n).toCharArray()){
            int dig=Character.getNumericValue(a);
            if(n%dig==0){
                System.out.print(dig+" ");
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; 
        System.out.println("Runtime: " + duration + " ms");
    }
}
