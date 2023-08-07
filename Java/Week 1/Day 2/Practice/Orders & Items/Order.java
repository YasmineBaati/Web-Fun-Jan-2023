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
    //GUETTER
    public String getName(){
        return this.name;
    }
    public double getTotal(){
        return this.total;
    }
    public boolean getReady(){
        return this.ready;
    }

    public void addItem(Item item){
        this.items.add(item);
        this.total = total + item.price;
    }

    public void OrderReady(){
        this.ready=true;
    }

}