import java.util.ArrayList;
public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int some=0;
        int i=1;
        while(i<=numWeeks){
            some+=i;
            i++;
        }
        return some;
    }
    public double getOrderTotal(double[] prices){
        int someprices=0;
        for(int i=0;i<prices.length;i++){
            someprices+=prices[i];
        }
        return someprices;
    }
    public ArrayList addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, "+ userName);
        int many=customers.size();
        System.out.println("There are " + (many+1) + " people in front of you");
        customers.add(userName);
        for(int i=0;i<customers.size();i++){
            System.out.println(customers.get(i));
        }
        return customers;
    }
}