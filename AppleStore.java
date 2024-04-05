public class AppleStore {

    public static void main(String[] args) {
        double profit = 0;
        int numOfCustomers = 0;
        int numOfApples = 0;
        double price = 0.40;
        
        // int numOfApples = 500;
        // numOfCustomers = numOfCustomers + 3;
        // numOfApples = numOfApples-(4+20+200);
        // profit = (4+20+200)* price;

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples+=500;

        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples-=4;
        numOfCustomers++;
        profit += 4*price;

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfApples-=20;
        numOfCustomers++;
        profit+= 20*price;

        System.out.println("Another customer walked in. He bought 200 apples!");
        numOfApples-=200;
        numOfCustomers++;
        profit+= 200*price;


  

        System.out.println("Wow! So far, you made: $" + profit);
        System.out.println(numOfCustomers + " customers love your apples");
        System.out.println("You have " + (numOfApples)+ " apples left. We'll sell more tomorrow!");
    }
    
}
