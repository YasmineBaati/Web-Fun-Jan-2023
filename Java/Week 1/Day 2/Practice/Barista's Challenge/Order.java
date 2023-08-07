import java.util.ArrayList;
public class Order{
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;


    public Order(String name){
        this.name=name;
        this.total=0;
        this.ready=false;
        this.items=new ArrayList<Item>();
    }
    //+++++++++++++++++++++GUETTER && SETTERS++++++++++++++++++++++++++++
    //! ******************Name******************* 
    public String getName(){
        return this.name;
    }
    public String SetName(){
        return this.name="Guest";
    }
    public String SetName(String name ){
        return this.name=name;
    }
    //! ******************Total******************* 
    public double getTotal(){
        return this.total;
    }
    public double SetTotal(double total){
        return this.total+=total;
    }
    //! ******************Ready******************* 
    public boolean getReady(){
        return this.ready;
    }
    public boolean SetReady(){
        if(this.ready){
            return this.ready=false;
        }else{
            return this.ready=true;
        }
    }
    //! ******************items******************* 
    public ArrayList<Item> getItems(){
        return this.items;
    }
    // public ArrayList<Item> SetItems(){
    //     return this.items=["",0];
    // }
    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // *==========add an item===========
    public void addItem(Item item){
        this.items.add(item);
        
    }
    // *===========Change order status========
    public void OrderReady(){
        this.ready=true;
    }
    // *===========Get Message=============
    public void getStatusMessage(){
        if(this.ready){
            System.out.println("Your order is ready.");
        }else{
            System.out.println("Thank you for waiting. Your order will be ready soon.");
        }
    }

     public double getOrderTotal() {
        double total = 0;
        for (Item item : items) {
            this.total+= item.getPrice();
        }
        return total;
    }
    public void display(){
        System.out.printf("Gustomer Name: %s\n  " , this.name);
        for(Item item : items){
           System.out.println( item.getName()+" - "+item.getPrice()); 
        }
        System.out.println("total : " + this.total);
    }


}