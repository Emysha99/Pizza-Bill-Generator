public class DeluxPizza extends Pizza{
   public DeluxPizza() {
       super();
   }

   @Override
   public void addExtraCheese(){
       this.price+=extraCheesePrice;
   }

  @Override
  public void addExtraTopping() {
       this.price+=extraToppingPrice;
  }
}
