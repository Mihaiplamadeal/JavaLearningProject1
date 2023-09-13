package md.tekwillacademy.variables;

public class VariablesAndComments {
    public static void main(String[] args) {
        //Declare the variables
//Truth based variables
        boolean isUsed;
        boolean hasBattery;
        boolean isAndroid;
        boolean isBlocked;

        // Char related


        char condition;

        //Numeric
        byte nrOfSimCards;
        short productionYear;

        int numberOfOwners;
        long id;
        float operatingSystem;
        double price;

        //Initialize

        isUsed = false;
        hasBattery = true;
        isAndroid = false;
        isBlocked = false;

        condition = 'A';
        nrOfSimCards = 2;
        productionYear = 2023;
        numberOfOwners = 0;
        id = 5454654654L;
        operatingSystem = 16.16F;
        price = 34500.5;

        System.out.println("The phone is new " + hasBattery);
        System.out.println("The phone price is " + price);
    }
}
