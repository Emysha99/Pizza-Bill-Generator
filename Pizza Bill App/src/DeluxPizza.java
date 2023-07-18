public class DeluxPizza extends Pizza{
   public DeluxPizza() {
       super();
       //by default cheese and topping are added to the delux pizza
      super.addExtraCheese();
      super.addExtraTopping();
  }
  //restricting addExtraCheese() and addExtraTopping() functions to the user

   @Override
   public void addExtraCheese() {}

  @Override
  public void addExtraTopping() {}
}
