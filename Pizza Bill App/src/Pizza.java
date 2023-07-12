import javax.sql.rowset.serial.SQLOutputImpl;

public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingPrice=150;
    private int backPackPrice=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingAdded;
    private boolean isTakeAway;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price=300;
        }else{
            this.price=400;
        }
        this.basePizzaPrice=this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price += extraCheesePrice;

    }
    public void addExtraToppings(){
        isExtraToppingAdded=true;
        this.price+=extraToppingPrice;
    }
    public void takeAway(){
        isTakeAway=true;
        this.price+=backPackPrice;
    }
    public void getBill(){
        String bill="";
        System.out.println("-----------Pizza Palace--------------");
        System.out.println("Pizza:"+this.basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra cheese added:"+extraCheesePrice+"\n";
        }
        if(isExtraToppingAdded){
            bill+="Extra topping added:"+extraToppingPrice+"\n";
        }
        if(isTakeAway){
            bill+="Take away:"+backPackPrice+"\n";
        }
        bill+="Bill:"+this.price+"\n";
        System.out.println(bill);
    }
}
