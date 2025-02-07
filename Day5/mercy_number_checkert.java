public class mercy_number_checkert{
    public static void main(String[] args) {
        int n = 127;
        for(int i=1;i<=16;i++){
            if((int)(Math.pow(2,i)-1)==n){
                System.out.println("yes");
                return ;
            }
        }
        System.out.println("no");
    }
}
