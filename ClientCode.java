import ChocolateFactory.chocotype.*;
import ChocolateFactory.factory.*;
import java.util.*;

class ClientCode {
    public ClientCode() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChocolateFactory choco = new ChocolateFactory();

        List<String> chocolates = new ArrayList<>();
        String n = "",m="",p="",q="";
        while (true) {
            System.out.println("Select your chocolate?");
            System.out.println("1. White");
            System.out.println("2. Dark");
            System.out.println("3. Milk");
            System.out.println("4. Organic");

            int choice1 = sc.nextInt();
            switch (choice1) {
                case 1:
                    chocolates.add("White");
                    n = "White";
                    m=n;
                    break;
                case 2:
                    chocolates.add("Dark");
                    n = "Dark";
                    m=m+" "+n;
                    break;
                case 3:
                    chocolates.add("Milk");
                    n = "Milk";
                    m=m+" "+n;
                    break;
                case 4:
                    chocolates.add("Organic");
                    n = "Organic";
                    m=m+" "+n;
                    break;

                default:
                    System.out.println("Please select a valid input!!!");
            }

            System.out.println("Do you want to add more chocolates? (y/n)");
            String choice = sc.next().toLowerCase();
            if (choice.equals("n")) {
                break;
            }
        }
        System.out.println(m);
        List<String> toppings = new ArrayList<>();
        while (true) {
            System.out.println("Select your toppings");
            System.out.println("1. Sugar balls");
            System.out.println("2. Coconut powder");
            System.out.println("3. Nuts");
            System.out.println("4. Choco chips");
            System.out.println("5. Caramel");

            int choice2 = sc.nextInt();

            switch (choice2) {
                case 1:
                    if(m.trim().equals("Dark")){
                        System.out.println("Dark Chocolate doesn't have sugar ball toppings");
                    }else{
                        toppings.add("Sugar balls");
                        p = "Sugar balls";
                        q=p;
                    }
                    break;
                case 2:
                    toppings.add("Coconut powder");
                    p = "Coconut powder";
                    q=q+" "+p;
                    break;
                case 3:
                    toppings.add("Nuts");
                    p = "Nuts";
                    q=q+" "+p;
                    break;
                case 4:
                    toppings.add("Choco chips");
                    p = "Choco chips";
                    q=q+" "+p;
                    break;
                case 5:
                    if(m.trim().equals("Organic")){
                        System.out.println("Organic doesn't have Caramel toppings");
                    }else{
                        toppings.add("Caramel");
                        p = "Caramel";
                        q=q+" "+p;
                    }
                    break;
                default:
                    System.out.println("Please select a valid input!!!");
            }
            System.out.println("Do you want to add more toppings? (y/n)");
            String choice = sc.next().toLowerCase();
            if (choice.equals("n")) {
                break;
            }
        }
        if(chocolates.size()==1 && toppings.size()==1){
            for (String chocoType : chocolates) {
                Chocolate chocolate = choco.createChocolate(chocoType);
                for (String topping : toppings) {
                    chocolate.addChocolateTypeToppings(chocoType, topping);
                }
            }
        }
        else{
            System.out.println("Enjoy your Mix Chocolate "+m+" With Mix Toppings "+q+"!!!");
        }
    }
}
