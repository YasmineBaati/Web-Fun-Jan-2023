import java.util.ArrayList;
public class TestCafe {   
    public static void main(String[] args) {
        double[] items;
        items = new double[4];
        items[0]=12;
        items[1]=15.3;
        items[2]=33.1;
        items[3]=11.2;
        int i=0;
        ArrayList<String> menuItems = new ArrayList<String>();
        ArrayList<String> customers = new ArrayList<String>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");
        CafeUtil Cafe= new CafeUtil();
        int someCafeweeks = Cafe.getStreakGoal(10);
        double someprices = Cafe.getOrderTotal(items);
        customers=Cafe.addCustomer(customers);
        System.out.println(someCafeweeks);
        System.out.println(someprices);
        while(i<menuItems.size()){
            String name = menuItems.get(i);
            System.out.println(i+" "+name);
            i++;
        }
    }
}