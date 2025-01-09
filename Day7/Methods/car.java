public class car { 
    public  void running() {
        System.out.println("car is running");
    }
    public void speed(int n ) {
        System.out.println("car is running at "+n+" km/hr");
    }

   public static void main(String[] args) {
        car obj = new car();
        obj.running();
        obj.speed(50);
    }
}
