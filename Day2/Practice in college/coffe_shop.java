import java.util.Scanner;

public class coffe_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int coffee=200;
        int capacino=180;
        int latte=250;
        int black_tea=80;
        boolean check =true;
        while(check){
            System.out.println("1.Coffee: 200\n2.Capacino: 180\n3.Latte: 250\n4.Black_tea: 80\n5.Exit");
            System.out.print("Enter the Number of the food or press 5 to exit: ");
            int key = scanner.nextInt();
            switch(key){
                case 1:
                System.out.print("Enter Quantity of the Food: ");
                int value = scanner.nextInt();
                total +=coffee*value;
                break;
                case 2:
                System.out.print("Enter Quantity of the Food: ");
                value = scanner.nextInt();
                total +=capacino*value;
                break;
                case 3:
                System.out.print("Enter Quantity of the Food: ");
                value = scanner.nextInt();
                total +=latte*value;
                break;
                case 4:
                System.out.print("Enter Quantity of the Food: ");
                value = scanner.nextInt();
                total +=black_tea*value;
                case 5:
                    check = false;
                    System.out.println("Exiting");
            }

        }
        System.out.println("Total price "+total);
    }
}
