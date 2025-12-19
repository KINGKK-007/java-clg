import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Helper {
    private PrintStream out;

    public Helper(PrintStream out) {
        this.out = out;
    }

    public void print(String message) {
        out.println(message);
    }

    public void displayCart(String customerId, ShoppingCart cart) {
        print("Items in Cart for " + customerId + ":");
        for (Item item : cart.getItems()) {
            print(item.toString());
        }
    }

    public void displayTotalPrice(String customerId, double total) {
        print("Total Price for " + customerId + ": " + total);
    }

    public void displayCustomerInfo(CustomerClass customer) {
        print("Customer Info for " + customer.getCustomerId() + ":\nName: " + customer.getName() + "\nAddress: " + customer.getAddress());
    }

    public void processCommands(Scanner scanner, HashMap<String, CustomerClass> customers, HashMap<String, Item> inventory) {
        while (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            String[] inputs = parseCommand(command);

            switch (inputs[0]) {
                // case "ADD_ITEM":
                //     String itemId = inputs[1];
                //     String name = inputs[2];
                //     double price = Double.parseDouble(inputs[3]);
                //     int quantity = Integer.parseInt(inputs[4]);
                //     Item item = new Item(itemId, name, price, quantity);
                //     inventory.put(itemId, item);
                //     print("Item added to inventory: " + item);
                //     break;

                case "ADD_ELECTRONICS":
                    String itemId = inputs[1];
                    String name = inputs[2];
                    double price = Double.parseDouble(inputs[3]);
                    int quantity = Integer.parseInt(inputs[4]);
                    Electronics item = new Electronics(itemId, name, price, quantity);
                    inventory.put(itemId, item);
                    print("Item added to inventory: " + item);
                    break;

                case "ADD_FASHION":
                    String itemId1 = inputs[1];
                    String name1 = inputs[2];
                    double price1 = Double.parseDouble(inputs[3]);
                    int quantity1 = Integer.parseInt(inputs[4]);
                    Item item1 = new Item(itemId1, name1, price1, quantity1);
                    inventory.put(itemId1, item1);
                    print("Item added to inventory: " + item1);
                    break;

                // case "ADD_CUSTOMER":
                //     String customerId = inputs[1];
                //     String customerName = inputs[2];
                //     String email = inputs[3];
                //     String address = inputs[4];
                //     CustomerClass customer = new CustomerClass(customerId, customerName, email, address);
                //     customers.put(customerId, customer);
                //     print("Customer added: " + customerId + " \"" + customerName + "\" \"" + email + "\" \"" + address + "\"");
                //     break;

                case "ADD_REGULAR_CUSTOMER":
                    String customerId = inputs[1];
                    String customerName = inputs[2];
                    String email = inputs[3];
                    String address = inputs[4];
                    CustomerClass customer = new CustomerClass(customerId, customerName, email, address);
                    customers.put(customerId, customer);
                    // print("Customer added: " + customerId + " \"" + customerName + "\" \"" + email + "\" \"" + address + "\"");
                    print("Customer added: " + customerId + " \"" + customerName);
                    break;

                case "ADD_PREMIUM_CUSTOMER":
                    String customerId1 = inputs[1];
                    String customerName1 = inputs[2];
                    String email1 = inputs[3];
                    String address1 = inputs[4];
                    CustomerClass customer1 = new PremiumCustomer(customerId1, customerName1, email1, address1);
                    customers.put(customerId1, customer1);
                    // print("Customer added: " + customerId1 + " \"" + customerName1 + "\" \"" + email1 + "\" \"" + address1 + "\"");
                    print("Customer added: " + customerId1 + " \"" + customerName1);
                    break;

                case "ADD_TO_CART":
                    customerId = inputs[1];
                    itemId = inputs[2];
                    customer = customers.get(customerId);
                    item = inventory.get(itemId);
                    if (customer != null && item != null) {
                        customer.getCart().addItem(item);
                        print("Item " + itemId + " added to " + customerId + "'s cart");
                    } else {
                        print("Invalid customerId or itemId");
                    }
                    break;

                case "VIEW_CART":
                    customerId = inputs[1];
                    customer = customers.get(customerId);
                    if (customer != null) {
                        displayCart(customerId, customer.getCart());
                    } else {
                        print("Customer not found");
                    }
                    break;

                case "TOTAL_PRICE":
                    customerId = inputs[1];
                    customer = customers.get(customerId);
                    if (customer != null) {
                        double total = customer.getCart().calculateTotal();
                        displayTotalPrice(customerId, total);
                    } else {
                        print("Customer not found");
                    }
                    break;

                case "VIEW_CUSTOMER":
                    customerId = inputs[1];
                    customer = customers.get(customerId);
                    if (customer != null) {
                        displayCustomerInfo(customer);
                    } else {
                        print("Customer not found");
                    }
                    break;

                case "EXIT":
                    scanner.close();
                    return;

                default:
                    print("Invalid command");
            }
        }
    }

    // Helper method to parse commands with quoted strings
    private String[] parseCommand(String command) {
        ArrayList<String> tokens = new ArrayList<>();
        Matcher matcher = Pattern.compile("\"([^\"]*)\"|(\\S+)").matcher(command);
        
        while (matcher.find()) {
            if (matcher.group(1) != null) {
                // Add quoted strings
                tokens.add(matcher.group(1));
            } else {
                // Add unquoted words
                tokens.add(matcher.group(2));
            }
        }
        
        return tokens.toArray(new String[0]);
    }
}
