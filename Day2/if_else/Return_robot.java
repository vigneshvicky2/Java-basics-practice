public class Return_robot {
    public static void main(String[] args) {
        String  n = "UD";
        int x=0;
        int y=0;
        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i)=='U'){
                x++;  
            }
            else if (n.charAt(i)=='D') {
                    x--;
            }
            else if(n.charAt(i)=='L'){
                y++;
            }
            else{
                y--;
            }
    }
    if(x==0 && y==0){
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
    }
}
