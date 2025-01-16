public class tri_perfect {
    public static void main(String[] args) {
        int num = 523776;
        int sum =0;
        for(int i =1;i<=num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num*3){
            System.out.println("Tri-perfect");
        }
        else{
            System.out.println("Not-tri_perfect");
        }
    }
}
