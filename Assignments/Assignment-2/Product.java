public class Product{

    String itemID;
    String name;
    double price;
    int quantity;

    Product(String itemID, String name, double price, int quantity){
        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void addToCart(int q){
        if(this.quantity < q){
            System.out.println("Insufficient Stock Quantity.");
            return;
        }
        this.quantity -= q;
    }

}