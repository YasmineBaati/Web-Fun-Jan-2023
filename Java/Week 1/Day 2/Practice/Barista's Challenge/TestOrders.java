import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 6.3);
        Item item2 = new Item("latte", 5);
        Item item3 = new Item("drip coffee", 4.5);
        Item item4 = new Item("cappuccino", 7);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Application Simulations
        order2.addItem(item1);
        order3.addItem(item1);
        
        order1.SetName("John"); // Set name for order1 to "John"
        order4.SetName("Emily"); // Set name for order4 to "Emily"

        order3.OrderReady();// Set name for order3 to "Guest"
        order2.OrderReady();// Set name for order2 to "Guest"

        order3.getStatusMessage(); 
        order4.getStatusMessage(); 

        System.out.println(order1.getOrderTotal()); 
        System.out.println(order2.getOrderTotal()); 
        System.out.println(order3.getOrderTotal()); 
        System.out.println(order4.getOrderTotal()); 
        order1.display(); 
        order2.display();
        order3.display();
        order4.display();

        
    }
}