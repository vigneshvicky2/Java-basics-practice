public class facorial {
    public static void main(String[] args) {
        fact(3);
    }
    public static void fact(int n) {
        int sol = 1;
        int i =1;
        while (i <= n) {
            sol = sol * i;
            i++;
    }
    System.out.println(sol);
}
}
