public class Receipt {
    public static void main(String[] args) {
        String name = "Stacy" ;
        int apples = 12 ;
        int pineapples = 2 ;
        int rice = 3 ;
        final double RICE_MASS_POUNDS = 4.40925 ;
        // Each bag of rice weighs 2 kilos. 2 kilos is 4.40925 pounds. $1.39 / pound
        double cost = 0.6 * apples + 3.59 * pineapples + 1.39 * rice * RICE_MASS_POUNDS ;
        double averageCost = cost / (apples + pineapples + rice) ;
        double cashTendered = 40.0 ;
        System.out.println("-----------------") ;
        System.out.println("Customer: " + name) ;
        System.out.println("Number of Items: " + (apples + pineapples + rice)) ;
        System.out.println("Total Cost: $" + cost)  ;
        System.out.println("Average Cost: $" + averageCost + " per item") ;
        System.out.println() ;
        System.out.println("Cash tendered: $" + cashTendered) ;
        System.out.println("Change Received: $" + (cashTendered - cost)) ;
        System.out.println("-----------------") ;
    }
}
