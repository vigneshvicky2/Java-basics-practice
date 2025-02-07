public class max_lot{
    public static void main(String[] args) {
        double tot = 19,q1 = 3,p1 = 10,q2 = 4,p2 = 15;
        int ans =0;
        int rem =0;
        double p1_va=p1/q1,p2_va=p2/q2;
        System.out.println(p1_va+" "+p2_va);
        if(p1_va<p2_va){
            while (tot!=q2 || tot !=0) { 
                ans +=q1*p1;
                tot -=q1;
                System.out.println(tot);
            }
            
        }
    }
}