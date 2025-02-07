public class car_sum{
    public static void main(String[] args) {
    int v =200;
    int w =540;
    if(v>w && w%2!=0){
        System.out.println("Invalid Input");
        return;
    } 
    for(int i =0;i<v;i++){
        for(int j =0;j<v;j++){
            int ans = (i*2)+(j*4);
            if(ans==w){
                if(i+j==v){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }   
    }
}