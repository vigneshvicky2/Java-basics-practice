import java.util.Scanner;

class pizzamaker{
    String size;
    String crust;
    String toppings;
    
    public pizzamaker(String size,String crust,String toppings){
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
    }
    void display(){
        System.out.println("Your pizza size: "+size);
        System.out.println("Your pizza crust: "+crust);
        System.out.println("Your pizza toppings: "+toppings);
    }
}
public class constructor{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a size: ");
        String size =s.nextLine();
        System.out.println("Enter a crust: ");
        String crust = s.nextLine();
        System.out.println("Enter a toppings: ");
        String toppins = s.nextLine();
        pizzamaker obj = new pizzamaker(size,crust,toppins);
        obj.display();
        
    }

}