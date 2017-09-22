package assignment2;

import java.util.HashMap;

/* use Hashmap to record the data
 */

public class Q5Customer {
    String name;
    HashMap<Q4Pizza, Integer> pizzasOrdered;

    public static void main(String[] args) {
        Q5Customer Peter = new Q5Customer("Peter");
        Peter.order("Gourmet", 1);
        Peter.order("MexicanGreenWave", 2);
        Peter.order("PeppyPaneer", 3);
        double sum = Peter.totalMoneySpent();
        System.out.println(sum);
    }

    private double totalMoneySpent() {
        double sum = 0.0;
        for (Q4Pizza pizza : pizzasOrdered.keySet()) {
            sum = sum + pizza   .unitPrice * pizzasOrdered.get(pizza);
        }
        return sum;
    }

    private Q5Customer(String name) {
        this.name = name;
        this.pizzasOrdered = new HashMap<>();
    }

    private void order(String type, int number) {
        pizzasOrdered.put(new Q4Pizza(type), number);
    }
}