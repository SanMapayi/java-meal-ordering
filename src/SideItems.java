import java.util.InputMismatchException;
import java.util.Scanner;

public class SideItems {

    private String type;
    private double price;

    public  SideItems (String type) {
        this.type = type;
        this.price = 0;
    }

    public void OrderFries() {
        double price = 4.30;
        System.out.printf("This is the price for the default order £%.2f %n ", price);
        this.price += price;
    }

    public double getPrice() {
        System.out.printf("The total price of price is %.2f%n", price);
        return price;
    }

    public void orderedVeges() {
        double price = 3.42;
        System.out.printf("The veges has been ordered for £%.2f %n", price);
        this.price += price;
    }


    @Override
    public String toString() {
        return "SideItems{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    private void orderedPotatoes() {
        double price = 1.20;
        this.price += price;
        System.out.printf("The potato is added to cart at price £%.2f%n ", price);
    }

    public void sideItemsOrder() {
        if (type.equalsIgnoreCase("default")) {
            OrderFries();
        }
        else {
            chooseSideItems ();
        }


    }
    private void chooseSideItems () {
        while (true) {
            System.out.println("Do you want to order a side items, Enter \"Y\" for Yes " +
                    "and \"N\" for No");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if ("Nn".contains(answer)) {
                System.out.println("The user does not want a side item");
                break;
            }
            else if ("Yy".contains(answer)) {
                selectSides ();
                break;
            }
        }
    }
    private void selectSides () {
        double numAnswer = 0;
        boolean potatoIsOrdered;
        boolean vegetableIsOrdered;
        boolean potatoAndVegetableOrdered;
        Scanner num = new Scanner(System.in);
        do {
            System.out.println("""
                    Press 1 for potatoes only\s
                    Press 2 for Veges only\s
                    Press 3 for both veges and potato""");
            try {
                numAnswer = num.nextDouble();
                if (numAnswer != 1 && numAnswer !=2 && numAnswer !=3) {
                    System.out.println("Please enter a number between 1, 2, and 3");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Pleas enter a valid Number " + e);
                num.next();
            }

            potatoIsOrdered = numAnswer == 1;
            vegetableIsOrdered = numAnswer == 2;
            potatoAndVegetableOrdered = (numAnswer == 3);
        } while (!(potatoIsOrdered || vegetableIsOrdered || potatoAndVegetableOrdered));

        if (potatoIsOrdered) orderedPotatoes();
        else if (vegetableIsOrdered) orderedVeges();
        else {
            orderedVeges();
            orderedPotatoes();
        }
    }
}
