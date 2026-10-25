import java.util.*;

public class Drinks {

    private String type;
    private String size;
    private double price;


    public Drinks (String type, String size) {
        this.type = type;
        this.size = size;
        this.price = 0;
    }

    public Drinks (){
     this.price = 0;
    }

    public void OrderDrinkSelect (){

        List<String> newList = new ArrayList<>();
        newList.add("Large");
        newList.add("Medium");
        newList.add("Small");
        Collections.shuffle(newList);
        drinkType();
        String answer = selectAnswer(newList);

        selectedDrink(answer);

    }

    private String selectAnswer(List<String> newList) {

        String answer = "";
        char answerC = 0;
        String selected = "";
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.printf("Please select the size of drinks you would like: a. %s  b. %s  c. %s   ", newList.get(0)
                        , newList.get(1), newList.get(2));
                answer = sc.nextLine();
                if (answer.length() != 1) {
                    System.out.println("Enter a single character as your answer");

                   // System.out.printf("you have selected %s as your answer  %n", answerC);
                }
                else if (!(answer.equalsIgnoreCase("a") || answer.equalsIgnoreCase("b") ||
                        answer.equalsIgnoreCase("c"))) {
                    System.out.printf("Please enter either a, b or c. You have entered \"%s\" %n", answer);
                }
                else {
                    answerC = answer.toLowerCase().charAt(0);
                }

            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a valid character " + e);
                sc.next();
            }


        } while (!(answerC == 'a' || answerC == 'b'|| answerC == 'c'));


         selected = switch (answerC) {
            case 'a' -> newList.get(0);
            case 'b' -> newList.get(1);
            case 'c' -> newList.get(2);
            default ->  "";
        };
        return selected;
    }

    private String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    private void selectedDrink(String answer) {
        if (answer.equalsIgnoreCase("medium")) {
            double price = 3.00;
            System.out.printf("You have purchased a %s size %s at £%.2f %n", answer, getType(), price);
            this.price += price;
        }
        else if (answer.equalsIgnoreCase("large")) {
            double price = 5.00;
            System.out.printf("You have purchased a %s size %s at £%.2f %n", answer, getType(), price);
            this.price += price;
        }
        else if (answer.equalsIgnoreCase("small")) {
            double price = 2.00;
            System.out.printf("You have purchased a %s size %s at  £%.2f %n", answer, getType(), price);
            this.price += price;
        }
    }


    private String getSize () {
        return size;
    }

    public void orderDrink() {
        selectedDrink(getSize());
    }

    public void drinkType() {
        DrinkType drinkType = new DrinkType();
        drinkType.selectDrinkType();
        type = drinkType.getDrinkType();
    }
    public Drinks getDrinks() {
        return new Drinks();
    }


}
 class DrinkType {

    private String drinkType;

    public void selectDrinkType() {
        int answer = 0;
        do {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("""
                Please set the type of drink you want from the following options :
                1 for Coke.
                2 for Sprite.
                3 for Fanta.""");
                answer = sc.nextInt();
                if (answer != 1 && answer != 2 && answer != 3) {
                    System.out.printf("You have entered the %d. Please enter any of the value below.%n", answer);
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a valid number");
                sc.next();
            }
        } while (!(answer <=3 && answer != 0));
        this.drinkType = switch (answer) {
            case 1 -> "Coke";
            case 2 -> "Sprite";
            case 3 -> "Fanta";
            default -> "";
        };
    }

     public String getDrinkType() {
         return drinkType;
     }



     public void changeDrinkSize() {

     }
 }