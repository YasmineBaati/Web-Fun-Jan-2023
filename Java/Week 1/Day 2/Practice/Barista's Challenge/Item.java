public class Item{
    private String name;
    private double price;

    public Item (String name, double price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return this.name;
    }
    public String SetName(String name){
        return this.name=name;
    }

    public double getPrice(){
        return this.price;
    }
    public double SetPrice(double price){
        return this.price=price;
    }
}