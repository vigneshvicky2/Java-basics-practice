public class find_min_and_max_of_tow_number {
    public static void main(String[] args) {
        int n =15;
        int n1=10;
        min(n,n1);
        max(n,n1);
    }
    public static void min(int n1,int n2) {

        System.out.println(n2+((n1-n2)&(n1-n2)>>31));
        // if(n1>n2){
        //     int temp =n1;
        //     n1=n2;
        //     n2=temp;
        // }
        // int n3 = n1+((n1-n2)^(n1-n2));
        // System.out.println(n3);
    }
    public static void max(int n1,int n2) {
        System.out.println(n1-((n1-n2)&(n1-n2)>>31));
        // if(n1>n2){
        //     int temp =n1;
        //     n1=n2;
        //     n2=temp;
        // }
        // int n3 = n2+((n1-n2)^(n1-n2));
        // System.out.println(n3);
    }
}

