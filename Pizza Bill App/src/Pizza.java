import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;

public class Pizza {
    Scanner sn=new Scanner(System.in);
    private char isVeg;
    private char isExtraCheeseAdded;
    private boolean cheeseAdded=false;


    private int price;
    private int extraCheesePrice=100;
    private int extraToppingPrice=150;
    private int backPackPrice=20;
    private int basePizzaPrice;

    private boolean isExtraToppingAdded;
    private boolean isTakeAway;

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

            if (isVeg == 'y' || isVeg == 'Y') {
                this.price+=extraCheesePrice;
                cheeseAdded=true;
            } else if (isVeg == 'n' || isVeg == 'N') {
                break;
            } else {
                System.out.println("Invalid input.Try again.");
            }
        }while(isVeg!='y'&& isVeg!='Y'&& isVeg!='n'&& isVeg!='N');
    }


//    public void addExtraCheese(){
//        isExtraCheeseAdded=true;
//        this.price += extraCheesePrice;
//
//    }
//    public void addExtraToppings(){
//        isExtraToppingAdded=true;
//        this.price+=extraToppingPrice;
//    }
//    public void takeAway(){
//        isTakeAway=true;
//        this.price+=backPackPrice;
//    }
    public void getBill(){
        String bill="";
        System.out.println("Pizza:"+this.basePizzaPrice);
        if(cheeseAdded){
            bill+="Extra cheese added:"+extraCheesePrice+"\n";
        }
//        if(isExtraToppingAdded){
//            bill+="Extra topping added:"+extraToppingPrice+"\n";
//        }
//        if(isTakeAway){
//            bill+="Take away:"+backPackPrice+"\n";
//        }
        bill+="Bill:"+this.price+"\n";
        System.out.println(bill);
    }
}
