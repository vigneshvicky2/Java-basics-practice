public class odd_triangle {
    public static void main(String[] args) {
        int i,j;
        int row =5;
        for(i =1;i<=row;i++){
            for(j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=(2*i -1);k++){
                System.out.print("*");
        }
        System.out.println();
    }
}
}
