public class Fashion extends Product{
    
    String size;

    Fashion(String itemID, String name, double price, int quantity, String size){
        super(itemID, name, price, quantity);
        this.size = size;
    }

}
