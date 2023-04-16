

import ChocolateFactory.chocotype.*;
import ChocolateFactory.factory.*;
import java.util.*;

public class ClientCode {
    public ClientCode() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chocolate chocolate = null;
        ChocolateFactory choco = new ChocolateFactory();

        while(true) {
            System.out.println("Select your chocolate?");
            System.out.println("1. White");
            System.out.println("2. Dark");
            System.out.println("3. Milk");
            int choice1 = sc.nextInt();
            String n = "";
            switch (choice1) {
                case 1:
                    chocolate = choco.createChocolate("White");
                    n = "White";
                    break;
                case 2:
                    chocolate = choco.createChocolate("Dark");
                    n = "Dark";
                    break;
                case 3:
                    chocolate = choco.createChocolate("Milk");
                    n = "Milk";
                    break;
                default:
                    System.out.println("Please select a valid input!!!");
            }

            System.out.println("Select your toppings");
            System.out.println("1. Sugar balls");
            System.out.println("2. Coconut powder");
            System.out.println("3. Nuts");
            System.out.println("4. Choco chips");
            int choice2 = sc.nextInt();
            switch (choice2) {
                case 1:
                    chocolate.addChocolateTypeToppings(n, "sugar balls");
                    break;
                case 2:
                    chocolate.addChocolateTypeToppings(n, "Coconut powder");
                    break;
                case 3:
                    chocolate.addChocolateTypeToppings(n, "Nuts");
                    break;
                case 4:
                    chocolate.addChocolateTypeToppings(n, "Choco chips");
                    break;
                default:
                    System.out.println("Please select a valid input!!!");
            }
        }
    }
}
