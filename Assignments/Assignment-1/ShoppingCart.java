import java.util.ArrayList;

public class ShoppingCart{

    private ArrayList<Item> itemList = new ArrayList<Item>();

    void addItem(Item item){
        itemList.add(item);
    }
    void removeItem(String itemID){
        int idx = -1;
        for(int i=0; i<itemList.size(); i++){
            if(itemList.get(i).itemId == itemID){
                idx = i;
            }
        }
        itemList.remove(idx);
    }
    void viewCart(){
        for(Item item : itemList){
            item.toString();
        }
    }
    double calculateTotal(){
        double totalPrice = 0;
        for(Item item : itemList){
            totalPrice += item.price * item.quantity;
        }
        return totalPrice;
    }
    ArrayList<Item> getItems(){
        return itemList;
    }

}