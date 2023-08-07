import java.util.ArrayList;
public class TestOrders {

    public static void main(String[] args) {
    
        // Menu items
        Item item1=new Item("mocha",6.3);
        Item item2=new Item("latte",5);
        Item item3=new Item("drip coffee",4.5);
        Item item4=new Item("capuccino",7);



        // Order variables -- order1, order2 etc.
        Order order1= new Order("Cindhuri");
        Order order2= new Order("Jimmy");
        Order order3= new Order("Noah");
        Order order4= new Order("Sam");






        // Application Simulations
        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);
        order4.addItem(item2);
        order1.OrderReady();
        order2.OrderReady();


        
        // Use this example code to test various orders' updates
        System.out.printf("Name1: %s\n", order1.getName());
        System.out.printf("Total1: %s\n", order1.getTotal());
        System.out.printf("Ready1: %s\n", order1.getReady());
        System.out.printf("Name2: %s\n Total2: %2s\n Ready2: %3s \n" , order2.getName(),order2.getTotal(),order2.getReady());
        System.out.printf("Name3: %s\n Total3: %2s\n Ready3: %3s \n" , order3.getName(),order3.getTotal(),order3.getReady());
        System.out.printf("Name4: %s\n Total4: %2s\n Ready4: %3s \n" , order4.getName(),order4.getTotal(),order4.getReady());
        

    }
}