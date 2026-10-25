public class MealOrder {
    private boolean isExtraToppings;
    private int countExtraToppings;
    private Hamburger hamburger;
    private SideItems sideItems;
    private Drinks drinks;


    public MealOrder() {
        this.drinks = new Drinks();
        this.hamburger = new Hamburger();
        this.sideItems = new SideItems("");
    }

    public void deluxeBurger() {
        /* all items , drinks , side items and toppings up to 5 are included in the burger price. */
    }


    public void addAdditionalToppings(){

    }
    public void meal() {
        drinks.OrderDrinkSelect();
        sideItems.sideItemsOrder();
        hamburger.hamBurger();


    }

    // print ItemisedList - this would include all prices and the number of toppings.
    // print the total amount of order.
}
