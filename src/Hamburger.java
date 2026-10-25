public class Hamburger {

    private String burgerType;
    private String price;
    private String toppings;



    public String hamBurger() {
        double priceHam = 7.0;
        System.out.printf("You have purchased an Ham burger of £%.2f%n", priceHam);
        this.price += priceHam;
        return "";
    }

    private String cheeseBurger() {
        double priceCheese = 7.0;
        System.out.printf("You have purchased a Cheese burger of £%.2f%n", priceCheese);
        this.price += priceCheese;
        return "";
    }
}
