
public class ChocolateFactory {
    public ChocolateFactory() {
    }

        public Chocolate createChocolate(String selection) {
            Chocolate chocolate = null;
            switch (selection.toLowerCase()) {
                case "milk":
                    chocolate = new MilkChocolate();
                    break;
                case "dark":
                    chocolate = new DarkChocolate();
                    break;
                case "white":
                    chocolate = new WhiteChocolate();
                    break;
                case "organic":
                    chocolate = new OrganicChocolate();
                    break;
                default:
                    System.out.println("Please select a valid input!!!");
            }
            return chocolate;
        }
  
}