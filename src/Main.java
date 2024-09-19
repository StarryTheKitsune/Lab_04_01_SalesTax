public class Main {
    public static void main(String[] args)
    {
        double purchasePrice = 79.99; // a random value for now
        double salesTax = 0;
        final double TAX_RATE = 0.05;

        salesTax = purchasePrice * TAX_RATE;

        System.out.println("The sales tax on a purchase of $" + purchasePrice + " is $" + salesTax);
    }
}