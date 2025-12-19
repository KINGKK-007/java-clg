public class Item{

    // static int numOfItems = 0;
    String itemId;
    String name;
    double price;
    int quantity;

    Item(String itemID, String name, double price, int quantity){
        this.itemId = itemID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString(){
        String output = itemId + " " + name + " $" + price + " " + quantity;
        return output;
    }

}