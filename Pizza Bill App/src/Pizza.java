import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;

public class Pizza {
    Scanner sn=new Scanner(System.in);
    int basePizzaPrice;
    int price;//total price
    int extraCheesePrice=100;
    int extraToppingPrice=150;
    int backPackPrice=20;
    char isVeg;
    char isExtraCheeseAdded;
    boolean cheeseAdded=false;
    char isExtraToppingAdded;
    boolean toppingAdded=false;
    char isTakeAway;
    boolean takeAway=false;
    public void setBasePizzaPrice() {
        do {
            System.out.print("Do you want a veg pizza?(y/n) : ");
            isVeg = sn.nextLine().charAt(0);

            if (isVeg == 'y' || isVeg == 'Y') {
                basePizzaPrice = 300;
            } else if (isVeg == 'n' || isVeg == 'N') {
                basePizzaPrice = 400;
            } else {
                System.out.println("Invalid input.Try again.");
            }
            this.price=this.basePizzaPrice;
        }while(isVeg!='y'&& isVeg!='Y'&& isVeg!='n'&& isVeg!='N');
    }

    public void addExtraCheese() {
        do {
            System.out.print("Do you want to add cheese?(y/n) : ");
            isExtraCheeseAdded = sn.nextLine().charAt(0);
            if (isExtraCheeseAdded == 'y' || isExtraCheeseAdded == 'Y') {
                this.price+=extraCheesePrice;
                cheeseAdded=true;
            } else if (isExtraCheeseAdded == 'n' || isExtraCheeseAdded == 'N') {
                break;
            } else {
                System.out.println("Invalid input.Try again.");
            }
        }while(isExtraCheeseAdded!='y'&& isExtraCheeseAdded!='Y'&& isExtraCheeseAdded!='n'&& isExtraCheeseAdded!='N');
    }

    public void addExtraTopping() {
        do {
            System.out.print("Do you want to add toppings?(y/n) : ");
            isExtraToppingAdded = sn.nextLine().charAt(0);
            if (isExtraToppingAdded == 'y' || isExtraToppingAdded == 'Y') {
                this.price+=extraToppingPrice;
                toppingAdded=true;
            } else if (isExtraToppingAdded == 'n' || isExtraToppingAdded == 'N') {
                break;
            } else {
                System.out.println("Invalid input.Try again.");
            }
        }while(isExtraToppingAdded!='y'&& isExtraToppingAdded!='Y'&& isExtraToppingAdded!='n'&& isExtraToppingAdded!='N');
    }

    public void takeAway() {
        do {
            System.out.print("Are you planning to take away?(y/n) : ");
            isTakeAway = sn.nextLine().charAt(0);
            if (isTakeAway == 'y' || isTakeAway == 'Y') {
                this.price+=backPackPrice;
                takeAway=true;
            } else if (isTakeAway == 'n' || isTakeAway == 'N') {
                break;
            } else {
                System.out.println("Invalid input.Try again.");
            }
        }while(isTakeAway!='y'&& isTakeAway!='Y'&& isTakeAway!='n'&& isTakeAway!='N');
    }


    public void getBill(){
        String bill="";
        System.out.println("\nThis is your bill.Enjoy your order");
        System.out.println("------------------------------------------");
        System.out.println("Pizza:"+this.basePizzaPrice);
        if(cheeseAdded){
            bill+="Extra cheese added:"+extraCheesePrice+"\n";
        }
        if(toppingAdded){
            bill+="Extra topping added:"+extraToppingPrice+"\n";
        }
        if(takeAway){
            bill+="Take away:"+backPackPrice+"\n";
        }
        bill+="Bill:"+this.price+"\n";
        System.out.println(bill);
    }
}
