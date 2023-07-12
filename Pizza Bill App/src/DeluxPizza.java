public class DeluxPizza extends Pizza{
    public DeluxPizza(Boolean veg) {
        super(veg);
        //by default cheese and topping are added to the delux pizza
        super.addExtraCheese();
        super.addExtraToppings();
    }
    //restricting addExtraCheese() and addExtraTopping() functions to the user

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraToppings() {}
}
