public class CustomerClass{

    private String name;
    private String address;
    private String email;
    String customerID;
    ShoppingCart cart;


    CustomerClass(String customerID, String name, String email, String address){
        this.name = name;
        this.customerID = customerID;
        this.email = email;
        this.address = address;
        cart = new ShoppingCart();
    }

    String getName(){
        return this.name;
    }
    String getCustomerId(){
        return this.customerID;
    }
    String getAddress(){
        return this.address;
    }
    String getEmail(){
        return this.email;
    }
    void viewCustomerInfo(){
        System.out.println("Customer Name: " + this.name + "\nCustomer Address: " + this.address);
    }
    ShoppingCart getCart(){
        return this.cart;
    }

}