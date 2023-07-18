import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        int choice;


        System.out.println("-----------Pizza Palace--------------");
        System.out.println("Hey,Happy customer ! Let's complete your order.");
        System.out.println("Menu :\n1.Base Pizza\n2.Delux Pizza");

        do {
            System.out.print("Enter the number of your choice :");
            choice = sn.nextInt();

            if (choice == 1) {
                Pizza basePizza = new Pizza();
                basePizza.setBasePizzaPrice();
                basePizza.addExtraCheese();
                basePizza.addExtraTopping();
                basePizza.takeAway();
                basePizza.getBill();
            } else if (choice == 2) {
                DeluxPizza dp =new DeluxPizza();
                dp.setBasePizzaPrice();
                dp.takeAway();
                dp.getBill();

            } else {
                System.out.println("Invalid choice.Try again.");
            }
        }while(choice!=1 && choice!=2);











//        DeluxPizza dp =new DeluxPizza(false);
//        dp.takeAway();
//        dp.getBill();
    }


}
